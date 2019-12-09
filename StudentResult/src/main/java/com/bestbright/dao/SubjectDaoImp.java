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
import com.bestbright.Dto.SubjectDto;
import com.bestbright.models.Classes;
import com.bestbright.models.Student;
import com.bestbright.models.Subject;
	@Repository
public class SubjectDaoImp implements SubjectDao{
		@Autowired
		SessionFactory sessionFactory;
		public Session getCurrentSession(){
			return sessionFactory.getCurrentSession();
		}
		@Override
		public void saveSubject(Subject sub) {
			// TODO Auto-generated method stub
			getCurrentSession().save(sub);
		}

		@Override
		public List<Subject> getsubjectList() {
			// TODO Auto-generated method stub
			return getCurrentSession().createCriteria(Subject.class).list();
		}
		@Override
		public List<SubjectDto> getSubjectListByClassId(Integer id) {
			// TODO Auto-generated method stub
			Criteria c=getCurrentSession().createCriteria(Subject.class)
					.createAlias("classes", "c",JoinType.LEFT_OUTER_JOIN);
			c.setProjection(Projections.projectionList()
					.add(Projections.property("id"), "id")
					.add(Projections.property("name"),"name"));
					
			c.add(Restrictions.eq("c.id",id));
			c.setResultTransformer(Transformers.aliasToBean(SubjectDto.class));
			return c.list();
		}
		@Override
		public List<Classes> getClassesList() {
			// TODO Auto-generated method stub
			return getCurrentSession().createCriteria(Classes.class).list();
		}
}
