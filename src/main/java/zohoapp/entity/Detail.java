package zohoapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="details")
public class Detail extends AbstractEntity{
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
	@Column(name="batch",nullable = false)
	private long batch;
	@Column(name="college",nullable = false)
	private String college;
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
	public long getBatch() {
		return batch;
	}
	public void setBatch(long batch) {
		this.batch = batch;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
}
