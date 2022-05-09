package org.blc.api.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category extends BaseModel{
	
	private String categoryCode;
	private String name;
	public Category(Long id, Date createdDate, Date updatedDate, String categoryCode, String name) {
		super(id, createdDate, updatedDate);
		this.categoryCode = categoryCode;
		this.name = name;
	}
	public Category() {
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
