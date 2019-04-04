package com.kitri.io;

import java.io.*;

public class FileReaderTest {

	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw = null;
		try {
			File infile = new File("F:\\iotest\\hello.txt");
			fr = new FileReader(infile);
			long length = infile.length();
			char c[] = new char[(int)length];
			int x = fr.read(c);
			System.out.println(x + "caracters read!!!");
			String str = new String(c);
			System.out.println(str);
//			byte는 바로바로 써지지만
//			chracter는 바로바로 쓸수 없다.
//			현재상황은 파일을 열고 작업을 해놓고 닫기를 안한 상태
			File outfile = new File("F:\\iotest\\hello_copy2.txt");
			fw = new FileWriter(outfile);
			fw.write(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null)
					fw.close();
				if(fr != null)
					fr.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
			
		
		
	}

}
