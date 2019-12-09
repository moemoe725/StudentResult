package com.bestbright.dao;

import java.util.List;

import com.bestbright.Dto.StudentClassDTO;
import com.bestbright.models.Classes;
import com.bestbright.models.Student;

public interface StudentDao {
	void saveStudent(Student stu);
	List<Student> getStudentList();
	List<Classes> getClassesList();
	public List<StudentClassDTO> getStudentListByClassId(Integer id);
}
