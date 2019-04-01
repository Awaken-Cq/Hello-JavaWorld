package com.kitri.util.jcf;

import java.util.*;

public class CollectionTest {

	public static void main(String[] args) {
//		Collection coll = new ArrayList();
		Collection coll = new HashSet();
//		배열의 크기를 구할때는 length(), collection은 size()
		System.out.println("초기 크기 : " + coll.size());
		coll.add("홍길동");
		coll.add("이순신");
		coll.add("강감찬");
		coll.add("윤봉길");
//		ArrayList는 중복값 포함, HashSet은 중복값 덮어쓰기
//		coll.add("이순신");
		coll.add(new Integer(10));
		System.out.println("마지막 크기 : " + coll.size());
//		서로다른 저장타입을 저장은 가능하나 형변환을 해줘야한다.
//		그러나 서로다른 데이터타입을 만들 일이 없다.
		Object ob[] = coll.toArray();
		int len = ob.length;
				for (int i = 0; i < len; i++) {
					System.out.println((String)ob[i]);
				}
	}

}
