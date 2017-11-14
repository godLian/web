package com.lhn.tutor.entity;

//大学生认证实体类
public class College {

	private String id;// 用户id
	private String city;// 学校所在地
	private String school;// 学校
	private String major;// 专业
	private String year;// 入学年份
	private String years;// 3-6年制
	private boolean isschool;// 审核是否通过
	private Taught taught;// 教师

	public College(String id, String city, String school, String major,
			String year, String years, boolean isschool, Taught taught) {
		super();
		this.id = id;
		this.city = city;
		this.school = school;
		this.major = major;
		this.year = year;
		this.years = years;
		this.isschool = isschool;
		this.taught = taught;
	}

	public College() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}

	public boolean getIsschool() {
		return isschool;
	}

	public void setIsschool(boolean isschool) {
		this.isschool = isschool;
	}

	public Taught getTaught() {
		return taught;
	}

	public void setTaught(Taught taught) {
		this.taught = taught;
	}

}
