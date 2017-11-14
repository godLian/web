package com.lhn.tutor.action;

import java.util.List;

import com.lhn.tutor.dao.OrderDao;
import com.lhn.tutor.dao.TaughtDao;
import com.lhn.tutor.dao.impl.OrderDaoImpl;
import com.lhn.tutor.dao.impl.TaughtDaoImpl;
import com.lhn.tutor.entity.Taught;

public class TaughtAction extends SuperAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//���������ʦ����
	public String adddetail(){
		String teacher_id=request.getParameter("id");
		TaughtDao taughtDao=new TaughtDaoImpl();
		List<Object> oList=taughtDao.querydetail(teacher_id);
		session.setAttribute("teacherList", oList);
		return "adddetail_success";
	}
	
	//��ʦ����
	public String detail(){
		String id=request.getParameter("id");
		System.out.println(id);
		TaughtDao taughtDao=new TaughtDaoImpl();
		List<Object> list=taughtDao.querybyid(id);
		session.setAttribute("taught", list);
		return "detail_success";
	}
	
	//��ҳ��ʦչʾ
	public String querybysub() {
		TaughtDao taughtDao=new TaughtDaoImpl();
		List<Object> mathList=taughtDao.querybysub("��ѧ");
		if(mathList!=null&&mathList.size()>0){
			session.setAttribute("mathlist", mathList);
		}
		List<Object> chineseList=taughtDao.querybysub("����");
		if(chineseList!=null&&chineseList.size()>0){
			session.setAttribute("chineselist", chineseList);
		}
		List<Object> englishList=taughtDao.querybysub("Ӣ��");
		if(englishList!=null&&englishList.size()>0){
			session.setAttribute("englishlist", englishList);
		}
		List<Object> physicsList=taughtDao.querybysub("����");
		if(physicsList!=null&&physicsList.size()>0){
			session.setAttribute("physicslist", physicsList);
		}
		List<Object> chemistryList=taughtDao.querybysub("��ѧ");
		if(chemistryList!=null&&chemistryList.size()>0){
			session.setAttribute("chemistrylist", chemistryList);
		}
		List<Object> biologyList=taughtDao.querybysub("����");
		if(biologyList!=null&&biologyList.size()>0){
			session.setAttribute("biologylist", biologyList);
		}
		List<Object> othList=taughtDao.querybyoth();
		if(othList!=null&&othList.size()>0){
			session.setAttribute("othlist", othList);
		}
		return "query_success";
	}
}
