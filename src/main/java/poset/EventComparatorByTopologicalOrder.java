package poset;

import java.util.Comparator;

public class EventComparatorByTopologicalOrder implements Comparator<Event> {

	public EventComparatorByTopologicalOrder() {
		// TODO Auto-generated constructor stub
	}

	public int compare(Event o1, Event o2) {
		return Long.compare(o1.Message.TopologicalIndex, o2.Message.TopologicalIndex);
	}
}
