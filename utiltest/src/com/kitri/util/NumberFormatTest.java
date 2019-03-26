package com.kitri.util;



import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberFormatTest {

	public static void main(String[] args) {
		double number = 34563242365453.1267843;
		//		34,563,242,35,453.13
		NumberFormat n = new DecimalFormat("##,###,###,##,###.##");
		
		String nf = n.format(number);
		System.out.println(nf);

		
		
	}

}
