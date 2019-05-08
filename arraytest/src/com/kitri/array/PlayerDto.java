package com.kitri.array;

public class PlayerDto {
	/*
	 * private int number; private String name; private int position; private double
	 * grade; private String positionName; private String pt[] = {"����Ÿ��", "����",
	 * "����", "1���", "2���", "3���", "���ݼ�", "���ͼ�","�߰߼�", "���ͼ�"};
	 * 
	 * 
	 * public PlayerDto(int number, String name, int position, double grade) {
	 * super(); this.number = number; this.name = name; this.position = position;
	 * this.grade = grade; }
	 * 
	 * public int getNumber() { return number; }
	 * 
	 * public void setNumber(int number) { this.number = number; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public String getPosition() { int i = this.position; positionName = pt[i];
	 * return positionName; }
	 * 
	 * public void setPosition(int position) {
	 * 
	 * this.position = position; }
	 * 
	 * public double getGrade() { return grade; }
	 * 
	 * public void setGrade(double grade) { this.grade = grade; }
	 * 
	 * public String getKind (int a) { if(this.position != 1) return "Ÿ��"; else
	 * 
	 * return "�����"; }
	 * 
	 * 
	 * @Override public String toString() { return "PlayerDto [���ȣ=" + number +
	 * "\t�̸�=" + name + "\t������=" + getPosition() + '\t' + getKind(position) + "=" +
	 * grade + "]"; }
	 */
	private int number;
	private String name;
	private int position;
	private double grade;
	
	private String pt[] = { "����Ÿ��", "����", "����", "1���", "2���", "3���", "���ݼ�", "���ͼ�", "�߰߼�", "���ͼ�" };

	public PlayerDto(int number, String name, int position, double grade) {
		super();
		this.number = number;
		this.name = name;
		this.position = position;
		this.grade = grade;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position; 
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	
	@Override
	public String toString() {
		return "PlayerDto [���ȣ=" + number + "\t�̸�=" + name + "\t������=" + pt[position]  + (position != 1 ? "\tŸ��" : "\t�����") + "="
				+ grade + "]";
	}

}
