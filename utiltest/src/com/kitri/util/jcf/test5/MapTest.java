package com.kitri.util.jcf.test5;

import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		
		
//		HashMap �� HashTable�� ������ : 
//		HashTable is synchronized. If a thread-safe implementation is not needed, it is recommended to use ArrayList in place of Vector.
//		����ȭ�� �ϱ⶧���� ���ôٹ������� �����̵Ǿ ������ ������� �� �ִ�.
//		HashMap�� Note that this implementation is not synchronized. 
//		�������� ����ȭ�� �ϱ⶧���� ������ �Ϻ��ϰ� ������ ���� ����.but ���� ������ ��. �׸�ŭ ������.
//		�����ʱ����� �����ؼ� ������ �����ؾ��ϴ� ���� vector�� ��߰�����
//		�׷����ʴٸ� HashMap�� ����.
		
//		Map<String, PlayerDto>	map = new HashMap<String, PlayerDto>();
		Map<String, PlayerDto>	map = new Hashtable<String, PlayerDto>();
		
//		���� ���ȣ�϶��� ����Ⱑ�Ǿ������ ���� �������� �� ���� ��ȣ�� ������ ���´�. 
//		�׷��⿡ key������ ���̸��� �־� �������� ����� �ش�
		map.put("DS24", new PlayerDto(24, "�����", 4, 0.321));
		map.put("DS9", new PlayerDto(9, "�丣������", 3, 0.421));
		map.put("KW24", new PlayerDto(24, "�ں�ȣ", 3, 0.421));
		map.put("HH19", new PlayerDto(19, "���ٿ�", 7, 0.421));
		
		int size = map.size();
		System.out.println("��� �ο� : " + size);
		
		int number = 24;
		System.out.println("�λ� " + number + "�� ������ ����!!");
		PlayerDto playerDto = map.get("DS" + number);
		System.out.println(playerDto);
	}
	
//		**��������� put, ������ get
//		���� ������ ��� �Ѹ��� Map.values() ���ϰ����� collection<V>�� ������ ���� �������� ������
//		����� ������ �ʿ��ϱ⶧��.
//		Map.keyset()�� DS, KW, HH���� Ű���� �ҷ��´�.

}
