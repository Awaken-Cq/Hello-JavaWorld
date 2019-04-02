package com.kitri.exception.runtime;

import java.util.Random;

public class ArithMeticTest {

	public static void main(String[] args) {
		Random random = new Random();
		int x = 30;
//		ArithmeticException - Runtime -> logic
		
//		RuntimeException은 logic으로 처리...
//		int y = random.nextInt(5);
//		try {
//		int z = x / y;
//		System.out.println(x + " / " + y + " = " + z);
//		}catch(ArithmeticException e) {
//			시스템 메세지를 표시하는 메소드'.getMessage()'
//			System.out.println(e.getMessage());
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
		
//		1. 위 코드와 차이점. 위의 코드는 에러가 낫기때문에 0으로~로 처리하는 것이고
//		아래코드는 비교를 하여 에러가 나기전에 메세지 표시
		int y = random.nextInt(5);
		if(y != 0) {
			int z = x / y;
			System.out.println(x + " / " + y + " = " + z);			
		}else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
//		2.0이 절대 나오지 않게끔 logic으로 완벽하게 처리.
//		int y = random.nextInt(4)+1;
//		int z = x / y;
//		System.out.println(x + " / " + y + " = " + z);
		
	}

}
