package com.kitri.io;

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
//			생성파일 확인
		try {
			File infile = new File("F:\\iotest\\hello.txt");
			in = new FileInputStream(infile);
			long length = infile.length();
			byte b[] = new byte[(int) length];
			int x = in.read(b);
			System.out.println(x + "bytes read!!!");
			String str = new String(b,0,x);
			System.out.println(str);
			
//			복사파일생성
			File outfile = new File("F:\\iotest\\hello_copy.txt");
			out = new FileOutputStream(outfile);
			out.write(b);
			
//			in out이 노란 밑줄인 이유는 안닫았기 때문에 뭐든지 열었으면 닫아야한다.
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
