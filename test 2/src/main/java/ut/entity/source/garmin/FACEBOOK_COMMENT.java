package ut.entity.source.garmin;

import ut.entity.source.BaseSource;

public class FACEBOOK_COMMENT implements BaseSource {

	public String format() {
		// TODO Auto-generated method stub
		return null;
	}
	private String post_id;
	private int comments_count;
	private String posted_on;
	private String facebook_comment;
	private int likes_count;
	
	public String getPost_id() {
		return post_id;
	}
	public String getPosted_on() {
		return posted_on;
	}
	public String getFacebook_comment() {
		return facebook_comment;
	}
	public int getComments_count() {
		return comments_count;
	}
	public int getLikes_count() {
		return likes_count;
	}

}
