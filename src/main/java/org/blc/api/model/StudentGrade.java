package org.blc.api.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "student_grade")
public class StudentGrade extends BaseModel {

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "id")
	private Category category;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "id")
	private StudentDetails studentDetails;
	
	private String description;
	
	private Integer numberOfItems;
	
	private Double score;

	public StudentGrade(Long id, Date createdDate, Date updatedDate, Category category, StudentDetails studentDetails,
			String description, Integer numberOfItems, Double score) {
		super(id, createdDate, updatedDate);
		this.category = category;
		this.studentDetails = studentDetails;
		this.description = description;
		this.numberOfItems = numberOfItems;
		this.score = score;
	}

	public StudentGrade() {
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public StudentDetails getStudentDetails() {
		return studentDetails;
	}

	public void setStudentDetails(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(Integer numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
}
