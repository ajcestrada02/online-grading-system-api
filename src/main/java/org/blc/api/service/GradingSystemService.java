package org.blc.api.service;

import java.util.List;

import org.blc.api.model.StudentGrade;

public interface GradingSystemService {
	
	public List<StudentGrade> loadStudentGradeDetails(Long studentId);
}
