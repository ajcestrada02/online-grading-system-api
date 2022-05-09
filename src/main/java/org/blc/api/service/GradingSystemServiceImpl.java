package org.blc.api.service;

import java.util.List;

import org.blc.api.model.StudentGrade;
import org.blc.api.repository.StudentGradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradingSystemServiceImpl implements GradingSystemService {

	@Autowired
	private StudentGradeRepository studentGradeRepository;
	
	public List<StudentGrade> loadStudentGradeDetails(Long studentId) {
		return studentGradeRepository.findByStudentDetailsStudentId(studentId);
	}

}
