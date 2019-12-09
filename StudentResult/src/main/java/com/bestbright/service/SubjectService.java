package com.bestbright.service;

import java.util.List;

import com.bestbright.Dto.SubjectDto;
import com.bestbright.models.Classes;
import com.bestbright.models.Subject;

public interface SubjectService {
	void saveSubject(SubjectDto subdto);
	List<Subject> getsubjectList();
	public List<SubjectDto> getSubjectListByClassId(Integer id);
	List<Classes> getClassesList();
}
