package com.lhn.tutor.entity;

import java.util.Date;

/*
 * ����ʵ����
 */
public class Order {

	private String num;// ������
	private String status;// ״̬
	private String nowdate;// �µ�ʱ��
	private String targetname;// �̸�Ŀ��
	private String grade;// �꼶
	private String learning;// ѧϰ���
	private String direction;// �̸�����
	private String teachdate;// Ԥ�ڽ̸�ʱ���
	private String teacher_id;// �̸���ʦ
	private String user_id;// �µ��û�

	public Order() {
		super();
	}

	public Order(String num, String status, String nowdate,
			String targetname, String grade, String learning, String direction,
			String teachdate, String teacher_id, String user_id) {
		super();
		this.num = num;
		this.status = status;
		this.nowdate = nowdate;
		this.targetname = targetname;
		this.grade = grade;
		this.learning = learning;
		this.direction = direction;
		this.teachdate = teachdate;
		this.teacher_id = teacher_id;
		this.user_id = user_id;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNowdate() {
		return nowdate;
	}

	public void setNowdate(String nowdate) {
		this.nowdate = nowdate;
	}

	public String getTargetname() {
		return targetname;
	}

	public void setTargetname(String targetname) {
		this.targetname = targetname;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getLearning() {
		return learning;
	}

	public void setLearning(String learning) {
		this.learning = learning;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getTeachdate() {
		return teachdate;
	}

	public void setTeachdate(String teachdate) {
		this.teachdate = teachdate;
	}

	public String getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

}
