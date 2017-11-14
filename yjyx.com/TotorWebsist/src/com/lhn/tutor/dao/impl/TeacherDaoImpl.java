package com.lhn.tutor.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lhn.tutor.dao.TeacherDao;
import com.lhn.tutor.db.MyHibernateSessionFactory;
import com.lhn.tutor.entity.Teacher;

public class TeacherDaoImpl implements TeacherDao{

	public List<Teacher> querybyMajor(String major){
		String hql="From Teacher where tmajor='?' limit 4";
		Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery(hql);
		
		return null;
		
	}
}
