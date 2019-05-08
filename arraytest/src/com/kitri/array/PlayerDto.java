package com.kitri.array;

public class PlayerDto {
	/*
	 * private int number; private String name; private int position; private double
	 * grade; private String positionName; private String pt[] = {"지명타자", "투수",
	 * "포수", "1루수", "2루수", "3루수", "유격수", "좌익수","중견수", "우익수"};
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
	 * public String getKind (int a) { if(this.position != 1) return "타율"; else
	 * 
	 * return "방어율"; }
	 * 
	 * 
	 * @Override public String toString() { return "PlayerDto [등번호=" + number +
	 * "\t이름=" + name + "\t포지션=" + getPosition() + '\t' + getKind(position) + "=" +
	 * grade + "]"; }
	 */
	private int number;
	private String name;
	private int position;
	private double grade;
	
	private String pt[] = { "지명타자", "투수", "포수", "1루수", "2루수", "3루수", "유격수", "좌익수", "중견수", "우익수" };

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
		return "PlayerDto [등번호=" + number + "\t이름=" + name + "\t포지션=" + pt[position]  + (position != 1 ? "\t타율" : "\t방어율") + "="
				+ grade + "]";
	}

}
