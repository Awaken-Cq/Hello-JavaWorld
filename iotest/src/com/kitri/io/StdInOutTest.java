package com.kitri.io;

import java.io.IOException;

public class StdInOutTest {
//Standard Input Output

	public static void main(String[] args) {
//		inputStream엔 문자열을 반환하는 메소드가 없다.
//		inputStream에서 문자열을 반환하려면 아래와 같이 해야한다.
		
			try {
//				System.out.print("입력 : ");
//				int x= System.in.read();
//				System.out.println("1.x == " + x);
//				System.out.println("1.x == " + (char)x);
				
//				read(byte[] b)
//				
				System.out.print("입력2 : ");
				byte b[] = new byte[100];
//				x는 읽어드린 바이트수  a문자 + enter'\n'(문자) 즉 , a 는 char 2바이트지만
//				영문하나이기 때문에1바이트만 차있다  + 2byte
				int x = System.in.read(b);
				System.out.println("2.x == " + x);	//	(x-2) :'\n'의 2byte 제거.
				int len = b.length;
						for (int i = 0; i < len; i++) {
							System.out.println(b[i]);
						}
//				String(byte[] bytes, int offset, int length)
//				b[]에서 b배열을 0부터 x-2까지 문자열에 넣어서 문자열 출력
				String s = new String(b, 0, x -2);
				System.out.println("s == " + s);
				
			} catch (IOException e) {
				e.printStackTrace();
			}



	}

}
