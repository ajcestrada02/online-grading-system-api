package org.blc.api.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
public class Person extends BaseModel{
	
	private String firstname;
	
	private String lastname;
	
	private String address;
	
	private Long mobileNumber;
	
	private String email;

	public Person(Long id, Date createdDate, Date updatedDate, String firstname, String lastname, String address,
			Long mobileNumber, String email) {
		super(id, createdDate, updatedDate);
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}

	public Person() {
		super();
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
