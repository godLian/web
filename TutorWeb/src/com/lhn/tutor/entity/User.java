package com.lhn.tutor.entity;

public class User {

	private String id;// �û�id
	private String username;// �û���
	private String password;// ����
	private String name;// ��ʵ����
	private String idcard;// ���֤��
	private String gender;// �Ա�
	private String birthday;// ��������
	private String place;// ����
	private String tel;// ��ϵ��ʽ
	private String online;// QQ/WeChat
	private String email;// ����
	private String address;// ��ͥ��ַ
	private String zipcode;// ��������
	private String type;// �û�����
	
	public User() {
	}

	public User(String id, String username, String password, String name,
			String idcard, String gender, String birthday, String place,
			String tel, String online, String email, String address,
			String zipcode, String type) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.idcard = idcard;
		this.gender = gender;
		this.birthday = birthday;
		this.place = place;
		this.tel = tel;
		this.online = online;
		this.email = email;
		this.address = address;
		this.zipcode = zipcode;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getOnline() {
		return online;
	}

	public void setOnline(String online) {
		this.online = online;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
