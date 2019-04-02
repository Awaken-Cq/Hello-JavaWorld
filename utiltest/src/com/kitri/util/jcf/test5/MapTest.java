package com.kitri.util.jcf.test5;

import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		
		
//		HashMap 와 HashTable의 차이점 : 
//		HashTable is synchronized. If a thread-safe implementation is not needed, it is recommended to use ArrayList in place of Vector.
//		동기화를 하기때문에 동시다발적으로 업뎃이되어도 순서를 보장받을 수 있다.
//		HashMap은 Note that this implementation is not synchronized. 
//		순서없이 동기화를 하기때문에 순서를 완벽하게 보장할 수는 없다.but 거의 보장은 됨. 그만큼 빠르다.
//		나노초까지도 구분해서 순서를 보장해야하는 경우는 vector를 써야겠지만
//		그렇지않다면 HashMap이 낫다.
		
//		Map<String, PlayerDto>	map = new HashMap<String, PlayerDto>();
		Map<String, PlayerDto>	map = new Hashtable<String, PlayerDto>();
		
//		같은 등번호일때는 덮어쓰기가되어버려서 가장 마지막에 한 같은 번호의 선수가 나온다. 
//		그렇기에 key값으로 팀이름을 넣어 고유성을 만들어 준다
		map.put("DS24", new PlayerDto(24, "오재원", 4, 0.321));
		map.put("DS9", new PlayerDto(9, "페르난데스", 3, 0.421));
		map.put("KW24", new PlayerDto(24, "박병호", 3, 0.421));
		map.put("HH19", new PlayerDto(19, "정근우", 7, 0.421));
		
		int size = map.size();
		System.out.println("등록 인원 : " + size);
		
		int number = 24;
		System.out.println("두산 " + number + "번 선수의 정보!!");
		PlayerDto playerDto = map.get("DS" + number);
		System.out.println(playerDto);
	}
	
//		**집어넣을때 put, 빼낼때 get
//		맵의 정보를 모두 뿌릴때 Map.values() 리턴값으로 collection<V>인 이유는 맵은 순서없이 넣지만
//		출력은 순서가 필요하기때문.
//		Map.keyset()은 DS, KW, HH같은 키값만 불러온다.

}
