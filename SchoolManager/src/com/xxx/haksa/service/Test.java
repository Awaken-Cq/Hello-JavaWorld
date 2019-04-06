package com.xxx.haksa.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	
	static BufferedReader in;
	static byte b;
	static String s;
	static int m;
	public Test(){
		
		in = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	public static void main(String[] args) throws Exception {
	
		try {
			
			in = new BufferedReader(new InputStreamReader(System.in));
		 s = in.readLine();
		
		 Boolean flag = false;
		 System.out.println(flag);
		 int len = s.length();
		 for(int i = 0; i < len ; i++) {
			m = s.charAt(i) - 48;
			if(m >= 0 && m < 10)
				flag = true;
		 }
			 System.out.println(flag);
			
			
			
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}

}
