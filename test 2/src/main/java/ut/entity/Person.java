package ut.entity;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

	@Id
	private BigInteger snapshot_id;

	public BigInteger getSnapshot_id() {
		return snapshot_id;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("id:").append(this.snapshot_id);
		return sb.toString();
	}
}
