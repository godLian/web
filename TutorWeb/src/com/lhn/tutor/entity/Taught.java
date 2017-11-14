package com.lhn.tutor.entity;

//��ʦʵ����
public class Taught {

	private String id;// ��ʦ��
	private String motto;// ������
	private String price;// ��ʱ��
	private String exper;// �ҽ̾���
	private String firstsub;// ��һ���ڿ�Ŀ
	private String secondsub;// �ڶ����ڿ�Ŀ
	private String type;// �ڿη�ʽ
	private String profile;// ���
	private College college;// У԰��֤
	private Image image;// ͼƬ

	public Taught() {
		super();
	}

	public Taught(String id, String motto, String price, String exper,
			String firstsub, String secondsub, String type, String profile,
			College college, Image image) {
		super();
		this.id = id;
		this.motto = motto;
		this.price = price;
		this.exper = exper;
		this.firstsub = firstsub;
		this.secondsub = secondsub;
		this.type = type;
		this.profile = profile;
		this.college = college;
		this.image = image;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMotto() {
		return motto;
	}

	public void setMotto(String motto) {
		this.motto = motto;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getExper() {
		return exper;
	}

	public void setExper(String exper) {
		this.exper = exper;
	}

	public String getFirstsub() {
		return firstsub;
	}

	public void setFirstsub(String firstsub) {
		this.firstsub = firstsub;
	}

	public String getSecondsub() {
		return secondsub;
	}

	public void setSecondsub(String secondsub) {
		this.secondsub = secondsub;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

}
