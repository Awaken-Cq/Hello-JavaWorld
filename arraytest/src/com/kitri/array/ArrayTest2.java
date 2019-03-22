package com.kitri.array;

public class ArrayTest2 {

	public static void main(String[] args) {

		Car car[] = new Car[6];
		car[0] = new Car("쏘나타", "검정색", "현대");
		car[1] = new Car("K5", "흰색", "기아");
		car[2] = new Car("SM5", "은색", "삼성");
		car[3] = new Car("아반떼", "흰색", "현대");
		car[4] = new Car("니어로", "비들기색", "기아");
		car[5] = new Car("싼타페", "검정색", "현대");

		int len = car.length;
		for (int i = 0; i < len; i++)
			System.out.println(i + 1 + "번째구역 : " + car[i]);

//		System.out.println(car[0].toString());

//		System.out.println(car[0]);

//		String name = "니어로";
		String name = "QM5";
//		QM5는 없습니다.

//		for(int i = 0 ; i<len ; i++) {
//			if(name.equals(car[i].getCarName())) { 
//			System.out.println(car[i].getColor() + " " + car[i].getCarName()
//					+ "(" + car[i].getMaker() + ")은" + (i+1) + "번째구역에 있습니다.");
//			break;
//			}
//			if(i+1 == len) {
//			System.out.println(name + "는 없습니다.");
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
			System.out.println(findCar.getColor() + " " + findCar.getCarName() + "(" + findCar.getMaker() + ")은" + count
					+ "번째구역에 있습니다.");
		} else {
			System.out.println(name + "는 없습니다.");
		}

	}
}
