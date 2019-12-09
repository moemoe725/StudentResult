package com.bestbright.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bestbright.Dto.SemisterDto;
import com.bestbright.models.Semister;
import com.bestbright.models.Subject;
@Repository
public class SemisterDaoImp implements SemisterDao{
		@Autowired
		SessionFactory sessionFactory;
		
		public Session getCurrentSession(){
			return sessionFactory.getCurrentSession();
		}
		@Override
		public void saveSemister(Semister sem) {
			// TODO Auto-generated method stub
			getCurrentSession().save(sem);
		}

		@Override
		public List<Semister> getSemisterList() {
			// TODO Auto-generated method stub
			return getCurrentSession().createCriteria(Semister.class).list();
		}
		@Override
		public List<SemisterDto> getSemisterListBySubjectId(Integer id) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public List<Subject> getSubjectList() {
			// TODO Auto-generated method stub
			return getCurrentSession().createCriteria(Subject.class).list();
		}

}
