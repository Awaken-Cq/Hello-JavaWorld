package Constructor;

public class Car {

	String carName;
	String color;
	String maker;
	int speed;
//  생략되어있던 default 생성자. 그러나 다른 생성자를 생성한다면
//	default생성자는 사라지기 때문에 그때는 무조건 명시해줘야함.
	public Car() {
	/*	carName = "쏘나타";
		color = "검정색";
		maker = "현대";
		*/
		this("쏘나타", "검정색", "현대");
	}
/*	위와 중복을 피하기 위해 method.overloading으로 인자값에 '문자'.
	public Car(String c) {	
		carName = "쏘나타";
		color = c;
		maker = "현대";
		*/

// 전역변수와 같은 이름의 지역변수를 선언하면 가까운 지역변수를 우선으로 
// 인식하기때문에 지역 color의 흰색을 불러와서 지역 color에 넣는 작업이 되고,
// 전역변수에 color는 그대로 null이고 그걸 불러다 출력하니 null이 되는것.
// 그렇다면 지역변수로 들어온 흰색을 전역변수에 넣어줘야하는데 그렇다면
// 지역변수와 같은 이름의 전역변수를 참조해야하는데 this.를 사용하여 참조가능
// 평상시에 별다른 객체명이 없어도 같은 클라스의 변수를 참조할 수 있는 것은
// this.이 생략되어있다는 의미.
	public Car(String color) {	
		/*carName = "쏘나타";
		this.color = color;
		maker = "현대";
		*/
		this("쏘나타", color, "현대");
	}
//	string c만하면 '문자'로만 인식해서 위와 동일시 취급되기에 인자값 2개로 처리.
	public Car(String carName, String color) {
	/*
	this.carName = carName;
	this.color = color;
	maker = "현대";
	*/
		this(carName, color, "현대");
	}
//	위와 중복되지 않기 위해 메이커까지 인자값 3개를 가져감. '문자','문자','문자'
	public Car(String carName, String color, String maker) {
		this.carName = carName;
		this.color = color;
		this.maker = maker;
	}



	public void speedUp(){
		speed += 10;

	}
//같은 메소드가 있기 때문에 인자값을 넣어 분류하여 넣은 값에 따른 리턴값을 반환
	public int speedUp(int speed) {
		speed += speed;
		return speed;
	}

	public void speedDown(){
		speed -= 10;
		if (this.speed < 0)
			stop();
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
//this는 생략
	String info() {
		return "차이름 : " + carName + "  색상 : " 
			+ color + "  제조사 : " + maker;
	}
}
