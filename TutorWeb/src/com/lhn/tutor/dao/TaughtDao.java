package com.lhn.tutor.dao;

import java.util.List;

import com.lhn.tutor.entity.Taught;


public interface TaughtDao {
	
	//自动补充订单教师详情
	public List<Object> querydetail(String teacher_id);
	
	//通过oth技能查找
	public List<Object> querybyoth();
	
	//通过教授学科查找教师
	public List<Object> querybysub(String sub);
	
	//通过id查找教师
	public List<Object> querybyid(String id);
}
