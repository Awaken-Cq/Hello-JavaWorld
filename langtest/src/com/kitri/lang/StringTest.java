package com.kitri.lang;

public class StringTest {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("java");
		// ==는 앞에 레퍼런스가 나오면 주소값을 비교한다.
		// 리터럴방식으로 문자열을 만들었기 때문에 같다.
		// s1이 만들어지면서 "java"가 생성되었고
		// s2가 만들어지면서 봤더니 이미 "java"가 있어서 그 주소를 그대로 가짐.
		if (s1 == s2)
			System.out.println("s1 s2는 주소값이 같다.");// O
		// 주소영역이 아예 다르기때문에 값비교 자체가 불가능.
		if (s1 == s3)
			System.out.println("s1 s3는 주소값이 같다.");// X
		if (s1 == s4)
			System.out.println("s1 s4는 주소값이 같다.");// X
		if (s2 == s3)
			System.out.println("s2 s3는 주소값이 같다.");// X
		if (s2 == s4)
			System.out.println("s2 s4는 주소값이 같다.");// X
		if (s3 == s4)
			System.out.println("s3 s4는 주소값이 같다.");// X

		System.out.println("--------------------------");
		// object의 .equals는 주소값 비교지만 String 클래스에서 문자열비교로
		// override 했기때문에 문자열로 비교를 한다.
		if (s1.equals(s2))
			System.out.println("s1 s2는 주소값이 같다.");// O
		if (s1.equals(s3))
			System.out.println("s1 s3는 주소값이 같다.");// O
		if (s1.equals(s4))
			System.out.println("s1 s4는 주소값이 같다.");// O
		if (s2.equals(s3))
			System.out.println("s2 s3는 주소값이 같다.");// O
		if (s2.equals(s4))
			System.out.println("s2 s4는 주소값이 같다.");// O
		if (s3.equals(s4))
			System.out.println("s3 s4는 주소값이 같다.");// O
	}
}
