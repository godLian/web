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

	//订单补充教师详情
	public String adddetail(){
		String teacher_id=request.getParameter("id");
		TaughtDao taughtDao=new TaughtDaoImpl();
		List<Object> oList=taughtDao.querydetail(teacher_id);
		session.setAttribute("teacherList", oList);
		return "adddetail_success";
	}
	
	//教师详情
	public String detail(){
		String id=request.getParameter("id");
		System.out.println(id);
		TaughtDao taughtDao=new TaughtDaoImpl();
		List<Object> list=taughtDao.querybyid(id);
		session.setAttribute("taught", list);
		return "detail_success";
	}
	
	//首页教师展示
	public String querybysub() {
		TaughtDao taughtDao=new TaughtDaoImpl();
		List<Object> mathList=taughtDao.querybysub("数学");
		if(mathList!=null&&mathList.size()>0){
			session.setAttribute("mathlist", mathList);
		}
		List<Object> chineseList=taughtDao.querybysub("语文");
		if(chineseList!=null&&chineseList.size()>0){
			session.setAttribute("chineselist", chineseList);
		}
		List<Object> englishList=taughtDao.querybysub("英语");
		if(englishList!=null&&englishList.size()>0){
			session.setAttribute("englishlist", englishList);
		}
		List<Object> physicsList=taughtDao.querybysub("物理");
		if(physicsList!=null&&physicsList.size()>0){
			session.setAttribute("physicslist", physicsList);
		}
		List<Object> chemistryList=taughtDao.querybysub("化学");
		if(chemistryList!=null&&chemistryList.size()>0){
			session.setAttribute("chemistrylist", chemistryList);
		}
		List<Object> biologyList=taughtDao.querybysub("生物");
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
