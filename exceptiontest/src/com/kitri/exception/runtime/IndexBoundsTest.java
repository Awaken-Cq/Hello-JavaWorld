package com.kitri.exception.runtime;

public class IndexBoundsTest {

	public static void main(String[] args) {
		
//		arrayindex outofbounds exception - Runtime -> logic
		
		String s[] = { "1", "2", "3", "4" };
//		'<='으로 인해 4번째가 없음에도 4번째를 찍으려했기에 에러
//		for (int i = 0; i <= 4; i++) {
//			System.out.println(s[i]);
//		}
		
//		또한 배열의 길이는 숫자보다 length를 사용하는게 좋다.
		int len = s.length;
		for (int i = 0; i < len; i++) {
			System.out.println(s[i]);
		}
//		Stringindex outofbounds exception - Runtime -> logic
		
		String str = "hello";
		len = str.length();
		for (int i = 0; i < len; i++) {
			System.out.println(str.charAt(i));
		}

	}

}
