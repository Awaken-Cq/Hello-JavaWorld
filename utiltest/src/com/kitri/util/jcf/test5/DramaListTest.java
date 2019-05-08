package com.kitri.util.jcf.test5;

import java.util.ArrayList;
import java.util.List;

public class DramaListTest {

	public static void main(String[] args) {
		
//		List같은 인터페이스를 쓰는 이유 객체와 객체간의 결합도를 낮추기위해 인터페이스를 쓴다. ODB,MDB로 설명.
		List<Drama> lt = new ArrayList<Drama>();
		
		lt.add(new Drama("그 겨울, 바람이 분다.", "SBS", "김규태", "조인성", "송혜교"));
		lt.add(new Drama("백년의 유산", "MBC", "주성우", null, null ));
		lt.add(new Drama("아이리스2", "KBS", "표민수", "장혁", "이다해"));
		lt.add(new Drama("최고다 이순신", "KBS", "윤성식", null, "아이유"));
//		출력에서 re[i]대신 lt.get(i)를 입력하면 이부분이 없어도됨.
//		Drama re[] = lt.toArray(new Drama[0]);
		
		int sz = lt.size();
		
				for (int i = 0; i < sz; i++) {
					System.out.println((i+1) + ". " + lt.get(i));
				}

	}

}
