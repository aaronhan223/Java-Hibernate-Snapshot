package ut.entity.source.garmin;

import ut.entity.source.BaseSource;

public class EVENT_DARK_PERIOD implements BaseSource {

	public String format() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private boolean has_accuracy;
	private boolean has_altitude;
	private String t0001aaron17;
	private int bearing;
	private int speed;
	private int altitude;
	private String network_location_source;
	private float longitude;
	private int satellites;
	private String provider;
	private float latitude;
	private boolean has_speed;
	private String travel_state;
	private boolean has_bearing;
	private String network_location_type;
	private float accuracy;
	
	public String getT0001aaron17() {
		return t0001aaron17;
	}
	public String getNetwork_location_source() {
		return network_location_source;
	}
	public String getProvider() {
		return provider;
	}
	public String getTravel_state() {
		return travel_state;
	}
	public String getNetwork_location_type() {
		return network_location_type;
	}
	public int getBearing() {
		return bearing;
	}
	public int getSpeed() {
		return speed;
	}
	public int getAltitude() {
		return altitude;
	}
	public int getSatellites() {
		return satellites;
	}
	public boolean getHas_accuracy() {
		return has_accuracy;
	}
	public boolean getHas_altitude() {
		return has_altitude;
	}
	public boolean getHas_speed() {
		return has_speed;
	}
	public boolean getHas_bearing() {
		return has_bearing;
	}
	public float getLongitude() {
		return longitude;
	}
	public float getLatitude() {
		return latitude;
	}
	public float getAccuracy() {
		return accuracy;
	}
}
