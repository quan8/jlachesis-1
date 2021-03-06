package node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import common.RetResult;
import common.error;
import peers.Peer;
import poset.Block;
import poset.Event;
import poset.Root;
import poset.RoundInfo;
import poset.Store;

public class Graph {
	Node Node;

	public static class Infos {
		Map<String,Map<String,poset.Event>> ParticipantEvents;
		poset.RoundInfo[] Rounds;
		poset.Block[] Blocks;
		public Infos(Map<String, Map<String, Event>> participantEvents, RoundInfo[] rounds, Block[] blocks) {
			super();
			ParticipantEvents = participantEvents;
			Rounds = rounds;
			Blocks = blocks;
		}
	}


	public Graph(node.Node n) {
		this.Node = n;
	}

	public poset.Block[] GetBlocks() {
		poset.Block[] res;
		ArrayList<Block> blockList = new ArrayList<Block>();

		Store store = Node.core.poset.Store;

	 	for (long blockIdx = 0; blockIdx <= store.LastBlockIndex(); blockIdx++) {
	 		RetResult<Block> getBlock = store.GetBlock(blockIdx);
			Block r = getBlock.result;
			error err = getBlock.err;
	 		if (err != null) {
				break;
			}
	 		blockList.add(r);
		}

	 	res = blockList.toArray(new poset.Block[blockList.size()]);
	 	return res;
	}

	public Map<String,Map<String,Event>> GetParticipantEvents() {
		HashMap<String, Map<String, Event>> res = new HashMap<String,Map<String,Event>>();

		Store store = Node.core.poset.Store;
		peers.Peers peers = Node.core.poset.Participants;

		for (Peer p : peers.getByPubKey().values()) {
			RetResult<Root> getRootCall = store.GetRoot(p.GetPubKeyHex());
			Root root = getRootCall.result;
			error err = getRootCall.err;

			if (err != null) {
				error.panic(err);
			}
			RetResult<String[]> pEventsCall = store.ParticipantEvents(p.GetPubKeyHex(), root.GetSelfParent().GetIndex());
			String[] evs = pEventsCall.result;
			err = pEventsCall.err;
			if (err != null) {
				error.panic(err);
			}

			res.put(p.GetPubKeyHex(), new HashMap<String,poset.Event>());

			String selfParent = String.format("Root%d", p.GetID());

			HashMap<String, Long> flagTable = new HashMap<String,Long>();
			flagTable.put(selfParent, (long) 1);

			// Create and save the first Event
			Event initialEvent = new poset.Event(new byte[][]{},
				new poset.InternalTransaction[]{},
				new poset.BlockSignature[]{},
				new String[]{}, new byte[]{}, 0, flagTable);

			res.get(p.GetPubKeyHex()).put(root.GetSelfParent().GetHash(), initialEvent);

			for (String e : evs) {
				 RetResult<Event> getEvent = store.GetEvent(e);
				Event event = getEvent.result;
				err = getEvent.err;

				if (err != null) {
					error.panic(err);
				}

				String hash = event.Hex();
				res.get(p.GetPubKeyHex()).put(hash, event);
			}
		}

		return res;
	}

	public RoundInfo[] GetRounds() {
		ArrayList<RoundInfo> roundList = new ArrayList<RoundInfo>();
		Store store = Node.core.poset.Store;

		for (long round = 0; round <= store.LastRound(); round++){
			RetResult<RoundInfo> getRound = store.GetRound(round);
			RoundInfo r = getRound.result;
			error err = getRound.err;

			if (err != null || !r.IsQueued()) {
				break;
			}
			roundList.add(r);
		}

		RoundInfo[] res = roundList.toArray(new RoundInfo[roundList.size()]);
		return res;
	}

	public Infos GetInfos()  {
		return new Infos( GetParticipantEvents(), GetRounds(), GetBlocks());
	}

	public Graph NewGraph(Node n) {
		return new Graph(n);
	}
}