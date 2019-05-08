package com.kitri.util.jcf.test5;

import java.util.*;

public class PlayerList {
//	ArrayList �� Vector�� ������ : 
//	Vector is synchronized. If a thread-safe implementation is not needed, it is recommended to use ArrayList in place of Vector.
//	����ȭ�� �ϱ⶧���� ���ôٹ������� �����̵Ǿ ������ ������� �� �ִ�.
//	ArrayList�� 	Note that this implementation is not synchronized.
//	�������� ����ȭ�� �ϱ⶧���� ������ �Ϻ��ϰ� ������ ���� ����.but ���� ������ ��. �׸�ŭ ������.
//	�����ʱ����� �����ؼ� ������ �����ؾ��ϴ� ���� vector�� ��߰�����
//	�׷����ʴٸ� arraylist�� ����.
	
	
//	List<PlayerDto> list = new ArrayList<PlayerDto>();
	List<PlayerDto> list = new Vector<PlayerDto>();

//	������ Ȱ�� ����
	private void playerRegister(PlayerDto playerDto) {
		list.add(playerDto);
	}

	private void playerList() {
		System.out.println("=== �λ� ��� ����� ===");
		System.out.println("----------------------------");
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}

	}

	private PlayerDto playerSearch(int number) {
//		���ǽ��� �´� ����� ������ �ʴ´ٸ� null�� �����ϱ����� null�� �ʱ�ȭ���ش�.
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
			System.out.println("������ �����ϴ�.");
	}

	public static void main(String[] args) {
		PlayerList pl = new PlayerList();

//		list.add(
		pl.playerRegister(new PlayerDto(24, "�����", 4, 0.321));
		pl.playerRegister(new PlayerDto(13, "����", 5, 0.351));
		pl.playerRegister(new PlayerDto(34, "�����", 1, 0.001));
		pl.playerRegister(new PlayerDto(9, "�丣������", 3, 0.421));
		pl.playerRegister(new PlayerDto(38, "�����", 7, 0.384));

		pl.playerList();

//		int number = 28;
//		System.out.println(number + "�� ���� ����!!");
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
//			System.out.println(number + "�� ������ �����ϴ�.");

//		int number = 28;
//		System.out.println(number + "�� ���� ����!!");
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
//			System.out.println(number + "�� ������ �����ϴ�.");

		int number = 38;
//		System.out.println(number + "�� ���� ����!!");
		PlayerDto playerDto = pl.playerSearch(number);
		pl.playerInfo(playerDto);
System.out.println("-------------------------");
		
		number = 13;
		double score = 0.357;
		System.out.println(number + "�� ������ ��Ÿ!!! Ÿ���� " + score + "�� ����");
		
//		***�˾ƾ��� �κ� : �ڹٴ� ������ call by reference�̴�. ������ �Ǵ� ���� �ƴϴ�.
//		��ü�� �����ϸ� ���κп��� ��ü�� �����ǰ� ���ÿ��� ��ü�� �ּҰ��� ����ȴ�.
//		��� list�ȿ� ����Ǵ°��� �ּҰ� ����Ǵ� ������ ��ü�� ����Ǵ� ���� �ƴϴ�.
		playerDto = pl.playerSearch(number);// <- �ּҰ�
//		��ġ�� �÷��̾ ã������ �÷��̾� �������� ��ü�� �������� ���� �ƴ϶� �ּҰ��� �������°�
		playerDto.setGrade(0.357);// <- ������ �ּҰ����� �ڷᰡ ����� ������ ã�ư� ����
//		���� ���������� ���������� ������ �ּҰ����� ��ü�� ����Ǿ��ִ� ���� ã�ư��� �ڷḦ �ٲٴ� ������
//		������ �ּҰ��� �ٲٴ� ���� �ƴϴ�.
		pl.playerInfo(playerDto);


		
	}
}
