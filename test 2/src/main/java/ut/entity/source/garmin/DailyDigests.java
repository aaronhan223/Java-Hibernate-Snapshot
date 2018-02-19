package ut.entity.source.garmin;

import java.util.HashMap;
import java.util.Map;

import ut.entity.source.BaseSource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DailyDigests implements BaseSource {

	public String format() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	@Override
//	public String toString() {
//		StringBuffer sb = new StringBuffer();
//		sb.append("lightSleepDurationInSeconds:").append(this.lightSleepDurationInSeconds).append(",")
//				.append("deepSleepDurationInSeconds").append(this.deepSleepDurationInSeconds).append(",")
//				.append("size-of-light:").append(this.sleepLevelsMap.getLight().size()).append(",")
//				.append("size-of-deep:").append(this.sleepLevelsMap.getDeep().size()).append(",")
//				.append("size-of-awake:").append(this.sleepLevelsMap.getAwake().size());
//		return sb.toString();
//	}
	
	private int minHeartRateInBeatsPerMinute;
	private int activeKilocalories;
	private int distanceInMeters;
	private String activityType;
	private String userAccessToken;
	private int maxStressLevel;
	private int averageHeartRateInBeatsPerMinute;
	private int restStressDurationInSeconds;
	private int floorsClimbed;
	private int restingHeartRateInBeatsPerMinute;
	private int mediumStressDurationInSeconds;
	private long startTimeInSeconds;
	private int moderateIntensityDurationInSeconds;
	private String stressQualifier;
	private int stepsGoal;
	private int lowStressDurationInSeconds;
	private TimeOffsetHeartRateSamples timeOffsetHeartRateSamples;
	private int intensityDurationGoalInSeconds;
	private int stressDurationInSeconds;
	private int activeTimeInSeconds;
	private int activityStressDurationInSeconds;
	private int floorsClimbedGoal;
	private int highStressDurationInSeconds;
	private int startTimeOffsetInSeconds;
	private int steps;
	private int durationInSeconds;
	private int averageStressLevel;
	private int maxHeartRateInBeatsPerMinute;
	private String _id;
	private String summaryId;
	
	public int getMinHeartRateInBeatsPerMinute() {
		return minHeartRateInBeatsPerMinute;
	}
	public int getActiveKilocalories() {
		return activeKilocalories;
	}
	public int getDistanceInMeters() {
		return distanceInMeters;
	}
	public String getActivityType() {
		return activityType;
	}
	public String getUserAccessToken() {
		return userAccessToken;
	}
	public int getMaxStressLevel() {
		return maxStressLevel;
	}
	public int getSteps() {
		return steps;
	}
	public int getAverageHeartRateInBeatsPerMinute() {
		return averageHeartRateInBeatsPerMinute;
	}
	public int getRestStressDurationInSeconds() {
		return restStressDurationInSeconds;
	}
	public int getFloorsClimbed() {
		return floorsClimbed;
	}
	public int getRestingHeartRateInBeatsPerMinute() {
		return restingHeartRateInBeatsPerMinute;
	}
	public int getMediumStressDurationInSeconds() {
		return mediumStressDurationInSeconds;
	}
	public long getStartTimeInSeconds() {
		return startTimeInSeconds;
	}
	public int getModerateIntensityDurationInSeconds() {
		return moderateIntensityDurationInSeconds;
	}
	public String getStressQualifier() {
		return stressQualifier;
	}
	public int getStepsGoal() {
		return stepsGoal;
	}
	public int getLowStressDurationInSeconds() {
		return lowStressDurationInSeconds;
	}
	public TimeOffsetHeartRateSamples getTimeOffsetHeartRateSamples() {
		return timeOffsetHeartRateSamples;
	}
	public int getIntensityDurationGoalInSeconds() {
		return intensityDurationGoalInSeconds;
	}
	public int getStressDurationInSeconds() {
		return stressDurationInSeconds;
	}
	public int getActiveTimeInSeconds() {
		return activeTimeInSeconds;
	}
	public int getActivityStressDurationInSeconds() {
		return activityStressDurationInSeconds;
	}
	public int getFloorsClimbedGoal() {
		return floorsClimbedGoal;
	}
	public int getHighStressDurationInSeconds() {
		return highStressDurationInSeconds;
	}
	public int getStartTimeOffsetInSeconds() {
		return startTimeOffsetInSeconds;
	}
	public int getDurationInSeconds() {
		return durationInSeconds;
	}
	public int getAverageStressLevel() {
		return averageStressLevel;
	}
	public int getMaxHeartRateInBeatsPerMinute() {
		return maxHeartRateInBeatsPerMinute;
	}
	public String get_id() {
		return _id;
	}
	public String getSummaryId() {
		return summaryId;
	}
	
	public class TimeOffsetHeartRateSamples {
		private int heartRate;
		private String ts;
		
		@Override
		public String toString() {
			StringBuffer sb = new StringBuffer();
			sb.append(ts + ":").append(this.heartRate);
			return sb.toString();
		}
	}
}
