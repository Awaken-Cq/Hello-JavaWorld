package com.kitri.util.jcf.test5;

import java.util.HashSet;
import java.util.Set;

public class SonataArrayTest {

	public static void main(String[] args) {
		
		Sonata so[] = new Sonata[4];
		
		
		
		so[0] = new Sonata("흰색", 5000, "승용", "NF");
		so[1] = new Sonata("은색", 7000, "업무", "Brilliant");
		so[2] = new Sonata("감홍색", 4000, "택시", "EF");
		so[3] = new Sonata("검정색", 6000, "승용", "Hybrid");
		
		System.out.println("==================== Sonata 생산 시작 ====================");
		
		
		int sz = so.length;
		
				for (int i = 0; i < sz; i++) {
					System.out.println(so[i]);
				}
		
		

	}

}
