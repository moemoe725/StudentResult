package com.bestbright.dao;

import java.util.List;

import com.bestbright.Dto.SemisterDto;
import com.bestbright.models.Semister;
import com.bestbright.models.Subject;

public interface SemisterDao {
	void saveSemister(Semister sem);
	List<Semister> getSemisterList();
	List<SemisterDto> getSemisterListBySubjectId(Integer id);
	List<Subject> getSubjectList();
	
}
