package com.lhn.tutor.entity;

public class Resume {

	private String rId;// ������
	private String rFirstteach;// ��Ҫ���ڿγ�
	private String rSecondteach;// �ڶ����ڿγ�

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
