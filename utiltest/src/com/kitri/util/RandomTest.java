package com.kitri.util;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random random = new Random();
		//next가 들어간 메소드
		boolean b = random.nextBoolean();
		System.out.println("b === " + b);
		double d = random.nextDouble();
		System.out.println("d === " + d);
		int i = random.nextInt();
		System.out.println("i === " + i);
//		0~255
		int r = random.nextInt(256);
		System.out.println("r === " + r);
	}
}
