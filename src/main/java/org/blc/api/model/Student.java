package org.blc.api.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student extends Person{

	private String yearLevel;

	public String getYearLevel() {
		return yearLevel;
	}

	public void setYearLevel(String yearLevel) {
		this.yearLevel = yearLevel;
	}

	public Student(Long id, Date createdDate, Date updatedDate, String firstname, String lastname, String address,
			Long mobileNumber, String email, String yearLevel) {
		super(id, createdDate, updatedDate, firstname, lastname, address, mobileNumber, email);
		this.yearLevel = yearLevel;
	}

	public Student() {
	}
	
}
