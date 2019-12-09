package com.bestbright.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bestbright.Dto.SemisterDto;
import com.bestbright.dao.SemisterDao;
import com.bestbright.models.Semister;
import com.bestbright.models.Subject;

@Service
@Transactional
public class SemisterServiceImp implements SemisterService{
	@Autowired
	SemisterDao semisterDao;

	@Override
	public void saveSemister(SemisterDto semisterDto) {
		// TODO Auto-generated method stub
		Semister semister=new Semister();
		semister.setName(semisterDto.getName());
		//System.out.println(semisterDto.getName()+" "+semisterDto.getSub_id());
		semisterDao.saveSemister(semister);
	}

	@Override
	public List<Semister> getSemisterList() {
		// TODO Auto-generated method stub
		return semisterDao.getSemisterList();
	}

	@Override
	public List<Subject> getSubjectList() {
		// TODO Auto-generated method stub
		return semisterDao.getSubjectList();
	}
	
}
