public class Car {

	String carName;
	String color;
	String maker;
	int speed;

	public Car() {

	this("쏘나타", "검정색", "현대");
	}

	public Car(String carName, String color, String maker) {
//		super();이 생략되어있음.
		this.carName = carName;
		this.color = color;
		this.maker = maker;
	}


	public int speedUp(int speed) {
		this.speed += speed;
		return this.speed;
	}
	
	public int speedDown(int speed){
		this.speed -= speed;
		if (this.speed < 0)
			stop();
		return this.speed;
	}


	public void stop(){
		speed = 0;
	}

	String info() {
		return "차이름 : " + carName + "  색상 : " 
			+ color + "  제조사 : " + maker;
	}
}
