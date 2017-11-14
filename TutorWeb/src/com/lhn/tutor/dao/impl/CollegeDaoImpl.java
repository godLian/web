package com.lhn.tutor.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lhn.tutor.dao.CollegeDao;
import com.lhn.tutor.entity.College;
import com.lhn.tutor.tool.MyHibernateSessionFactory;

public class CollegeDaoImpl implements CollegeDao{

	private Transaction transaction;
	private String hql="";
	
	public boolean addCollege(College c) {
		try {
			Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			transaction=session.beginTransaction();
			session.save(c);
			transaction.commit();
			return true;
		} 
		catch (Exception e) {
			e.printStackTrace();
			transaction.commit();
			return false;
		}
		finally{
			if(transaction!=null){
				transaction=null;
			}
		}
		
	}

}
