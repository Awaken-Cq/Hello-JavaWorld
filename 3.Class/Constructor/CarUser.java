public class CarUser {

	public static void main(String[] args) {
		
		Car car1 = null;
		car1 = new Car();

		System.out.println(car1.info());

		Car car2 = null;
		car2 = new Car("흰색");

		System.out.println(car1.info());

		Car car3 = null;
		car3 = new Car("그랜저","흰색");	//	순서를 같게해야한다.

		System.out.println(car3.info());

		Car car4 = null;
		car4 = new Car("K5", "은색", "기아");	

		System.out.println(car4.info());

		System.out.println("car4의 속도를 3회 증가!!!");
		for(int i= 0; i<3 ; i++)
				car4.speedUp();


		System.out.println("car4의 속도 : " + car4.speed);
		
		System.out.println("car4의 속도를 85 증가!!!");
		int speed = car4.speedUp(85);	//	변수명은 상관없음.(다만 특징기술)

        car4.speedUp();
		car4.speedUp();
		car4.speedUp();
		System.out.println("car4의 속도 : " + speed);	//	계기판 속도
		System.out.println("car4의 속도 : " + car4.speed);	//	car4의 속도


	}
}
