package org.blc.api.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="section")
public class Section extends BaseModel{
	
	private String section;

	public Section(Long id, Date createdDate, Date updatedDate, String section) {
		super(id, createdDate, updatedDate);
		this.section = section;
	}

	public Section() {
	}
	
	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
	
}
