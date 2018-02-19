package ut.entity.source.garmin;

import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GnStressDetails {

	private BigInteger startTimeInSeconds;
	private long startTimeOffsetInSeconds;
	private long durationInSeconds;
	private Date calendarDate;
	private String _id;
	private String summaryId;
	private String userAccessToken;
	private Map<Integer, Integer> timeOffsetStressLevelValues = new HashMap<Integer, Integer>();

	public BigInteger getStartTimeInSeconds() {
		return startTimeInSeconds;
	}

	public void setStartTimeInSeconds(BigInteger startTimeInSeconds) {
		this.startTimeInSeconds = startTimeInSeconds;
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

	public Date getCalendarDate() {
		return calendarDate;
	}

	public void setCalendarDate(Date calendarDate) {
		this.calendarDate = calendarDate;
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

	public Map<Integer, Integer> getTimeOffsetStressLevelValues() {
		return timeOffsetStressLevelValues;
	}

	public void setTimeOffsetStressLevelValues(Map<Integer, Integer> timeOffsetStressLevelValues) {
		this.timeOffsetStressLevelValues = timeOffsetStressLevelValues;
	}

}
