package com.kitri.exception.runtime;

public class IndexBoundsTest {

	public static void main(String[] args) {
		
//		arrayindex outofbounds exception - Runtime -> logic
		
		String s[] = { "1", "2", "3", "4" };
//		'<='���� ���� 4��°�� �������� 4��°�� �������߱⿡ ����
//		for (int i = 0; i <= 4; i++) {
//			System.out.println(s[i]);
//		}
		
//		���� �迭�� ���̴� ���ں��� length�� ����ϴ°� ����.
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
