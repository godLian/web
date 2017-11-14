package com.lhn.tutor.dao.impl;

import java.io.File;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lhn.tutor.dao.ImageDao;
import com.lhn.tutor.entity.Image;
import com.lhn.tutor.tool.MyHibernateSessionFactory;

public class ImageDaoImpl implements ImageDao {

	Transaction transaction = null;
	String hql = "";

	public boolean saveImg(Image img) {
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.save(img);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.commit();
			return false;
		} finally {
			if (transaction != null) {
				transaction = null;
			}
		}
	}
	
	//保存到相应的user表下
	public boolean savetouser(String user_id,String img_id){
		try {
			Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			transaction=session.beginTransaction();
			hql="UPDATE User SET identity_id=? WHERE id=?";
			Query query=session.createQuery(hql);
			query.setParameter(0, img_id);
			query.setParameter(1, user_id);
			query.executeUpdate();
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.commit();
			return false;
		}finally{
			if(transaction!=null){
				transaction=null;
			}
		}
	}

	@Override
	public File querybyid(String user_id) {
		// TODO Auto-generated method stub
		return null;
	}

//	public File querybyid(String user_id) {
//		try {
//			Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
//			transaction=session.beginTransaction();
//			hql="from images where id=?";
//			Query query=session.createQuery(hql);
//			query.setString(0, user_id);
//			if(query.list()>0){
//				return 
//			}
//		} 
//		catch (Exception e) {
//			
//		}
//		finally{
//			
//		}
//	}

}
