package com.bestbright.dao;

import java.util.List;

import com.bestbright.Dto.SubjectDto;
import com.bestbright.models.Classes;
import com.bestbright.models.Subject;

public interface SubjectDao {
	void saveSubject(Subject sub);
	List<Subject> getsubjectList();
	public List<SubjectDto> getSubjectListByClassId(Integer id);
	List<Classes> getClassesList();
}
