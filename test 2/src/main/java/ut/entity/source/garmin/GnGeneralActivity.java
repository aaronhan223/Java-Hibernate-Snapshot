package ut.entity.source.garmin;

import java.math.BigInteger;

public class GnGeneralActivity {

	private String deviceName;
	private BigInteger startTimeInSeconds;
	private String activityType;
	private long startTimeOffsetInSeconds;
	private long durationInSeconds;
	private int averageHeartRateInBeatsPerMinute;
	private int maxHeartRateInBeatsPerMinute;
	private String _id;
	private String summaryId;
	private String userAccessToken;

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public BigInteger getStartTimeInSeconds() {
		return startTimeInSeconds;
	}

	public void setStartTimeInSeconds(BigInteger startTimeInSeconds) {
		this.startTimeInSeconds = startTimeInSeconds;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public long getStartTimeOffsetInSeconds() {
		return startTimeOffsetInSeconds;
	}

	public void setStartTimeOffsetInSeconds(long startTimeOffsetInSeconds) {
		this.startTimeOffsetInSeconds = startTimeOffsetInSeconds;
	}

	public long getDurationInSeconds() {
		return durationInSeconds;
	}

	public void setDurationInSeconds(long durationInSeconds) {
		this.durationInSeconds = durationInSeconds;
	}

	public int getAverageHeartRateInBeatsPerMinute() {
		return averageHeartRateInBeatsPerMinute;
	}

	public void setAverageHeartRateInBeatsPerMinute(int averageHeartRateInBeatsPerMinute) {
		this.averageHeartRateInBeatsPerMinute = averageHeartRateInBeatsPerMinute;
	}

	public int getMaxHeartRateInBeatsPerMinute() {
		return maxHeartRateInBeatsPerMinute;
	}

	public void setMaxHeartRateInBeatsPerMinute(int maxHeartRateInBeatsPerMinute) {
		this.maxHeartRateInBeatsPerMinute = maxHeartRateInBeatsPerMinute;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getSummaryId() {
		return summaryId;
	}

	public void setSummaryId(String summaryId) {
		this.summaryId = summaryId;
	}

	public String getUserAccessToken() {
		return userAccessToken;
	}

	public void setUserAccessToken(String userAccessToken) {
		this.userAccessToken = userAccessToken;
	}

}
