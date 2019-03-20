public class Car {

	String carName;
	String color;
	String maker;
	int speed;
	
	//	생성자를 따로 만들지 않으면 public Car(){}라는
	//	default생성자가 내부에 숨어있음.(3.12 필기 생성자.3)




	public void speedUp() {
	speed += 10;

	}


	public void speedDown() {
	speed -= 10;
	if(speed < 0)
		stop();
	}


	public void stop() {
	speed = 0;
	}



}