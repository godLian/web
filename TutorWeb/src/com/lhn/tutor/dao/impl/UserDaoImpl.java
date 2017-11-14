package com.lhn.tutor.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lhn.tutor.dao.UserDao;
import com.lhn.tutor.entity.User;
import com.lhn.tutor.tool.MyHibernateSessionFactory;

public class UserDaoImpl implements UserDao {

	Transaction transaction = null;
	String hql = "";

	public boolean save(User user) {
		user.setId(getNewid());
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.save(user);
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
	
	public boolean saveDetail(User user) {
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.update(user);
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

	// ����id��
	private String getNewid() {
		String id = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			// ��õ�ǰid��
			hql = "select max(id) from User";
			Query query = session.createQuery(hql);
			id = (String) query.uniqueResult();
			if (id == null || "".equals(id)) {
				// ��һ��Ĭ�ϵ����id
				id = "J0000000001";
			} else {
				String temp = id.substring(1);// ȡ�����10λ
				int i = Integer.parseInt(temp);// תΪ����
				i++;
				// �ٻ�ԭ�ַ���
				temp = String.valueOf(i);
				int len = temp.length();
				// �չ���λ
				for (int j = 0; j < 10 - len; j++) {
					temp = "0" + temp;
				}
				id = "J" + temp;
			}
			transaction.commit();
			return id;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.commit();
			return id;
		} finally {
			if (transaction != null) {
				transaction = null;
			}
		}
	}

}
