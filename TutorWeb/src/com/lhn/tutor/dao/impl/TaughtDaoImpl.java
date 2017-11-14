package com.lhn.tutor.dao.impl;

import java.util.Calendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lhn.tutor.dao.TaughtDao;
import com.lhn.tutor.entity.Taught;
import com.lhn.tutor.tool.MyHibernateSessionFactory;

public class TaughtDaoImpl implements TaughtDao{

	private Transaction transaction=null;
	private List<Taught> tList;
	private String hql;
	
	@Override
	public List<Object> querydetail(String teacher_id) {
		List<Object> oList=null;
		try {
			Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			transaction=session.beginTransaction();
			hql="SELECT t.id,u.name,u.tel,t.price FROM Taught t,User u WHERE t.id=u.id AND t.id=?";
			Query query=session.createQuery(hql);
			query.setString(0, teacher_id);
			oList=query.list();
			transaction.commit();
			return oList;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.commit();
			return oList;
		}
		finally{
			if (transaction!=null) {
				transaction=null;
			}
		}
	}
	
	public List<Object> querybyid(String id) {
		List<Object> oList=null;
		try{
			Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			transaction=session.beginTransaction();
			hql="SELECT t.id,u.name,i.headcard,i.isidcard,c.isschool,c.school,c.major,c.year,c.years,u.birthday," +
					"u.gender,u.address,t.exper,t.price,t.firstsub,t.secondsub,u.tel,t.type,t.profile,t.motto " +
					"FROM College c,User u,Taught t,Image i WHERE i.id=c.id AND c.id=u.id AND c.id=t.id AND t.id=?";
			Query query=session.createQuery(hql);
			query.setString(0, id);
			query.setMaxResults(4);
			oList=query.list();
//			System.out.println(oList.size());
			for (int i = 0; i < oList.size(); i++) {
				Object[] obj =(Object[])oList.get(i);
//	             String id = String.valueOf(obj[0]);
//	             String name = String.valueOf(obj[1]);
//	             String profile = String.valueOf(obj[2]);
//	             String price = String.valueOf(obj[3]);
//	             String imgpath = String.valueOf(obj[4]);
//	             String tel=String.valueOf(obj[5]);
//	             System.out.println(id+"--"+name+"--"+profile+"--"+price+"--"+imgpath+"--"+tel);
				//System.out.println(obj[7]+"---"+obj[9]);
				int year=Integer.valueOf((String) obj[7]);
				obj[7]=nowgrade(year,(String)obj[8]);
				obj[9]=nowage((String)obj[9]);
				//System.out.println(obj[9]);
			}
			transaction.commit();
			return oList;
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.commit();
			return oList;
		}
		finally{
			if(transaction!=null){
				transaction=null;
			}
		}
	}
	
	//ͨ��sub����ѯ
	public List<Object> querybysub(String sub) {
		List<Object> oList=null;
		try{
			Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			transaction=session.beginTransaction();
			hql="From Taught where firstsub like '%'||?||'%' or secondsub like '%'||?||'%'";
			Query query=session.createQuery(hql);
			query.setString(0, sub);
			query.setString(1, sub);
			query.setMaxResults(4);
			session.flush();
			tList=query.list();
			System.out.println(tList.size());
			if(tList.size()>0){
				String hqls="SELECT t.id,u.name,t.motto,t.price,i.headcard,u.tel FROM Taught t,Image i,User u " +
						"WHERE (t.id=i.id AND t.id=u.id AND t.id='"+tList.get(0).getId()+"')";
				for (int i = 1; i < tList.size(); i++) {
					System.out.println(tList.get(i).getId());
					hqls +=" or (t.id=i.id AND t.id=u.id AND t.id='"+tList.get(i).getId()+"')";	
				}
				System.out.println(hqls);
				Query querys=session.createQuery(hqls);
				oList=querys.list();
				for (int i = 0; i < oList.size(); i++) {
					Object[] obj =(Object[])oList.get(i);
		             String id = String.valueOf(obj[0]);
		             String name = String.valueOf(obj[1]);
		             String profile = String.valueOf(obj[2]);
		             String price = String.valueOf(obj[3]);
		             String imgpath = String.valueOf(obj[4]);
		             String tel=String.valueOf(obj[5]);
		             System.out.println(id+"--"+name+"--"+profile+"--"+price+"--"+imgpath+"--"+tel);
				}
			}
			transaction.commit();
			return oList;
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.commit();
			return oList;
		}
		finally{
			if(transaction!=null){
				transaction=null;
			}
		}
	}
	
	//ͨ��oth��ѯ
	public List<Object> querybyoth() {
		List<Object> oList=null;
		try{
			Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			transaction=session.beginTransaction();
			hql="FROM Taught t WHERE t.id NOT IN(SELECT id FROM Taught WHERE firstsub " +
					"LIKE '%��ѧ%' OR secondsub LIKE'%��ѧ%' OR firstsub LIKE'%����%' OR secondsub LIKE'%����%' " +
					"OR firstsub LIKE'%Ӣ��%' OR secondsub LIKE'%Ӣ��%' OR firstsub LIKE'%����%' OR secondsub " +
					"LIKE'%����%' OR firstsub LIKE'%��ѧ%' OR secondsub LIKE'%��ѧ%' OR firstsub LIKE'%����%' " +
					"OR secondsub LIKE'%����%')";
			Query query=session.createQuery(hql);
			query.setMaxResults(4);
			session.flush();
			tList=query.list();
			System.out.println(tList.size());
			if(tList.size()>0){
				String hqls="SELECT t.id,u.name,t.motto,t.price,i.headcard,u.tel FROM Taught t,Image i,User u " +
						"WHERE (t.id=i.id AND t.id=u.id AND t.id='"+tList.get(0).getId()+"')";
				for (int i = 1; i < tList.size(); i++) {
					System.out.println(tList.get(i).getId());
					hqls +=" or (t.id=i.id AND t.id=u.id AND t.id='"+tList.get(i).getId()+"')";	
				}
				System.out.println(hqls);
				Query querys=session.createQuery(hqls);
				oList=querys.list();
			}
			transaction.commit();
			return oList;
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.commit();
			return oList;
		}
		finally{
			if(transaction!=null){
				transaction=null;
			}
		}
	}
	
	
	//�����꼶
	private String nowgrade(int year,String years){
		String grade="";
		Calendar calendar=Calendar.getInstance();
		if(years.equals("��ѧר������")){
			if(calendar.get(Calendar.YEAR)>=year&&calendar.get(Calendar.MONTH)>=2&&calendar.get(Calendar.MONTH)<=9){
				switch (calendar.get(Calendar.YEAR)-year) {
				case 1:
					grade="��һ";
					break;
				case 2:
					grade= "���";
					break;
				case 3:
					grade= "����";
					break;
				}
			}
			else{
				switch (calendar.get(Calendar.YEAR)-year) {
				case 0:
					grade= "��һ";
					break;
				case 1:
					grade= "���";
					break;
				case 2:
					grade= "����";
					break;
				}
			}
		}
		else if(years.equals("��ѧ��������")){
			if(calendar.get(Calendar.YEAR)>=year&&calendar.get(Calendar.MONTH)>=2&&calendar.get(Calendar.MONTH)<=9){
				switch (calendar.get(Calendar.YEAR)-year) {
				case 1:
					grade= "��һ";
					break;
				case 2:
					grade= "���";
					break;
				case 3:
					grade= "����";
					break;
				case 4:
					grade= "����";
					break;
				}
			}
			else{
				switch (calendar.get(Calendar.YEAR)-year) {
				case 0:
					grade= "��һ";
					break;
				case 1:
					grade= "���";
					break;
				case 2:
					grade= "����";
					break;
				case 3:
					grade= "����";
					break;
				}
			}
		}
		else if(years.equals("��ѧ��������")){
			if(calendar.get(Calendar.YEAR)>=year&&calendar.get(Calendar.MONTH)>=2&&calendar.get(Calendar.MONTH)<=9){
				switch (calendar.get(Calendar.YEAR)-year) {
				case 1:
					grade= "��һ";
					break;
				case 2:
					grade= "���";
					break;
				case 3:
					grade= "����";
					break;
				case 4:
					grade= "����";
					break;
				default:
					grade= "����";
					break;
				}
			}
			else{
				switch (calendar.get(Calendar.YEAR)-year) {
				case 0:
					grade= "��һ";
					break;
				case 1:
					grade= "���";
					break;
				case 2:
					grade= "����";
					break;
				case 3:
					grade= "����";
					break;
				default:
					grade= "����";
					break;
				}
			}
		}
		else if(years.equals("�о���")){
			if(calendar.get(Calendar.YEAR)>=year&&calendar.get(Calendar.MONTH)>=2&&calendar.get(Calendar.MONTH)<=9){
				switch (calendar.get(Calendar.YEAR)-year) {
				case 1:
					grade= "��һ";
					break;
				case 2:
					grade= "�ж�";
					break;
				case 3:
					grade= "����";
					break;
				}
			}
			else{
				switch (calendar.get(Calendar.YEAR)-year) {
				case 0:
					grade= "��һ";
					break;
				case 1:
					grade= "�ж�";
					break;
				case 2:
					grade= "����";
					break;
				}
			}
		}
		else if(years.equals("˶������")){
			if(calendar.get(Calendar.YEAR)>=year&&calendar.get(Calendar.MONTH)>=2&&calendar.get(Calendar.MONTH)<=9){
				switch (calendar.get(Calendar.YEAR)-year) {
				case 1:
					grade= "��һ";
					break;
				case 2:
					grade= "�ж�";
					break;
				case 3:
					grade= "����";
					break;
				case 4:
					grade= "��һ";
					break;
				case 5:
					grade= "����";
					break;
				}
			}
			else{
				switch (calendar.get(Calendar.YEAR)-year) {
				case 0:
					grade= "��һ";
					break;
				case 1:
					grade= "�ж�";
					break;
				case 2:
					grade= "����";
					break;
				case 3:
					grade= "��һ";
					break;
				case 4:
					grade= "����";
					break;
				}
			}
		}
		else{
			if(calendar.get(Calendar.YEAR)>=year&&calendar.get(Calendar.MONTH)>=2&&calendar.get(Calendar.MONTH)<=9){
				switch (calendar.get(Calendar.YEAR)-year) {
				case 1:
					grade= "��һ";
					break;
				case 2:
					grade= "����";
					break;
				case 3:
					grade= "����";
					break;
				}
			}
			else{
				switch (calendar.get(Calendar.YEAR)-year) {
				case 0:
					grade= "��һ";
					break;
				case 1:
					grade= "����";
					break;
				case 2:
					grade= "����";
					break;
				}
			}
		}
		return grade;
	}

	//��������
	private int nowage(String birthday){
		Calendar calendar=Calendar.getInstance();
		int age=Integer.parseInt(birthday.substring(0, 4));
		return calendar.get(Calendar.YEAR)-age;
	}
}
