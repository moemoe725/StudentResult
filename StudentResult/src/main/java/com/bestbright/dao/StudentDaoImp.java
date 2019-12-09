package com.bestbright.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bestbright.Dto.StudentClassDTO;
import com.bestbright.models.Classes;
import com.bestbright.models.Student;

@Repository
public class StudentDaoImp implements StudentDao{
	@Autowired
	SessionFactory sessionFactory;
	
	public Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	@Override
	public void saveStudent(Student stu) {
		// TODO Auto-generated method stub
		getCurrentSession().save(stu);
	}

	@Override
	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		return getCurrentSession().createCriteria(Student.class).list();
	}
	@Override
	public List<Classes> getClassesList() {
		// TODO Auto-generated method stub
		return getCurrentSession().createCriteria(Classes.class).list();
	}
	@Override
	public List<StudentClassDTO> getStudentListByClassId(Integer id) {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Student.class)
				.createAlias("classes", "c",JoinType.LEFT_OUTER_JOIN);
		c.setProjection(Projections.projectionList()
				.add(Projections.property("id"), "id")/*(Student,StudentClassDTO)*/
				.add(Projections.property("name"),"name")
				);
		c.add(Restrictions.eq("c.id",id));
		c.setResultTransformer(Transformers.aliasToBean(StudentClassDTO.class));
		return c.list();
	}

}
