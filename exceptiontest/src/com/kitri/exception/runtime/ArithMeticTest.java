package com.kitri.exception.runtime;

import java.util.Random;

public class ArithMeticTest {

	public static void main(String[] args) {
		Random random = new Random();
		int x = 30;
//		ArithmeticException - Runtime -> logic
		
//		RuntimeException�� logic���� ó��...
//		int y = random.nextInt(5);
//		try {
//		int z = x / y;
//		System.out.println(x + " / " + y + " = " + z);
//		}catch(ArithmeticException e) {
//			�ý��� �޼����� ǥ���ϴ� �޼ҵ�'.getMessage()'
//			System.out.println(e.getMessage());
//			System.out.println("0���� ���� �� �����ϴ�.");
//		}
		
//		1. �� �ڵ�� ������. ���� �ڵ�� ������ ���⶧���� 0����~�� ó���ϴ� ���̰�
//		�Ʒ��ڵ�� �񱳸� �Ͽ� ������ �������� �޼��� ǥ��
		int y = random.nextInt(5);
		if(y != 0) {
			int z = x / y;
			System.out.println(x + " / " + y + " = " + z);			
		}else {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
//		2.0�� ���� ������ �ʰԲ� logic���� �Ϻ��ϰ� ó��.
//		int y = random.nextInt(4)+1;
//		int z = x / y;
//		System.out.println(x + " / " + y + " = " + z);
		
	}

}
