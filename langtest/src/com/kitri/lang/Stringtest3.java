package com.kitri.lang;

public class Stringtest3 {

	public static void main(String[] args) {
		/*
		String str = "hello java!!";
		char c = str.charAt(4);
		System.out.println("c == " + c);

		String str2 = "123";
		int x = str2.charAt(0)-48;
		System.out.println("x == " + x);
		*/
		
		
		String str = "1a3";
		int len = str.length();
		System.out.println("length ==" + len);
		
		String result = "�����Դϴ�.";
		
		for (int i = 0; i < len; i++) {
			int num = str.charAt(i) - 48;
			if (num <0 || num > 9) {
				result = "���ڰ� �ƴմϴ�.";
				break;
			}
		}
		System.out.println(str + "�� " + result);
		
		String str1 = "hello";
		String str2 = "java";
		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2));
		
		str = "hello java !!!";
		if(str.startsWith("h"))
			System.out.println(str + "�� h�� �����Ѵ�");
		
		if(str.endsWith("!!"))
			System.out.println(str + "�� !!�� ������.");
		
		String s1 = "jAva";
		String s2 = "JavA";
		System.out.println("s1.toUpperCase() == " + s1.toUpperCase());
		System.out.println("s2.toLowerCase() == " + s2.toLowerCase());
		if(s1.equals(s2))
			System.out.println(s1 + "��" + s2 + "�� ���� ���ڿ��̴�.");
		else
			System.out.println(s1 + "��" + s2 + "�� �ٸ� ���ڿ��̴�.");
		
		if(s1.toUpperCase().equals(s2.toUpperCase()))
			System.out.println(s1 + "��" + s2 + "�� ��ҹ��� ���о��� ���� ���ڿ��̴�.");
		else
			System.out.println(s1 + "��" + s2 + "�� ��ҹ��� ���о��� �ٸ� ���ڿ��̴�.");
	
	}

}
