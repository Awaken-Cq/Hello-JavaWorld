package com.kitri.lang;

import java.io.UnsupportedEncodingException;

public class StringTest2 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//String str1 = null;
		String str1 = new String();//""
		System.out.println("문자열 길이 : " + str1.length());
		
		//byte의 배열이 숫자값을 갖고 있지만 문자열로 출력되기때문에 아스키코드값으로 변환되어 출력.
		//byte b[] = {97, 98, 99, 100};
		byte b[] = {-66, -56, -77, -25, -57, -49, -68, -68, -65, -28, 46};
		String str2 = new String(b);
		System.out.println("str2 == " + str2);
		
		//utf-8은 전세계문자를 모두 표현할 수 있다. (3byte처리함.)
		// 이 형식은 글자를 쓴다라기보다 똑같이 그린다라고 표현하는게 맞다.
		byte b2[] = {-20,-107, -120, -21, -123, -107
				, -19, -107, -104, -20, -124, -72, -20, -102, -108, 46};
		String str3 = new String(b2, "utf-8");
		System.out.println("str3 == " + str3);
		
		
		byte b3[] = {97, 98, 99, 100, 101, 102, 103, 104};
		String str4 = new String(b3, 2, 4);	//	시작점 2 : 99 부터, 길이4 : 102까지.
		System.out.println("str4 == " + str4);
		
		char c[] = {'a', 'b', 'c', 'd', 'e', 'f'};
		String str5 = new String(c);
		System.out.println("str5 == " + str5);
		
		char c2[] = {'a', 'b', 'c', 'd', 'e', 'f'};
		String str6 = new String(c2, 2, 4);
		System.out.println("str6 == " + str6);
	}
}
