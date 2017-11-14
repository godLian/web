package com.lhn.tutor.entity;

public class Resume {

	private String rId;// 简历号
	private String rFirstteach;// 主要教授课程
	private String rSecondteach;// 第二教授课程

	public Resume() {
	}

	public Resume(String rId, String rFirstteach, String rSecondteach) {
		//super();
		this.rId = rId;
		this.rFirstteach = rFirstteach;
		this.rSecondteach = rSecondteach;
	}

	public String getrId() {
		return rId;
	}

	public void setrId(String rId) {
		this.rId = rId;
	}

	public String getrFirstteach() {
		return rFirstteach;
	}

	public void setrFirstteach(String rFirstteach) {
		this.rFirstteach = rFirstteach;
	}

	public String getrSecondteach() {
		return rSecondteach;
	}

	public void setrSecondteach(String rSecondteach) {
		this.rSecondteach = rSecondteach;
	}

}
