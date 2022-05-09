package org.blc.api.controller;

import java.util.List;

import org.blc.api.model.StudentGrade;
import org.blc.api.service.GradingSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/grading/")
public class GradingSystemController {
	
	@Autowired
	private GradingSystemService gradingSystemService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/load-student-grade-details")
	@PreAuthorize("permitAll()")
	public ResponseEntity<List<StudentGrade>> loadStudentGradeDetails(@RequestParam Long studentId){
		
		return new ResponseEntity<List<StudentGrade>>(this.gradingSystemService.loadStudentGradeDetails(studentId),HttpStatus.OK);
	}
}
