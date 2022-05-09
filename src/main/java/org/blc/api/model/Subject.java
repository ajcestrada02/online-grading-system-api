package org.blc.api.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject extends BaseModel{

	private String subjectCode;
	
	private String name;

	public Subject() {
	}

	public Subject(Long id, Date createdDate, Date updatedDate, String subjectCode, String name) {
		super(id, createdDate, updatedDate);
		this.subjectCode = subjectCode;
		this.name = name;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
