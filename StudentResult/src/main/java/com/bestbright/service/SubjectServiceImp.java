package com.bestbright.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bestbright.Dto.SubjectDto;
import com.bestbright.dao.SubjectDao;
import com.bestbright.models.Classes;
import com.bestbright.models.Subject;

@Service
@Transactional
public class SubjectServiceImp implements SubjectService {
	@Autowired
	SubjectDao subjectDao;
	@Override
	public void saveSubject(SubjectDto subdto) {
		// TODO Auto-generated method stub
		Subject sub=new Subject();
		sub.setName(subdto.getName());
		sub.getClasses().setId(subdto.getClasses_id());
		subjectDao.saveSubject(sub);
	}

	@Override
	public List<Subject> getsubjectList() {
		// TODO Auto-generated method stub
		return subjectDao.getsubjectList();
	}

	@Override
	public List<SubjectDto> getSubjectListByClassId(Integer id) {
		// TODO Auto-generated method stub
		return subjectDao.getSubjectListByClassId(id);
	}

	@Override
	public List<Classes> getClassesList() {
		// TODO Auto-generated method stub
		return subjectDao.getClassesList();
	}

}
