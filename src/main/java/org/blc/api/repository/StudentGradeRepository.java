package org.blc.api.repository;

import java.util.List;

import org.blc.api.model.StudentGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentGradeRepository extends JpaRepository<StudentGrade, Long>{
	
	List<StudentGrade> findByStudentDetailsStudentId(Long studentId);
	List<StudentGrade> findByCategoryId(Long categoryId);
}
