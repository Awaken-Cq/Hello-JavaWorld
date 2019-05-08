package com.kitri.io;

import java.io.*;

public class BufferdReaderTest {

	public static void main(String[] args) {
		BufferedReader fin = null;
		FileWriter fw = null;
		try {
//		InputStream is = System.in;
//		Reader r = new InputStreamReader(is);
//		BufferedReader in = new BufferedReader(r);
//			위 3개의 코드를 하나로 합칠 수 있음.
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("파일 이름 : ");
//			in.readLine()은 enter를 기준으로 읽어드린다. 즉, enter 전까지.
			String infile = in.readLine();
			System.out.println("infile == " + infile);
			
			System.out.println("복사할 파일 이름 : ");
			String outfile = in.readLine();
			fw = new FileWriter(new File(outfile));
			
//			inputStreamReader까지는 똑같고 근원지는달라짐.ex)File, Network etc
			fin = new BufferedReader(new InputStreamReader(new FileInputStream(new File(infile))));
//			파일은 라인수를 읽어올수 없어서 readline으로 파일 전체를 읽을 수 없다.
//			그래서 readLine의 엔터전까지 읽는 특성을 이용해 반복하여 읽어온다(null이 나올때까지)
			String str = null;
			while((str = fin.readLine()) != null) {
				System.out.println(str);
//			메모장은 원시적데이터라 \r\n이 엔터인데 에디터플러스 등 일반적인 GUI프로그램은 \n만 해도 엔터적용됨.
				fw.write(str + "\r\n");
			}
					} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
			if(fw != null)
				fw.close();
			if(fin != null)
				fin.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}

}
