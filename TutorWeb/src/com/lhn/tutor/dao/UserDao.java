package com.lhn.tutor.dao;

import com.lhn.tutor.entity.User;

public interface UserDao {

	//����id�����û�
	public boolean save(User user);
	//����
	public boolean saveDetail(User user);
}
