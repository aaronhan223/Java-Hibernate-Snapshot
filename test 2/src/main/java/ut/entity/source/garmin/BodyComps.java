package ut.entity.source.garmin;

import ut.entity.source.BaseSource;

public class BodyComps implements BaseSource {

	public String format() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("measurementTimeOffsetInSeconds:").append(this.measurementTimeOffsetInSeconds).append(",")
				.append("measurementTimeInSeconds:").append(this.measurementTimeInSeconds).append(",")
				.append("summaryId:").append(this.summaryId).append(",")
				.append("_id:").append(this._id).append(",")
				.append("weightInGrams:").append(this.weightInGrams)
				.append("userAccessToken:").append(this.userAccessToken);
		return sb.toString();
	}
	
	private int measurementTimeOffsetInSeconds;
	private long measurementTimeInSeconds;
	private String summaryId;
	private String _id;
	private int weightInGrams;
	private String userAccessToken;
	
	public int getMeasurementTimeOffsetInSeconds() {
		return measurementTimeOffsetInSeconds;
	}
	public long getMeasurementTimeInSeconds() {
		return measurementTimeInSeconds;
	}
	public int getWeightInGrams() {
		return weightInGrams;
	}
	public String get_id() {
		return _id;
	}
	public String getSummaryId() {
		return summaryId;
	}
	public String getUserAccessToken() {
		return userAccessToken;
	}

}
