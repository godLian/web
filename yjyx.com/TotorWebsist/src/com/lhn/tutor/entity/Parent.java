package com.lhn.tutor.entity;

//家长实体类
public class Parent {

	private String pId;// 家长号
	private String pName;// 姓名
	private String pIdcard;// 省份证
	private String pGender;// 年纪
	private String pBirthday;// 出生
	private String pPlace;// 籍贯
	private String pPicture;// 省份证图片
	private String pTel;// 手机
	private String pOnline;// QQ/WeChat
	private String pEmail;// 邮箱
	private String pAddress;// 现居地址
	private String pFamilyaddress;// 家庭地址
	private String pZipcode;// 邮政编码

	public Parent() {
	}

	public Parent(String pId, String pName, String pIdcard, String pGender,
			String pBirthday, String pPlace, String pPicture, String pTel,
			String pOnline, String pEmail, String pAddress,
			String pFamilyaddress, String pZipcode) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pIdcard = pIdcard;
		this.pGender = pGender;
		this.pBirthday = pBirthday;
		this.pPlace = pPlace;
		this.pPicture = pPicture;
		this.pTel = pTel;
		this.pOnline = pOnline;
		this.pEmail = pEmail;
		this.pAddress = pAddress;
		this.pFamilyaddress = pFamilyaddress;
		this.pZipcode = pZipcode;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpIdcard() {
		return pIdcard;
	}

	public void setpIdcard(String pIdcard) {
		this.pIdcard = pIdcard;
	}

	public String getpGender() {
		return pGender;
	}

	public void setpGender(String pGender) {
		this.pGender = pGender;
	}

	public String getpBirthday() {
		return pBirthday;
	}

	public void setpBirthday(String pBirthday) {
		this.pBirthday = pBirthday;
	}

	public String getpPlace() {
		return pPlace;
	}

	public void setpPlace(String pPlace) {
		this.pPlace = pPlace;
	}

	public String getpPicture() {
		return pPicture;
	}

	public void setpPicture(String pPicture) {
		this.pPicture = pPicture;
	}

	public String getpTel() {
		return pTel;
	}

	public void setpTel(String pTel) {
		this.pTel = pTel;
	}

	public String getpOnline() {
		return pOnline;
	}

	public void setpOnline(String pOnline) {
		this.pOnline = pOnline;
	}

	public String getpEmail() {
		return pEmail;
	}

	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}

	public String getpAddress() {
		return pAddress;
	}

	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	public String getpFamilyaddress() {
		return pFamilyaddress;
	}

	public void setpFamilyaddress(String pFamilyaddress) {
		this.pFamilyaddress = pFamilyaddress;
	}

	public String getpZipcode() {
		return pZipcode;
	}

	public void setpZipcode(String pZipcode) {
		this.pZipcode = pZipcode;
	}

}
