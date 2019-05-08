package com.kitri.util.jcf.test5;

import java.util.*;

public class PlayerList {
//	ArrayList 와 Vector의 차이점 : 
//	Vector is synchronized. If a thread-safe implementation is not needed, it is recommended to use ArrayList in place of Vector.
//	동기화를 하기때문에 동시다발적으로 업뎃이되어도 순서를 보장받을 수 있다.
//	ArrayList는 	Note that this implementation is not synchronized.
//	순서없이 동기화를 하기때문에 순서를 완벽하게 보장할 수는 없다.but 거의 보장은 됨. 그만큼 빠르다.
//	나노초까지도 구분해서 순서를 보장해야하는 경우는 vector를 써야겠지만
//	그렇지않다면 arraylist가 낫다.
	
	
//	List<PlayerDto> list = new ArrayList<PlayerDto>();
	List<PlayerDto> list = new Vector<PlayerDto>();

//	편의점 활용 가능
	private void playerRegister(PlayerDto playerDto) {
		list.add(playerDto);
	}

	private void playerList() {
		System.out.println("=== 두산 베어스 팀명단 ===");
		System.out.println("----------------------------");
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}

	}

	private PlayerDto playerSearch(int number) {
//		조건식의 맞는 결과가 나오지 않는다면 null을 리턴하기위해 null로 초기화해준다.
		PlayerDto playerDto = null;
		int size = list.size();
		for (int i = 0; i < size; i++) {
			PlayerDto dto = list.get(i);
			if (number == dto.getNumber()) {
				playerDto = dto;
				break;
			}
		}
		return playerDto;

	}

	private void playerInfo(PlayerDto playerDto) {
		if (playerDto != null)
			System.out.println(playerDto);
		else
			System.out.println("선수는 없습니다.");
	}

	public static void main(String[] args) {
		PlayerList pl = new PlayerList();

//		list.add(
		pl.playerRegister(new PlayerDto(24, "오재원", 4, 0.321));
		pl.playerRegister(new PlayerDto(13, "허경민", 5, 0.351));
		pl.playerRegister(new PlayerDto(34, "린드블럼", 1, 0.001));
		pl.playerRegister(new PlayerDto(9, "페르난데스", 3, 0.421));
		pl.playerRegister(new PlayerDto(38, "김대한", 7, 0.384));

		pl.playerList();

//		int number = 28;
//		System.out.println(number + "번 선수 정보!!");
//		
//		size = list.size();
//		boolean b = false;
//		for (int i = 0; i < size; i++) {
//			PlayerDto playerDto = list.get(i);
//			if(number == playerDto.getNumber()) {
//				System.out.println(list.get(i));
//				b = true;
//				break;
//			}
//		}
//			if(b == false)
//			System.out.println(number + "번 선수는 없습니다.");

//		int number = 28;
//		System.out.println(number + "번 선수 정보!!");
//
//		size = list.size();
//		PlayerDto playerDto = null;
//		for (int i = 0; i < size; i++) {
//			PlayerDto dto = list.get(i);
//			if (number == dto.getNumber()) {
//				playerDto = dto;
//
//				break;
//			}
//		}
//		if (playerDto != null)
//			System.out.println(playerDto);
//		else
//			System.out.println(number + "번 선수는 없습니다.");

		int number = 38;
//		System.out.println(number + "번 선수 정보!!");
		PlayerDto playerDto = pl.playerSearch(number);
		pl.playerInfo(playerDto);
System.out.println("-------------------------");
		
		number = 13;
		double score = 0.357;
		System.out.println(number + "번 선수가 안타!!! 타율이 " + score + "로 변경");
		
//		***알아야할 부분 : 자바는 모든것이 call by reference이다. 복제가 되는 것이 아니다.
//		객체를 생성하면 힙부분에는 객체가 생성되고 스택에는 객체의 주소값만 저장된다.
//		고로 list안에 저장되는것은 주소가 저장되는 것이지 객체가 저장되는 것이 아니다.
		playerDto = pl.playerSearch(number);// <- 주소값
//		서치로 플레이어를 찾았을때 플레이어 데이터의 객체를 가져오는 것이 아니라 주소값을 가져오는것
		playerDto.setGrade(0.357);// <- 가져온 주소값으로 자료가 저장된 곳으로 찾아가 수정
//		셋을 했을때에도 마찬가지로 가져온 주소값으로 객체가 저장되어있는 곳을 찾아가서 자료를 바꾸는 것이지
//		가져온 주소값을 바꾸는 것이 아니다.
		pl.playerInfo(playerDto);


		
	}
}
