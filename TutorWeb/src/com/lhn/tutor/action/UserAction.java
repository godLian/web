package com.lhn.tutor.action;

import com.lhn.tutor.dao.UserDao;
import com.lhn.tutor.dao.impl.UserDaoImpl;
import com.lhn.tutor.entity.User;

public class UserAction extends SuperAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	User user=new User();
	
	//确定注册类型
	public String confirmType(){
		session.setAttribute("user_type", request.getParameter("type"));
		return "confirm_success";
	}
	
	// 添加新账户
	public String addAccount() {
		String password = request.getParameter("password");
		String passwordagain = request.getParameter("passwordagain");
		if (password.equals(passwordagain) && !"".equals(password)) {
			/*/user = new User();
			user.setUsername(request.getParameter("username"));
			user.setPassword(password);
			user.setType(request.getParameter("type"));
			UserDao userDao = new UserDaoImpl();
			userDao.save(user);
			*/
			session.setAttribute("user_username", request.getParameter("username"));
			session.setAttribute("user_password", password);
			
			return "addAccount_success";
		} else {
			return "addAccount_failure";
		}
	}

	//添加账户详情
	public String addDetail(){
		user=new User();
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		user.setType(request.getParameter("type"));
		user.setName(request.getParameter("name"));
		user.setIdcard(request.getParameter("idcard"));
		user.setGender(request.getParameter("gender"));
		user.setBirthday(request.getParameter("birthday_year") + "-" + request.getParameter("birthday_month"));
		user.setPlace(request.getParameter("place"));
		user.setTel(request.getParameter("tel"));
		user.setOnline(request.getParameter("online"));
		user.setEmail(request.getParameter("email"));
		user.setFamilyaddress(request.getParameter("familyaddress"));
		user.setZipcode(request.getParameter("zipcode"));
		UserDao userDao=new UserDaoImpl();
		userDao.save(user);
		
		session.setAttribute("user_id", user.getId());
		System.out.println(user.getId());
		
		return "addDetail_success";
	}

}
