package poset;

import java.math.BigInteger;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Map;

import com.google.protobuf.ByteString;
import com.google.protobuf.Parser;

import common.IProto;
import common.RetResult;
import common.RetResult3;
import common.error;
import node.FlagtableContainer;
import poset.proto.FlagTableWrapper.Builder;

public class Event implements FlagtableContainer {
	EventMessage Message;

	//used for sorting
	long round;
	long lamportTimestamp;
	long roundReceived;
	String creator;
	byte[] hash;
	String hex;

	// NewEvent creates new block event.
	public Event(byte[][] transactions,
			InternalTransaction[] internalTransactions,
			BlockSignature[] blockSignatures,
			String[] parents, byte[] creator, long index,
			Map<String,Long> flagTable) {

		InternalTransaction[] internalTransactionPointers = null;
		if (internalTransactions != null) {
			internalTransactionPointers = new InternalTransaction[internalTransactions.length];
			for (int i = 0; i< internalTransactions.length; ++i) {
				internalTransactionPointers[i] = new InternalTransaction(internalTransactions[i]);
			}
		}

		BlockSignature[] blockSignaturePointers = null;
		if (blockSignaturePointers != null) {
			blockSignaturePointers = new BlockSignature[blockSignatures.length];
			for (int i = 0; i< blockSignatures.length; ++i) {
				blockSignaturePointers[i] = new BlockSignature (blockSignatures[i]);
			}
		}

		EventBody body = new EventBody(
			transactions,
			internalTransactionPointers,
			parents,
			creator,
			index,
			blockSignaturePointers
		);

		Builder builder = poset.proto.FlagTableWrapper.newBuilder();
		if (flagTable!= null) {
			builder.putAllBody(flagTable);
		}
		byte[] ft = builder.build().toByteArray();

		this.Message = new EventMessage();
		this.Message.Body = body;
		this.Message.FlagTable = ft;

		// TODO I added these init
		this.round = -1;
		this.lamportTimestamp = -1;
		this.roundReceived = -1;
		this.creator = null;
		this.hash = null;
		this.hex = null;
	}

	public Event(EventMessage eventMessage) {
		// TBD add stub
		this.Message = new EventMessage();
		this.Message.Body = eventMessage.Body;
		this.Message.FlagTable = eventMessage.FlagTable;

		// TODO I added these init
		this.round = -1;
		this.lamportTimestamp = -1;
		this.roundReceived = -1;
		this.creator = null;
		this.hash = null;
		this.hex = null;
	}

	public Event() {
		// TODO I added these init
		this.Message = null;

		this.round = -1;
		this.lamportTimestamp = -1;
		this.roundReceived = -1;
		this.creator = null;
		this.hash = null;
		this.hex = null;
	}

	public Event(Event ev) {
		// TODO Auto-generated constructor stub
	}

	// Round returns round of event.
	public long Round() {
		if (round < 0) {
			return -1;
		}
		return round;
	}

	public String Creator() {
		if (creator == null || creator.isEmpty()) {
//			creator = String.format("0x%X", Message.Body.Creator);
			creator = crypto.Utils.toHexString(Message.Body.Creator);
		}
		return creator;
	}

	public String SelfParent() {
		return Message.Body.Parents[0];
	}

	public String OtherParent() {
		return Message.Body.Parents[1];
	}

	public byte[][] Transactions() {
		return Message.Body.Transactions;
	}

	public long Index() {
		return Message.Body.Index;
	}

	public BlockSignature[] BlockSignatures() {
		return Message.Body.BlockSignatures;
	}

	//True if Event contains a payload or is the initial Event of its creator
	public boolean IsLoaded() {
		if (Message.Body.Index == 0) {
			return true;
		}

		boolean hasTransactions = Message.Body.Transactions != null &&
			(Message.Body.Transactions.length > 0 ||
					(Message.Body.InternalTransactions != null && Message.Body.InternalTransactions.length > 0));

		return hasTransactions;
	}

	//ecdsa sig
	public error Sign(PrivateKey privKey) {
		RetResult<byte[]> hash2 = Message.Body.Hash();
		byte[] signBytes = hash2.result;
		error err = hash2.err;
		if (err != null) {
			return err;
		}

		RetResult3<BigInteger, BigInteger> sign = crypto.Utils.Sign(privKey, signBytes);
		BigInteger R = sign.result1;
		BigInteger S = sign.result2;
		err = sign.err;
		if (err != null) {
			return err;
		}
		Message.Signature = crypto.Utils.encodeSignature(R, S);
		return err;
	}

	public RetResult<Boolean> Verify() {
		byte[] pubBytes = Message.Body.Creator;
		PublicKey pubKey = crypto.Utils.ToECDSAPub(pubBytes);

		RetResult<byte[]> hash2 = Message.Body.Hash();
		byte[] signBytes = hash2.result;
		error err = hash2.err;
		if (err != null) {
			return new RetResult<Boolean>(false, err);
		}

		RetResult3<BigInteger, BigInteger> decodeSignature = crypto.Utils.DecodeSignature(Message.Signature);
		BigInteger r = decodeSignature.result1;
		BigInteger s = decodeSignature.result2;
		err = decodeSignature.err;
		if (err != null) {
			return new RetResult<Boolean>(false, err);
		}

		return new RetResult<Boolean>(crypto.Utils.Verify(pubKey, signBytes, r, s), null);
	}

	//sha256 hash of body
	public RetResult<byte[]> Hash() {
		if (hash == null || hash.length == 0) {
			RetResult<byte[]> hash2 = Message.Body.Hash();
			byte[] hash = hash2.result;
			error err = hash2.err;
			if (err != null) {
				return new RetResult<byte[]>(null, err);
			}
			this.hash = hash;
		}
		return new RetResult<byte[]>(this.hash, null);
	}

	public String Hex() {
		if (hex == null || hex.isEmpty()) {
			byte[] hash = Hash().result;
//			hex = String.format("0x%X", hash);
			hex = crypto.Utils.toHexString(hash);
		}
		return hex;
	}

	public void SetRound(long r) {
		round = r;
	}

	public void SetLamportTimestamp(long t) {
		lamportTimestamp = t;
	}

	public void SetRoundReceived(long rr) {
		roundReceived = rr;
	}

	public void SetWireInfo(long selfParentIndex, long otherParentCreatorID, long otherParentIndex,
		long creatorID) {
		Message.SelfParentIndex = selfParentIndex;
		Message.OtherParentCreatorID = otherParentCreatorID;
		Message.OtherParentIndex = otherParentIndex;
		Message.CreatorID = creatorID;
	}

	public WireBlockSignature[] WireBlockSignatures()  {
		if (Message.Body.BlockSignatures != null){
			WireBlockSignature[] wireSignatures = new WireBlockSignature[Message.Body.BlockSignatures.length];
			for (int i = 0; i < Message.Body.BlockSignatures.length; ++i) {
				wireSignatures[i] = Message.Body.BlockSignatures[i].ToWire();
			}

			return wireSignatures;
		}
		return null;
	}

	public WireEvent ToWire()  {
		InternalTransaction[] transactions = new InternalTransaction[Message.Body.InternalTransactions.length];

		for (int i = 0; i <Message.Body.InternalTransactions.length; ++i) {
			transactions[i] = Message.Body.InternalTransactions[i];
		}

		WireBody wireBody = new WireBody(
				Message.Body.Transactions,
				transactions,
				WireBlockSignatures(),
				Message.SelfParentIndex,
				Message.OtherParentCreatorID,
				Message.OtherParentIndex,
				Message.CreatorID,
				Message.Body.Index);

		return new WireEvent(
			wireBody,
			Message.Signature,
			Message.FlagTable,
			Message.WitnessProof
		);
	}

	// ReplaceFlagTable replaces flag tabl
	public error ReplaceFlagTable(Map<String,Long> flagTable) {
		FlagTableWrapper ftw = new FlagTableWrapper(flagTable);

		RetResult<byte[]> byteArrayCall = ftw.marshaller().protoMarshal();
		Message.FlagTable = byteArrayCall.result;
		error err = byteArrayCall.err;
		return err;
	}

	// GetFlagTable returns the flag tabl
	public RetResult<Map<String,Long>> GetFlagTable() {
		FlagTableWrapper flagTable = new FlagTableWrapper();
		error err = flagTable.marshaller().protoUnmarshal(Message.FlagTable);
		return new RetResult<Map<String,Long>>(flagTable.Body, err);
	}

	/**
	 * MergeFlagTable returns merged flag table object.
	 * @param dst
	 * @return
	 */
	public RetResult<Map<String,Long>> MergeFlagTable(Map<String,Long> dst) {
		FlagTableWrapper src = new FlagTableWrapper();
		error err = src.marshaller().protoUnmarshal(Message.FlagTable);
		if (err != null) {
			return new RetResult<Map<String,Long>>(null, err);
		}

		src.Body.putAll(dst);
		return new RetResult<Map<String,Long>>(src.Body, err);
	}


	public IProto<Event, poset.proto.Event> marshaller() {
		return new IProto<Event, poset.proto.Event>() {
			@Override
			public poset.proto.Event toProto() {
				poset.proto.Event.Builder builder = poset.proto.Event.newBuilder();
				if (Message != null) {
					builder.setMessage(Message.marshaller().toProto());
				}
				builder.setRound(round)
				.setLamportTimestamp(lamportTimestamp)
				.setRoundReceived(roundReceived);
				if (creator != null) {
					builder.setCreator(creator);
				}
				if (hex != null) {
					builder.setHex(hex);
				}
				if (hash != null) {
					builder.setHash(ByteString.copyFrom(hash));
				}
				return builder.build();
			}

			@Override
			public void fromProto(poset.proto.Event proto) {
				poset.proto.EventMessage msg = proto.getMessage();
				Message = null;
				if (msg != null) {
					Message = new EventMessage();
					Message.marshaller().fromProto(msg);
				}

				round = proto.getRound();
				lamportTimestamp = proto.getLamportTimestamp();
				roundReceived = proto.getRoundReceived();
				creator = proto.getCreator();
				hash = proto.getHash().toByteArray();
				hex = proto.getHex();
			}

			@Override
			public Parser<poset.proto.Event> parser() {
				return poset.proto.Event.parser();
			}
		};
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Message == null) ? 0 : Message.hashCode());
		result = prime * result + ((creator == null) ? 0 : creator.hashCode());
		result = prime * result + Arrays.hashCode(hash);
		result = prime * result + ((hex == null) ? 0 : hex.hashCode());
		result = prime * result + (int) (lamportTimestamp ^ (lamportTimestamp >>> 32));
		result = prime * result + (int) (round ^ (round >>> 32));
		result = prime * result + (int) (roundReceived ^ (roundReceived >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (Message == null) {
			if (other.Message != null)
				return false;
		} else if (!Message.equals(other.Message))
			return false;
		if (creator == null) {
			if (other.creator != null)
				return false;
		} else if (!creator.equals(other.creator))
			return false;
		if (!Arrays.equals(hash, other.hash))
			return false;
		if (hex == null) {
			if (other.hex != null)
				return false;
		} else if (!hex.equals(other.hex))
			return false;
		if (lamportTimestamp != other.lamportTimestamp)
			return false;
		if (round != other.round)
			return false;
		if (roundReceived != other.roundReceived)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Event [Message=").append(Message).append(", round=").append(round).append(", lamportTimestamp=")
				.append(lamportTimestamp).append(", roundReceived=").append(roundReceived).append(", creator=")
				.append(creator).append(", hash=").append(Arrays.toString(hash)).append(", hex=").append(hex)
				.append("]");
		return builder.toString();
	}

	public long CreatorID() {
		return Message.CreatorID;
	}

	public long OtherParentCreatorID() {
		return Message.OtherParentCreatorID;
	}

	public EventMessage getMessage() {
		return Message;
	}

	public long getRound() {
		return round;
	}

	public long getLamportTimestamp() {
		return lamportTimestamp;
	}

	public long getRoundReceived() {
		return roundReceived;
	}

	public String getCreator() {
		return creator;
	}

	public byte[] getHash() {
		return hash;
	}

	public String getHex() {
		return hex;
	}

	public static String rootSelfParent(long participantID) {
		return String.format("Root%d", participantID);
	}
}