package com.kitri.util.jcf;

import java.util.*;

public class SetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Ȳ����");
		set.add("�ڹ̷�");
		set.add("������");
		set.add("������");
		set.add("�ڹ̷�");

		System.out.println("set�� ũ�� : " + set.size());
//		1.
//		Object ob[] = set.toArray();
//		int len = ob.length;
//				for (int i = 0; i < len; i++) {
//					System.out.println((String)ob[i]);
//				}
//		2.
//		new String[0]�� �ǹ��ϴ°��� ���� ���ο� ��Ʈ���� �迭�̶�¶��̸� �迭�� ũ��� �߿�ġ�ʱ⿡ 0���� �� <- api����
		String str[] = set.toArray(new String[0]);
		int len = str.length;
		for (int i = 0; i < len; i++) {
			System.out.println(str[i]);
		}
		System.out.println("----------------------------------");
//		3.
		Iterator<String> iterate = set.iterator();
//		tokenizer���� �غ��� hasNext
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		
	}

}
