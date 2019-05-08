package com.kitri.util.jcf;

import java.util.*;

public class SetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("황선혜");
		set.add("박미래");
		set.add("이혜린");
		set.add("조윤영");
		set.add("박미래");

		System.out.println("set의 크기 : " + set.size());
//		1.
//		Object ob[] = set.toArray();
//		int len = ob.length;
//				for (int i = 0; i < len; i++) {
//					System.out.println((String)ob[i]);
//				}
//		2.
//		new String[0]이 의미하는것은 단지 새로운 스트링의 배열이라는뜻이며 배열의 크기는 중요치않기에 0으로 씀 <- api참고
		String str[] = set.toArray(new String[0]);
		int len = str.length;
		for (int i = 0; i < len; i++) {
			System.out.println(str[i]);
		}
		System.out.println("----------------------------------");
//		3.
		Iterator<String> iterate = set.iterator();
//		tokenizer에서 해봤음 hasNext
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		
	}

}
