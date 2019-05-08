package com.kitri.lang;

//Wrapper Class : 기본DT을 클래스화
//기본DT		WrapperClass
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
			System.out.println("b2는 true다");
		if(b3)
			System.out.println("b3는 true다");
		
		String s ="123";
		System.out.println(s + 4);
//		int x = (int) s; 불가능.
//		Integer i = new Integer(s); 객체생성
//		int x = i.intValue(); 으로 메소드 활용
		//parse 아주 많이 쓰니 꼭 기억하길.
		int x = Integer.parseInt(s);
		System.out.println(x + 4);
		
		s = "123.45";
		double d = Double.parseDouble(s);
		System.out.println(d + 4);
		
		//autoboxing
		//wrapper 클래스의 3과 기본DT int은 다르지만 같은 int를 취급하기때문에
		//가능함. 즉 같은 데이터 타입에 한해서 형변환이 가능하다.
		Integer i2 = new Integer(3);
		//unboxing
		int y = i2;
				
		//boxing 자동형변환 되어버림.	
		Integer i3 = y;
		
		
		
	}
}
