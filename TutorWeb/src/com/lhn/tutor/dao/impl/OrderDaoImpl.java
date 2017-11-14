package com.lhn.tutor.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lhn.tutor.dao.OrderDao;
import com.lhn.tutor.entity.Order;
import com.lhn.tutor.tool.MyHibernateSessionFactory;
import com.lhn.tutor.tool.MyRandom;

public class OrderDaoImpl implements OrderDao{

	private Transaction transaction=null;
	private String hql="";
	
	@Override
	public boolean add(Order order) {
		order.setNum(MyRandom.cRandom(20));
		System.out.println(order.getNum());
		try {
			Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			transaction=session.beginTransaction();
			session.save(order);
			transaction.commit();
			return true;
		} catch (Exception e) {
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
