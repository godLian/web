package com.lhn.tutor.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;

import com.lhn.tutor.dao.OrderDao;
import com.lhn.tutor.dao.impl.OrderDaoImpl;
import com.lhn.tutor.entity.Order;

public class OrderAction extends SuperAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String add(){
		Order order=new Order();
		order.setStatus("Î´½Óµ¥");
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		order.setNowdate(sdf.format(new Date()));
		order.setTargetname(request.getParameter("targetname"));
		order.setGrade(request.getParameter("grade"));
		order.setLearning(request.getParameter("learning"));
		order.setDirection(request.getParameter("direction"));
		order.setTeachdate(request.getParameter("teachdate"));
		order.setTeacher_id(request.getParameter("teacher_id"));
		//order.setUser_id("J0000000005");
		order.setUser_id(request.getParameter("user_id"));
		OrderDao orderDao=new OrderDaoImpl();
		orderDao.add(order);
		return "add_success";
	}
}
