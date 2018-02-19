package ut.entity.source.garmin;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ut.entity.source.BaseSource;

public class GnSleepRecords implements BaseSource {

	public GnSleepRecords(String json) {
		// todo.
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("lightSleepDurationInSeconds:").append(this.lightSleepDurationInSeconds).append(",")
				.append("deepSleepDurationInSeconds").append(this.deepSleepDurationInSeconds).append(",")
				.append("size-of-light:").append(this.sleepLevelsMap.getLight().size()).append(",")
				.append("size-of-deep:").append(this.sleepLevelsMap.getDeep().size()).append(",")
				.append("size-of-awake:").append(this.sleepLevelsMap.getAwake().size());
		return sb.toString();
	}

	private long startTimeInSeconds;

	private long lightSleepDurationInSeconds;
	private long deepSleepDurationInSeconds;

	private SleepLevelsMap sleepLevelsMap;

	private long awakeDurationInSeconds;
	private long startTimeOffsetInSeconds;
	private String _id;
	private long durationInSeconds;
	private Date calendarDate;
	private String validation;
	private String summaryId;
	private String userAccessToken;

	public void setDeepSleepDurationInSeconds(long deepSleepDurationInSeconds) {
		this.deepSleepDurationInSeconds = deepSleepDurationInSeconds;
	}

	public long getDeepSleepDurationInSeconds() {
		return deepSleepDurationInSeconds;
	}

	public long getLightSleepDurationInSeconds() {
		return lightSleepDurationInSeconds;
	}

	public void setLightSleepDurationInSeconds(long lightSleepDurationInSeconds) {
		this.lightSleepDurationInSeconds = lightSleepDurationInSeconds;
	}

	public long getStartTimeInSeconds() {
		return startTimeInSeconds;
	}

	public void setStartTimeInSeconds(long startTimeInSeconds) {
		this.startTimeInSeconds = startTimeInSeconds;
	}

	public long getAwakeDurationInSeconds() {
		return awakeDurationInSeconds;
	}

	public void setAwakeDurationInSeconds(long awakeDurationInSeconds) {
		this.awakeDurationInSeconds = awakeDurationInSeconds;
	}

	public long getStartTimeOffsetInSeconds() {
		return startTimeOffsetInSeconds;
	}

	public void setStartTimeOffsetInSeconds(long startTimeOffsetInSeconds) {
		this.startTimeOffsetInSeconds = startTimeOffsetInSeconds;
	}

	public void setSleepLevelsMap(SleepLevelsMap sleepLevelsMap) {
		this.sleepLevelsMap = sleepLevelsMap;
	}

	public SleepLevelsMap getSleepLevelsMap() {
		return sleepLevelsMap;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
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

	public String getValidation() {
		return validation;
	}

	public void setValidation(String validation) {
		this.validation = validation;
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

	public class SleepLevelsMap {
		private List<SleepLevel> light = new ArrayList<GnSleepRecords.SleepLevel>();
		private List<SleepLevel> awake = new ArrayList<GnSleepRecords.SleepLevel>();
		private List<SleepLevel> deep = new ArrayList<GnSleepRecords.SleepLevel>();

		public void setAwake(List<SleepLevel> awake) {
			this.awake = awake;
		}

		public List<SleepLevel> getAwake() {
			return awake;
		}

		public void setDeep(List<SleepLevel> deep) {
			this.deep = deep;
		}

		public List<SleepLevel> getDeep() {
			return deep;
		}

		public void setLight(List<SleepLevel> light) {
			this.light = light;
		}

		public List<SleepLevel> getLight() {
			return light;
		}

	}

	class SleepLevel {
		private long startTimeInSeconds;
		private long endTimeInSeconds;

		@Override
		public String toString() {
			StringBuffer sb = new StringBuffer();
			sb.append("start:").append(this.startTimeInSeconds).append(",");
			sb.append("end:").append(this.endTimeInSeconds);
			return sb.toString();
		}

		public void setEndTimeInSeconds(long endTimeInSeconds) {
			this.endTimeInSeconds = endTimeInSeconds;
		}

		public long getEndTimeInSeconds() {
			return endTimeInSeconds;
		}

		public void setStartTimeInSeconds(long startTimeInSeconds) {
			this.startTimeInSeconds = startTimeInSeconds;
		}

		public long getStartTimeInSeconds() {
			return startTimeInSeconds;
		}
	}

	public String format() {
		// TODO Auto-generated method stub
		return null;
	}

}
