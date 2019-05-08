package com.kitri.util.jcf;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		System.out.println("list size = " + list.size());
		list.add("허경민");
		list.add("정수빈");
		list.add("박건우");
		list.add("김재환");		
//		자동으로 늘어남
		System.out.println("list size = " + list.size());

		System.out.println("--두산의 타순--");
//		1.
//		String name[] = list.toArray(new String[0]);
//		int len = name.length;
//				for (int i = 0; i < len; i++) {
//					System.out.println(i+1 + "번 타자 :" + name[i]);
//				}
//		2.
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(i+1 + "번 타자 :" + list.get(i));
		}
		
		String name = "정수빈";
		String name2 = "오재원";
//		1.
//		System.out.println(name + "은 " + (list.indexOf(name)+1) + "번타자입니다.");
//		System.out.println(name + "을 " + name2 + "으로 교체.");
//		list.set(list.indexOf(name),name2);
		
//		2. DIO를 쓰게되면? "2." 방법을 더 많이 씀
		for (int i = 0; i < size; i++) {
			if(list.get(i).equals(name)) {
				System.out.println(name + "은 " + (i+1) + "번타자입니다.");
				break;
			}
		}
		System.out.println(name + "을 " + name2 + "으로 교체.");
		for (int i = 0; i < size; i++) {
			if(list.get(i).equals(name)) {
				list.set(i, name2);
				break;
			}
		}
		
		size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(i+1 + "번 타자 :" + list.get(i));
		}
	}

}
