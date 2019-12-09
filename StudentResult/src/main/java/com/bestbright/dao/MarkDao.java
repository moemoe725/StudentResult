package com.bestbright.dao;

import java.util.List;

import com.bestbright.models.Classes;
import com.bestbright.models.Mark;
import com.bestbright.models.Semister;
import com.bestbright.models.Student;
import com.bestbright.models.Subject;

public interface MarkDao {
	void saveMark(Mark m);
	List<Mark> getMarkList();
	List<Student> getStudentList();
	List<Classes> getClassesList();
	List<Student> getStudentListByClasses(Integer id);
	List<Subject> getSubjectList();
	List<Semister> getSemisterList();
	List<Semister> getSemisterListBySubject(Integer id);
}
