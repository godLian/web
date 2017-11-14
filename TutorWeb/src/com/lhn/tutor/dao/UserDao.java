package com.lhn.tutor.dao;

import com.lhn.tutor.entity.User;

public interface UserDao {

	//生成id保存用户
	public boolean save(User user);
	//调用
	public boolean saveDetail(User user);
}
