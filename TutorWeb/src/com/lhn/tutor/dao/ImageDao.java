package com.lhn.tutor.dao;

import java.io.File;

import com.lhn.tutor.entity.Image;


public interface ImageDao {

	//ͼƬ�ϴ�����
	public boolean saveImg(Image img);
	
	//��֤ͼƬ
	public boolean savetouser(String user_id,String img_id);
	
	//ͨ��id��ѯ
	public File querybyid(String user_id);
}
