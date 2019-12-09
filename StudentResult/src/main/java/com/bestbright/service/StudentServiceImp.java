package com.bestbright.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bestbright.Dto.StudentClassDTO;
import com.bestbright.Dto.StudentDto;
import com.bestbright.dao.StudentDao;
import com.bestbright.models.Classes;
import com.bestbright.models.Student;

@Service
@Transactional
public class StudentServiceImp implements StudentService{
	@Autowired
	StudentDao studentDao;
	@Override
	public void saveStudent(StudentDto stuDto) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		/*if(stuDto.getId()!=0){
			stu.setId(stuDto.getId());
		}
		*/
		stu.setName(stuDto.getName());
		stu.getClasses().setId(stuDto.getClasses_id());
		studentDao.saveStudent(stu);
	}

	@Override
	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		return studentDao.getStudentList();
	}

	@Override
	public List<Classes> getClassesList() {
		// TODO Auto-generated method stub
		return studentDao.getClassesList();
	}

	@Override
	public List<StudentClassDTO> getStudentListByClassId(Integer id) {
		// TODO Auto-generated method stub
		return studentDao.getStudentListByClassId(id);
	}

}
