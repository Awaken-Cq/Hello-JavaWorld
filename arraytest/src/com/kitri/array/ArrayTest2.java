package com.kitri.array;

public class ArrayTest2 {

	public static void main(String[] args) {

		Car car[] = new Car[6];
		car[0] = new Car("�Ÿ", "������", "����");
		car[1] = new Car("K5", "���", "���");
		car[2] = new Car("SM5", "����", "�Ｚ");
		car[3] = new Car("�ƹݶ�", "���", "����");
		car[4] = new Car("�Ͼ��", "�����", "���");
		car[5] = new Car("��Ÿ��", "������", "����");

		int len = car.length;
		for (int i = 0; i < len; i++)
			System.out.println(i + 1 + "��°���� : " + car[i]);

//		System.out.println(car[0].toString());

//		System.out.println(car[0]);

//		String name = "�Ͼ��";
		String name = "QM5";
//		QM5�� �����ϴ�.

//		for(int i = 0 ; i<len ; i++) {
//			if(name.equals(car[i].getCarName())) { 
//			System.out.println(car[i].getColor() + " " + car[i].getCarName()
//					+ "(" + car[i].getMaker() + ")��" + (i+1) + "��°������ �ֽ��ϴ�.");
//			break;
//			}
//			if(i+1 == len) {
//			System.out.println(name + "�� �����ϴ�.");
//			}

		// -------------------------------------------------

		Car findCar = null;
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (name.equals(car[i].getCarName())) {
				findCar = car[i];
				count = i + 1;
				break;
			}
		}
		
		if (findCar != null) {
			System.out.println(findCar.getColor() + " " + findCar.getCarName() + "(" + findCar.getMaker() + ")��" + count
					+ "��°������ �ֽ��ϴ�.");
		} else {
			System.out.println(name + "�� �����ϴ�.");
		}

	}
}
