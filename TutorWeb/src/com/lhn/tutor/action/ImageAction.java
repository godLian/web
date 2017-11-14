package com.lhn.tutor.action;

import com.lhn.tutor.dao.ImageDao;
import com.lhn.tutor.dao.impl.ImageDaoImpl;

public class ImageAction extends SuperAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String authenticate(){
		String img_id=request.getParameter("img_id");
		String user_id=(String) session.getAttribute("user_id");
		
		System.out.println("imagesAction="+img_id+user_id);
		
		ImageDao imageDao=new ImageDaoImpl();
		imageDao.savetouser(user_id, img_id);
		return "authenticate_success";
	}

}
