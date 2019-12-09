package com.bestbright.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bestbright.models.Classes;
import com.bestbright.models.Mark;
import com.bestbright.models.Semister;
import com.bestbright.models.Student;
import com.bestbright.models.Subject;

@Repository
public class MarkDaoImp implements MarkDao{
	@Autowired
	SessionFactory sessionFactory;
	
	public Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	@Override
	public void saveMark(Mark m) {
		// TODO Auto-generated method stub
		getCurrentSession().save(m);
	}

	@Override
	public List<Mark> getMarkList() {
		// TODO Auto-generated method stub
		return getCurrentSession().createCriteria(Mark.class).list();
	}
	@Override
	public List<Student> getStudentListByClasses(Integer id) {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Student.class)
				.createAlias("classes", "c",JoinType.LEFT_OUTER_JOIN);
		c.add(Restrictions.eq("c.id",id));
		return c.list();
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
	public List<Semister> getSemisterList() {
		// TODO Auto-generated method stub
		return getCurrentSession().createCriteria(Semister.class).list();
	}
	@Override
	public List<Subject> getSubjectList() {
		// TODO Auto-generated method stub
		return getCurrentSession().createCriteria(Subject.class).list();
	}
	@Override
	public List<Semister> getSemisterListBySubject(Integer id) {
		// TODO Auto-generated method stub
		Criteria c=getCurrentSession().createCriteria(Semister.class)
				.createAlias("subject","s",JoinType.LEFT_OUTER_JOIN);
		c.add(Restrictions.eq("s.id",id));
		return c.list();
	}
	

}
