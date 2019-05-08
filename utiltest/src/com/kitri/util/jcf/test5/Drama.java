package com.kitri.util.jcf.test5;

public class Drama extends TVProgram {
	private String director;
	private String actor;
	private String actress;
	
	

	public Drama(String title, String broadcast, String director, String actor, String actress) {
		super(title, broadcast);
		this.director = director;
		this.actor = actor;
		this.actress = actress;
	}


	public Drama(String director, String actor, String actress) {
		
		this.director = director;
		this.actor = actor;
		this.actress = actress;
	}





	@Override
	public String toString() {
		
		return super.toString() + "\t- ���� : " + director + "\n" +
				(actor != null ? "\t- ���ڹ�� : " + actor + "\n" : "") + 
				(actress != null ? "\t- ���ڹ�� : " + actress + "\n" : "");
	}
	
	
}
