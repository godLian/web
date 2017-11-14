package com.lhn.tutor.dao;

import java.util.List;

import com.lhn.tutor.entity.Taught;


public interface TaughtDao {
	
	//�Զ����䶩����ʦ����
	public List<Object> querydetail(String teacher_id);
	
	//ͨ��oth���ܲ���
	public List<Object> querybyoth();
	
	//ͨ������ѧ�Ʋ��ҽ�ʦ
	public List<Object> querybysub(String sub);
	
	//ͨ��id���ҽ�ʦ
	public List<Object> querybyid(String id);
}
