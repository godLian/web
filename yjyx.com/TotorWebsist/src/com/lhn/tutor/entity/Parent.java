package com.lhn.tutor.entity;

//�ҳ�ʵ����
public class Parent {

	private String pId;// �ҳ���
	private String pName;// ����
	private String pIdcard;// ʡ��֤
	private String pGender;// ���
	private String pBirthday;// ����
	private String pPlace;// ����
	private String pPicture;// ʡ��֤ͼƬ
	private String pTel;// �ֻ�
	private String pOnline;// QQ/WeChat
	private String pEmail;// ����
	private String pAddress;// �־ӵ�ַ
	private String pFamilyaddress;// ��ͥ��ַ
	private String pZipcode;// ��������

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
