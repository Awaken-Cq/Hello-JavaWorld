package com.kitri.util.jcf.test5;

import java.util.HashSet;
import java.util.Set;

public class SonataArrayTest {

	public static void main(String[] args) {
		
		Sonata so[] = new Sonata[4];
		
		
		
		so[0] = new Sonata("���", 5000, "�¿�", "NF");
		so[1] = new Sonata("����", 7000, "����", "Brilliant");
		so[2] = new Sonata("��ȫ��", 4000, "�ý�", "EF");
		so[3] = new Sonata("������", 6000, "�¿�", "Hybrid");
		
		System.out.println("==================== Sonata ���� ���� ====================");
		
		
		int sz = so.length;
		
				for (int i = 0; i < sz; i++) {
					System.out.println(so[i]);
				}
		
		

	}

}
