package com.kitri.util.jcf.test5;

import java.util.ArrayList;
import java.util.List;

public class DramaListTest {

	public static void main(String[] args) {
		
//		List���� �������̽��� ���� ���� ��ü�� ��ü���� ���յ��� ���߱����� �������̽��� ����. ODB,MDB�� ����.
		List<Drama> lt = new ArrayList<Drama>();
		
		lt.add(new Drama("�� �ܿ�, �ٶ��� �д�.", "SBS", "�����", "���μ�", "������"));
		lt.add(new Drama("����� ����", "MBC", "�ּ���", null, null ));
		lt.add(new Drama("���̸���2", "KBS", "ǥ�μ�", "����", "�̴���"));
		lt.add(new Drama("�ְ�� �̼���", "KBS", "������", null, "������"));
//		��¿��� re[i]��� lt.get(i)�� �Է��ϸ� �̺κ��� �����.
//		Drama re[] = lt.toArray(new Drama[0]);
		
		int sz = lt.size();
		
				for (int i = 0; i < sz; i++) {
					System.out.println((i+1) + ". " + lt.get(i));
				}

	}

}
