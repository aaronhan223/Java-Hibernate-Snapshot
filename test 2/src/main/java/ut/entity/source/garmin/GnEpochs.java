package ut.entity.source.garmin;

import java.math.BigInteger;

public class GnEpochs {

	private BigInteger startTimeInSeconds;
	private long activeTimeInSeconds;
	private float activeKilocalories;
	private float distanceInMeters;
	private String activityType;
	private long startTimeOffsetInSeconds;
	private float met;
	private String intensity;
	private long steps;
	private long durationInSeconds;
	private String _id;
	private float meanMotionIntensity;
	private long maxMotionIntensity;
	private String summaryId;
	private String userAccessToken;
	public BigInteger getStartTimeInSeconds() {
		return startTimeInSeconds;
	}
	public void setStartTimeInSeconds(BigInteger startTimeInSeconds) {
		this.startTimeInSeconds = startTimeInSeconds;
	}
	public long getActiveTimeInSeconds() {
		return activeTimeInSeconds;
	}
	public void setActiveTimeInSeconds(long activeTimeInSeconds) {
		this.activeTimeInSeconds = activeTimeInSeconds;
	}
	public float getActiveKilocalories() {
		return activeKilocalories;
	}
	public void setActiveKilocalories(float activeKilocalories) {
		this.activeKilocalories = activeKilocalories;
	}
	public float getDistanceInMeters() {
		return distanceInMeters;
	}
	public void setDistanceInMeters(float distanceInMeters) {
		this.distanceInMeters = distanceInMeters;
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
	public float getMet() {
		return met;
	}
	public void setMet(float met) {
		this.met = met;
	}
	public String getIntensity() {
		return intensity;
	}
	public void setIntensity(String intensity) {
		this.intensity = intensity;
	}
	public long getSteps() {
		return steps;
	}
	public void setSteps(long steps) {
		this.steps = steps;
	}
	public long getDurationInSeconds() {
		return durationInSeconds;
	}
	public void setDurationInSeconds(long durationInSeconds) {
		this.durationInSeconds = durationInSeconds;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public float getMeanMotionIntensity() {
		return meanMotionIntensity;
	}
	public void setMeanMotionIntensity(float meanMotionIntensity) {
		this.meanMotionIntensity = meanMotionIntensity;
	}
	public long getMaxMotionIntensity() {
		return maxMotionIntensity;
	}
	public void setMaxMotionIntensity(long maxMotionIntensity) {
		this.maxMotionIntensity = maxMotionIntensity;
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
