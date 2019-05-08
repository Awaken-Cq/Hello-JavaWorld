package com.kitri.lang;

//Wrapper Class : �⺻DT�� Ŭ����ȭ
//�⺻DT		WrapperClass
//boolean	Boolean
//char		Character
//byte		Byte
//short		Short
//int		Integer
//long		Long
//float		Float
//double	Double

public class WrapperClassTest {

	public static void main(String[] args) {
		Boolean b1 = new Boolean("true");
		boolean b2 = b1.booleanValue();
		
		boolean b3 = Boolean.parseBoolean("true");
		
		if(b2)
			System.out.println("b2�� true��");
		if(b3)
			System.out.println("b3�� true��");
		
		String s ="123";
		System.out.println(s + 4);
//		int x = (int) s; �Ұ���.
//		Integer i = new Integer(s); ��ü����
//		int x = i.intValue(); ���� �޼ҵ� Ȱ��
		//parse ���� ���� ���� �� ����ϱ�.
		int x = Integer.parseInt(s);
		System.out.println(x + 4);
		
		s = "123.45";
		double d = Double.parseDouble(s);
		System.out.println(d + 4);
		
		//autoboxing
		//wrapper Ŭ������ 3�� �⺻DT int�� �ٸ����� ���� int�� ����ϱ⶧����
		//������. �� ���� ������ Ÿ�Կ� ���ؼ� ����ȯ�� �����ϴ�.
		Integer i2 = new Integer(3);
		//unboxing
		int y = i2;
				
		//boxing �ڵ�����ȯ �Ǿ����.	
		Integer i3 = y;
		
		
		
	}
}
