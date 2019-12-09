package com.bestbright.service;

import java.util.List;

import com.bestbright.Dto.SemisterDto;
import com.bestbright.models.Semister;
import com.bestbright.models.Subject;

public interface SemisterService {
	void saveSemister(SemisterDto semisterDto);
	List<Semister> getSemisterList();
	List<Subject> getSubjectList();
}
