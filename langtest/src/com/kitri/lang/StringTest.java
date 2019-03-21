package com.kitri.lang;

public class StringTest {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("java");
		// ==�� �տ� ���۷����� ������ �ּҰ��� ���Ѵ�.
		// ���ͷ�������� ���ڿ��� ������� ������ ����.
		// s1�� ��������鼭 "java"�� �����Ǿ���
		// s2�� ��������鼭 �ô��� �̹� "java"�� �־ �� �ּҸ� �״�� ����.
		if (s1 == s2)
			System.out.println("s1 s2�� �ּҰ��� ����.");// O
		// �ּҿ����� �ƿ� �ٸ��⶧���� ���� ��ü�� �Ұ���.
		if (s1 == s3)
			System.out.println("s1 s3�� �ּҰ��� ����.");// X
		if (s1 == s4)
			System.out.println("s1 s4�� �ּҰ��� ����.");// X
		if (s2 == s3)
			System.out.println("s2 s3�� �ּҰ��� ����.");// X
		if (s2 == s4)
			System.out.println("s2 s4�� �ּҰ��� ����.");// X
		if (s3 == s4)
			System.out.println("s3 s4�� �ּҰ��� ����.");// X

		System.out.println("--------------------------");
		// object�� .equals�� �ּҰ� ������ String Ŭ�������� ���ڿ��񱳷�
		// override �߱⶧���� ���ڿ��� �񱳸� �Ѵ�.
		if (s1.equals(s2))
			System.out.println("s1 s2�� �ּҰ��� ����.");// O
		if (s1.equals(s3))
			System.out.println("s1 s3�� �ּҰ��� ����.");// O
		if (s1.equals(s4))
			System.out.println("s1 s4�� �ּҰ��� ����.");// O
		if (s2.equals(s3))
			System.out.println("s2 s3�� �ּҰ��� ����.");// O
		if (s2.equals(s4))
			System.out.println("s2 s4�� �ּҰ��� ����.");// O
		if (s3.equals(s4))
			System.out.println("s3 s4�� �ּҰ��� ����.");// O
	}
}
