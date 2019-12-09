package com.bestbright.service;

import java.util.List;

import com.bestbright.Dto.MarkDto;
import com.bestbright.models.Classes;
import com.bestbright.models.Mark;
import com.bestbright.models.Semister;
import com.bestbright.models.Student;
import com.bestbright.models.Subject;

public interface MarkService {
	void saveMark(MarkDto markDto);
	List<Mark> getMarkList();
	List<Student> getStudentListByClasses(Integer id);
	List<Student> getStudentList();
	List<Classes> getClassesList();
	List<Semister> getSemisterList();
	List<Subject> getSubjectList();
	/*List<Semister> getSemisterListBySubject(Integer id);*/
}
