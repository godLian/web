package com.lhn.tutor.entity;

public class Student {

	private String sId;// ѧ��
	private String sName;// ����
	private String sIdcard;// ���֤��
	private String sGender;// �Ա�
	private String sBirthday;// ��������
	private String sPlace;// ����
	private String sPicture;// ���֤��Ƭ
	private String sSchool;// �Ͷ�ѧУ
	private String sGrade;// �꼶
	private String sTel;// �ֻ�
	private String sOnline;// QQ/WeChat
	private String sEmail;// ����
	private String sAddress;// �־ӵ�ַ
	private String sFamilyaddress;// ��ͥ��ַ
	private int sZipcode;// ��������

	public Student() {
	}

	public Student(String sId, String sName, String sIdcard, String sGender,
			String sBirthday, String sPlace, String sPicture, String sSchool,
			String sGrade, String sTel, String sOnline, String sEmail,
			String sAddress, String sFamilyaddress, int sZipcode) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sIdcard = sIdcard;
		this.sGender = sGender;
		this.sBirthday = sBirthday;
		this.sPlace = sPlace;
		this.sPicture = sPicture;
		this.sSchool = sSchool;
		this.sGrade = sGrade;
		this.sTel = sTel;
		this.sOnline = sOnline;
		this.sEmail = sEmail;
		this.sAddress = sAddress;
		this.sFamilyaddress = sFamilyaddress;
		this.sZipcode = sZipcode;
	}

	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsIdcard() {
		return sIdcard;
	}

	public void setsIdcard(String sIdcard) {
		this.sIdcard = sIdcard;
	}

	public String getsGender() {
		return sGender;
	}

	public void setsGender(String sGender) {
		this.sGender = sGender;
	}

	public String getsBirthday() {
		return sBirthday;
	}

	public void setsBirthday(String sBirthday) {
		this.sBirthday = sBirthday;
	}

	public String getsPlace() {
		return sPlace;
	}

	public void setsPlace(String sPlace) {
		this.sPlace = sPlace;
	}

	public String getsPicture() {
		return sPicture;
	}

	public void setsPicture(String sPicture) {
		this.sPicture = sPicture;
	}

	public String getsSchool() {
		return sSchool;
	}

	public void setsSchool(String sSchool) {
		this.sSchool = sSchool;
	}

	public String getsGrade() {
		return sGrade;
	}

	public void setsGrade(String sGrade) {
		this.sGrade = sGrade;
	}

	public String getsTel() {
		return sTel;
	}

	public void setsTel(String sTel) {
		this.sTel = sTel;
	}

	public String getsOnline() {
		return sOnline;
	}

	public void setsOnline(String sOnline) {
		this.sOnline = sOnline;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public String getsFamilyaddress() {
		return sFamilyaddress;
	}

	public void setsFamilyaddress(String sFamilyaddress) {
		this.sFamilyaddress = sFamilyaddress;
	}

	public int getsZipcode() {
		return sZipcode;
	}

	public void setsZipcode(int sZipcode) {
		this.sZipcode = sZipcode;
	}

}
