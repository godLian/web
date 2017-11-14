package com.lhn.tutor.entity;

public class Teacher {

	private String tId;// ��ʦ��
	private String tName;// ����
	private String tIdcard;// ���֤��
	private String tGender;// �Ա�
	private String tBirthday;//��������
	private String tPlace;// ����
	private String tPicture;// ���֤��Ƭ
	private String tPolity;// ������ò
	private String tSchool;// ѧУ
	private String tMajor;// רҵ
	private String tGrade;// ���
	private String tTel;// �ֻ�
	private String tOnline;// QQ/WeChat
	private String tEmail;// ����
	private String tAddress;// �־ӵ�ַ
	private String tFamilyaddress;// ��ͥ��ַ
	private int tZipcode;// ��������

	public Teacher() {
	}

	public Teacher(String tId, String tName, String tIdcard, String tGender,
			String tPlace, String tPicture, String tPolity, String tSchool,
			String tMajor, String tGrade, String tTel, String tOnline,
			String tEmail, String tAddress, String tFamilyaddress, int tZipcode) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.tIdcard = tIdcard;
		this.tGender = tGender;
		this.tPlace = tPlace;
		this.tPicture = tPicture;
		this.tPolity = tPolity;
		this.tSchool = tSchool;
		this.tMajor = tMajor;
		this.tGrade = tGrade;
		this.tTel = tTel;
		this.tOnline = tOnline;
		this.tEmail = tEmail;
		this.tAddress = tAddress;
		this.tFamilyaddress = tFamilyaddress;
		this.tZipcode = tZipcode;
	}

	public String gettBirthday() {
		return tBirthday;
	}

	public void settBirthday(String tBirthday) {
		this.tBirthday = tBirthday;
	}

	public String gettId() {
		return tId;
	}

	public void settId(String tId) {
		this.tId = tId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettIdcard() {
		return tIdcard;
	}

	public void settIdcard(String tIdcard) {
		this.tIdcard = tIdcard;
	}

	public String gettGender() {
		return tGender;
	}

	public void settGender(String tGender) {
		this.tGender = tGender;
	}

	public String gettPlace() {
		return tPlace;
	}

	public void settPlace(String tPlace) {
		this.tPlace = tPlace;
	}

	public String gettPicture() {
		return tPicture;
	}

	public void settPicture(String tPicture) {
		this.tPicture = tPicture;
	}

	public String gettPolity() {
		return tPolity;
	}

	public void settPolity(String tPolity) {
		this.tPolity = tPolity;
	}

	public String gettSchool() {
		return tSchool;
	}

	public void settSchool(String tSchool) {
		this.tSchool = tSchool;
	}

	public String gettMajor() {
		return tMajor;
	}

	public void settMajor(String tMajor) {
		this.tMajor = tMajor;
	}

	public String gettGrade() {
		return tGrade;
	}

	public void settGrade(String tGrade) {
		this.tGrade = tGrade;
	}

	public String gettTel() {
		return tTel;
	}

	public void settTel(String tTel) {
		this.tTel = tTel;
	}

	public String gettOnline() {
		return tOnline;
	}

	public void settOnline(String tOnline) {
		this.tOnline = tOnline;
	}

	public String gettEmail() {
		return tEmail;
	}

	public void settEmail(String tEmail) {
		this.tEmail = tEmail;
	}

	public String gettAddress() {
		return tAddress;
	}

	public void settAddress(String tAddress) {
		this.tAddress = tAddress;
	}

	public String gettFamilyaddress() {
		return tFamilyaddress;
	}

	public void settFamilyaddress(String tFamilyaddress) {
		this.tFamilyaddress = tFamilyaddress;
	}

	public int gettZipcode() {
		return tZipcode;
	}

	public void settZipcode(int tZipcode) {
		this.tZipcode = tZipcode;
	}

}
