package com.lhn.tutor.entity;

public class Image {

	private String id;// 用户id
	private String idcard;// 身份证照片
	private boolean isidcard;// 审核身份证照片是否合格
	private String headcard;// 头像
	private boolean isheadcard;// 审核头像是否合格
	private Taught taught;// 教师

	public Image() {
	}

	public Image(String id, String idcard, boolean isidcard, String headcard,
			boolean isheadcard, Taught taught) {
		super();
		this.id = id;
		this.idcard = idcard;
		this.isidcard = isidcard;
		this.headcard = headcard;
		this.isheadcard = isheadcard;
		this.taught = taught;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public boolean isIsidcard() {
		return isidcard;
	}

	public void setIsidcard(boolean isidcard) {
		this.isidcard = isidcard;
	}

	public String getHeadcard() {
		return headcard;
	}

	public void setHeadcard(String headcard) {
		this.headcard = headcard;
	}

	public boolean isIsheadcard() {
		return isheadcard;
	}

	public void setIsheadcard(boolean isheadcard) {
		this.isheadcard = isheadcard;
	}

	public Taught getTaught() {
		return taught;
	}

	public void setTaught(Taught taught) {
		this.taught = taught;
	}

}
