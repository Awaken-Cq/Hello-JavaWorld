package com.kitri.io;

import java.io.IOException;

public class StdInOutTest {
//Standard Input Output

	public static void main(String[] args) {
//		inputStream�� ���ڿ��� ��ȯ�ϴ� �޼ҵ尡 ����.
//		inputStream���� ���ڿ��� ��ȯ�Ϸ��� �Ʒ��� ���� �ؾ��Ѵ�.
		
			try {
//				System.out.print("�Է� : ");
//				int x= System.in.read();
//				System.out.println("1.x == " + x);
//				System.out.println("1.x == " + (char)x);
				
//				read(byte[] b)
//				
				System.out.print("�Է�2 : ");
				byte b[] = new byte[100];
//				x�� �о�帰 ����Ʈ��  a���� + enter'\n'(����) �� , a �� char 2����Ʈ����
//				�����ϳ��̱� ������1����Ʈ�� ���ִ�  + 2byte
				int x = System.in.read(b);
				System.out.println("2.x == " + x);	//	(x-2) :'\n'�� 2byte ����.
				int len = b.length;
						for (int i = 0; i < len; i++) {
							System.out.println(b[i]);
						}
//				String(byte[] bytes, int offset, int length)
//				b[]���� b�迭�� 0���� x-2���� ���ڿ��� �־ ���ڿ� ���
				String s = new String(b, 0, x -2);
				System.out.println("s == " + s);
				
			} catch (IOException e) {
				e.printStackTrace();
			}



	}

}
