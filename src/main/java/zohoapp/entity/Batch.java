package zohoapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="batchs")
public class Batch extends AbstractEntity{
	@Column(name="firstName", nullable=false)
	private String firstName;
	@Column(name="lastName", nullable=false)
	private String lastName;
	@Column(name="email", nullable=false,unique=true)
	private String email;
	@Column(name="mobile", nullable=false)
	private long mobile;
	@Column(name="cource", nullable=false)
	private String cource;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	
}
