package com.lhn.tutor.entity;

public class Teacher {

	private String tId;// 教师号
	private String tName;// 姓名
	private String tIdcard;// 身份证号
	private String tGender;// 性别
	private String tBirthday;//出生年月
	private String tPlace;// 籍贯
	private String tPicture;// 身份证照片
	private String tPolity;// 政治面貌
	private String tSchool;// 学校
	private String tMajor;// 专业
	private String tGrade;// 年纪
	private String tTel;// 手机
	private String tOnline;// QQ/WeChat
	private String tEmail;// 邮箱
	private String tAddress;// 现居地址
	private String tFamilyaddress;// 家庭地址
	private int tZipcode;// 邮政编码

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
