package com.kitri.util.jcf.test5;

public class Sonata extends Car {
	
	private String series;
	private String use;
	
	
	public Sonata(String color, int account, String use, String series) {
		super(color, account);
		this.series = series;
		this.use = use;
	}


	


	@Override
	public String toString() {
		
		return super.toString() + 
				"\t[용도] " + use + "\t[시리즈] " + series;
	}
	


	
	
	
	
}
