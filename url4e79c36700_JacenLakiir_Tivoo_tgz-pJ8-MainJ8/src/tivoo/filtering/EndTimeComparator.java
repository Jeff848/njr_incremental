package tivoo.filtering;

import java.util.Comparator;

import tivoo.Event;

public class EndTimeComparator implements Comparator<Event>{
	private final int coeff;
	
	public EndTimeComparator(boolean reversed){
		this.coeff = reversed ? -1 : 1;
	}

	@Override
	public int compare(Event o1, Event o2) {
		return coeff*o1.getEndTime().compareTo(o2.getEndTime());
	}
	

}
