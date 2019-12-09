package com.bestbright.service;

import java.util.List;

import com.bestbright.Dto.StudentClassDTO;
import com.bestbright.Dto.StudentDto;
import com.bestbright.models.Classes;
import com.bestbright.models.Student;

public interface StudentService {
	void saveStudent(StudentDto stuDto);
	List<Student> getStudentList();
	List<Classes> getClassesList();
	List<StudentClassDTO> getStudentListByClassId(Integer id);
}
