package org.blc.api.model;

import javax.persistence.Table;

import java.util.Date;

import javax.persistence.Entity;

@Entity
@Table(name = "course")
public class Course extends BaseModel{

	private String courseCode;
	
	private String name;

	public Course() {
		super();
	}

	public Course(Long id, Date createdDate, Date updatedDate, String courseCode, String name) {
		super(id, createdDate, updatedDate);
		this.courseCode = courseCode;
		this.name = name;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
