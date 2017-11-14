package com.lhn.tutor.dao;

import java.io.File;

import com.lhn.tutor.entity.Image;


public interface ImageDao {

	//图片上传保存
	public boolean saveImg(Image img);
	
	//认证图片
	public boolean savetouser(String user_id,String img_id);
	
	//通过id查询
	public File querybyid(String user_id);
}
