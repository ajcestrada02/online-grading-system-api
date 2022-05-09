package org.blc.api.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "section_details")
public class StudentDetails extends BaseModel {

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "id")
	private Student student;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "id")
	private Course course;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "id")
	private Section section;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "id")
	private Subject subject;
	
	private Double grade;

	public StudentDetails(Long id, Date createdDate, Date updatedDate, Student student, Course course, Section section,
			Subject subject, Double grade) {
		super(id, createdDate, updatedDate);
		this.student = student;
		this.course = course;
		this.section = section;
		this.subject = subject;
		this.grade = grade;
	}

	public StudentDetails() {
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Double getGrade() {
		return grade;
	}

	public void setGrade(Double grade) {
		this.grade = grade;
	}

}
