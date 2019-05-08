package com.kitri.lang;

public class StringVSBuffer {

	public static void main(String[] args) {
		//nanoTime() 작업완료까지의 시간을 나노초단위까지 표현
		long st = System.nanoTime();
//		String str = "hello ";
//		for(int i = 0 ; i < 500; i++) {
//			str += i;
//			
//		}
//		System.out.println(System.nanoTime() - st);
		
//		System.out.println(str);

		StringBuffer sb = new StringBuffer("hello ");
		for(int i = 0 ; i < 500; i++) {
			sb.append(i);
			
		}
		System.out.println(System.nanoTime() - st);
		
//		System.out.println(sb);
		
		
		
		//500
		//1072223 1073827 1177745
		
		//236704 201423 236704
		
		//5000
		//40943004 40611684 51487544
		//1107825 1069657 1059073

		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
