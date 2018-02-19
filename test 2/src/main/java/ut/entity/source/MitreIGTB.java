package ut.entity.source;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

/**
 * 
 * Initial ground truth
 * 
 * @author Dilin
 *
 */
public class MitreIGTB {
	private List<String> files;
	private String name;
	private String lastModified;
	private String ownerId;
	private String id;
	private Boolean isActive;

	private Response data;

	public void setData(Response data) {
		this.data = data;
	}

	public Response getData() {
		return data;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getLastModified() {
		return lastModified;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setFiles(List<String> files) {
		this.files = files;
	}

	public List<String> getFiles() {
		return files;
	}

	public class Response {

		private List<Map<String, String>> responses = new ArrayList<Map<String, String>>();

		public void setResponses(List<Map<String, String>> responses) {
			this.responses = responses;
		}

		public List<Map<String, String>> getResponses() {
			return responses;
		}
	}
}
