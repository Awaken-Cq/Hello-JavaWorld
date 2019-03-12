public class CarUser {

	public static void main(String[] args) {
		Car car1 = null;	//stack에 car1이라는 변수명 생성 생성
		car1 = new Car();	//heap영역에 Car생성자로 메모리할당 후 car1에 참조됨.
		
		System.out.println("1. 차이름 : " + car1.carName + "  색상 : " 
			+ car1.color + "  제조사 : " + car1.maker);
		car1.carName = "쏘나타";
		car1.color = "검정색";
		car1.maker = "현대";
		
		System.out.println("2. 차이름 : " + car1.carName + "  색상 : " 
			+ car1.color + "  제조사 : " + car1.maker);

		Car car2 = new Car();
		System.out.println("2. 차이름 : " + car2.carName + "  색상 : " 
			+ car2.color + "  제조사 : " + car2.maker);

		car2.carName = "K5";
		car2.color = "흰색";
		car2.maker = "기아";
		
		System.out.println("2. 차이름 : " + car2.carName + "  색상 : " 
			+ car2.color + "  제조사 : " + car2.maker);
	}
}
