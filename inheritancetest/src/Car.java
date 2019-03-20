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


	int speedUp(int speed) {
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

	
//toString의 원래 기능은 주소를 문자열로 반환 그것을 재정의하여
//내가 원하는 문자열 반환 중요한 것은 toString은 문자열로 반환한다는 것.
	@Override
	public String toString(){
			return maker + "에서 만든 " + color + "  " + carName;
		}
		
	@Override
		public boolean equals(Object obj){
			Car car = (Car) obj;
			//if(carName == car.carName)
			if(carName.equals(car.carName))
			//""일경우는 true, enw String("")일 경우는 false
			return true;
			return false;
		}


}

