package com.kitri.io;

import java.io.*;

public class ReaderTest {

	public static void main(String[] args) {
		Reader in = null;
		
		try {
			in = new InputStreamReader(System.in);
			char c[] = new char[128];
			System.out.print("�Է� : ");
			int x = in.read(c);
//			abcd�� 6�� ���� enter�� "\r","\n" ���ڰ� 2����.
			System.out.println("x == " + x);
			
			int len = c.length;
					for (int i = 0; i < len; i++) {
						System.out.println(c[i]);
					}
			
			
			String str = new String(c,0,x-2);
			System.out.println(str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
