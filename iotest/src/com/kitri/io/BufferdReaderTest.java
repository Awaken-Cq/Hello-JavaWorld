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
//			�� 3���� �ڵ带 �ϳ��� ��ĥ �� ����.
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("���� �̸� : ");
//			in.readLine()�� enter�� �������� �о�帰��. ��, enter ������.
			String infile = in.readLine();
			System.out.println("infile == " + infile);
			
			System.out.println("������ ���� �̸� : ");
			String outfile = in.readLine();
			fw = new FileWriter(new File(outfile));
			
//			inputStreamReader������ �Ȱ��� �ٿ����´޶���.ex)File, Network etc
			fin = new BufferedReader(new InputStreamReader(new FileInputStream(new File(infile))));
//			������ ���μ��� �о�ü� ��� readline���� ���� ��ü�� ���� �� ����.
//			�׷��� readLine�� ���������� �д� Ư���� �̿��� �ݺ��Ͽ� �о�´�(null�� ���ö�����)
			String str = null;
			while((str = fin.readLine()) != null) {
				System.out.println(str);
//			�޸����� �����������Ͷ� \r\n�� �����ε� �������÷��� �� �Ϲ����� GUI���α׷��� \n�� �ص� ���������.
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
