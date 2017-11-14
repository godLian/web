package com.lhn.tutor.action;

import java.io.File;
import java.io.OutputStream;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;

import com.lhn.tutor.dao.ImagesDao;
import com.lhn.tutor.dao.impl.ImagesDaoImpl;
import com.lhn.tutor.entity.Images;
import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private File upload;

	private String uploadContentType;
	
	private String uploadFileName;
	
	private String result;
	
	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	@Override
	public String execute() throws Exception {
		String path = "E:/images";
		File file = new File(path);
		if(!file.exists()){
			file.mkdir();
		}
		
		//获取文件名的后缀
		int beginIndex = uploadFileName.lastIndexOf(".");
		int endIndex = uploadFileName.length();
		String suffix = uploadFileName.substring(beginIndex, endIndex);
		
		//新的命名
		String newname=cRandom(6)+suffix;
		System.out.println(newname );
		
		//将上传的文件保存到本地
		FileUtils.copyFile(upload, new File(file,newname));
		
		//String savepath=path+"/"+newname;//图片保存地址
		//把图片路径存入数据库
		Images images=new Images();
		images.setImgpath(newname);
		ImagesDao imagesDao=new ImagesDaoImpl();
		imagesDao.saveImg(images);
		String img_id=images.getId();
		
		File renameFile=new File(path+"/"+newname);
		if(renameFile.exists()){
			renameFile.renameTo(new File(path+""));
		}
		
		
		result="上传成功!";
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String user_id=(String) request.getSession().getAttribute("user_id");
		imagesDao.savetouser(user_id, img_id);
		System.out.println("sessionScop:"+user_id);
		return SUCCESS;
	}
	
	//生成随机字符串命名
	private String cRandom(int m) { // 产生1个长度为m只含有字母的随机字符串
        char[] chs = new char[m];
        for (int i = 0; i < m; i++) {
            chs[i] = cNumOrCharRandom();
        }
        return new String(chs);
    }
	
	private char cNumOrCharRandom() { // 产生一个随机数字或字母
        String temp = "0123456789qwertyuiopasdfghjklzxcvbnm";
        return (char) temp.charAt(iRandom(0, 35));
    }
	
	private int iRandom(int m, int n) { // 产生一个[m,n)之间的随机整数
        Random random = new Random();
        int small = m > n ? n : m;
        int big = m <= n ? n : m;
        return small + random.nextInt(big - small);
    }
	
}

