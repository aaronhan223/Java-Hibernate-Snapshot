package ut.entity;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

@Entity
@Table(name = "timeseries")
public class Timeseries {

	@Id
	@Column(name = "id")
	private BigInteger id;

	@Column(name = "batch")
	private BigInteger batch;

	@Column(name = "timestamp")
	private Date timestamp;

	@Column(name = "extent")
	private Integer extent;

	@Column(name = "blob")
	private String blob;

	@Column(name = "snapshot_id")
	private BigInteger snapshot_id;

	@Column(name = "stream_major")
	private int stream_major;

	@Column(name = "stream_minor")
	private int stream_minor;

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("id:").append(this.id);
		// TODO..
		return sb.toString();
	}

	public BigInteger getId() {
		return id;
	}

	public BigInteger getBatch() {
		return batch;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public int getExtent() {
		return extent;
	}

	public String getBlob() {
		return blob;
	}

	public BigInteger getSnapshot_id() {
		return snapshot_id;
	}

	public int getStream_major() {
		return stream_major;
	}

	public int getStream_minor() {
		return stream_minor;
	}

}
