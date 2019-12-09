package com.bestbright.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bestbright.Dto.MarkDto;
import com.bestbright.dao.MarkDao;
import com.bestbright.models.Classes;
import com.bestbright.models.Mark;
import com.bestbright.models.Semister;
import com.bestbright.models.Student;
import com.bestbright.models.Subject;


@Service
@Transactional
public class MarkServiceImp implements MarkService{
	@Autowired
	MarkDao markDao;

	@Override
	public void saveMark(MarkDto markDto) {
		// TODO Auto-generated method stub
		Mark mark=new Mark();
		/*if(markDto.getId()!=0){
			mark.setId(markDto.getId());
		}*/
		mark.setName(markDto.getName());
		mark.getStudent().setId(markDto.getStd_id());
		mark.getStudent().getClasses().setId(markDto.getClasses_id());
		mark.getSemister().setId(markDto.getSem_id());
		mark.getSubject().setId(markDto.getClasses_id());
		mark.setGetMark(markDto.getGetMark());
		mark.setGiveMark(markDto.getGiveMark());
		markDao.saveMark(mark);
	}

	@Override
	public List<Mark> getMarkList() {
		// TODO Auto-generated method stub
		return markDao.getMarkList();
	}

	@Override
	public List<Student> getStudentListByClasses(Integer id) {
		// TODO Auto-generated method stub
		return markDao.getStudentListByClasses(id);
	}

	@Override
	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		return markDao.getStudentList();
	}

	@Override
	public List<Classes> getClassesList() {
		// TODO Auto-generated method stub
		return markDao.getClassesList();
	}

	@Override
	public List<Semister> getSemisterList() {
		// TODO Auto-generated method stub
		return markDao.getSemisterList();
	}

	@Override
	public List<Subject> getSubjectList() {
		// TODO Auto-generated method stub
		return markDao.getSubjectList();
	}

	/*@Override
	public List<Semister> getSemisterListBySubject(Integer id) {
		// TODO Auto-generated method stub
		return markDao.getSemisterListBySubject(id);
	}*/
	
}
