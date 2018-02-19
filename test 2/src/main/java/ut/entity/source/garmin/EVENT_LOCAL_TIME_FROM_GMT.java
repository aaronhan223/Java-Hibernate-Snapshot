package ut.entity.source.garmin;

import ut.entity.source.BaseSource;

public class EVENT_LOCAL_TIME_FROM_GMT implements BaseSource {

	public String format() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private int compactData;
	private long ts;
	private String platform;
	private String gid;
	private double du;
	private Data data;
	private String id;
	
	public String getPlatform() {
		return platform;
	}
	public String getId() {
		return id;
	}
	public String getGid() {
		return gid;
	}
	public int getCompactData() {
		return compactData;
	}
	public Data getData() {
		return data;
	}
	public long getTs() {
		return ts;
	}
	public double getDu() {
		return du;
	}
	
	public class Data {
		private int blob;
		private int ts;
		
		@Override
		public String toString() {
			StringBuffer sb = new StringBuffer();
			sb.append("blob:").append(this.blob).append(",");
			sb.append("end:").append(this.ts);
			return sb.toString();
		}
		
		public long getBlob() {
			return blob;
		}
		public long getTs() {
			return ts;
		}
	}

}
