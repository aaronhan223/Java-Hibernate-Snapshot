package ut.entity.source.garmin;

import java.util.ArrayList;
import java.util.List;

import ut.entity.source.BaseSource;


public class EVENT_BATTERY_LEVEL implements BaseSource {

	public String format() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private ArrayList<Integer> data;
	private long ts;
	
	public long getTs() {
		return ts;
	}
	public ArrayList<Integer> getData() {
		return data;
	}
}
