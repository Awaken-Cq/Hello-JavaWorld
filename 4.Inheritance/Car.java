public class Car {

	String carName;
	String color;
	String maker;
	int speed;

	public Car() {

	this("�Ÿ", "������", "����");
	}

	public Car(String carName, String color, String maker) {
//		super();�� �����Ǿ�����.
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
		return "���̸� : " + carName + "  ���� : " 
			+ color + "  ������ : " + maker;
	}
}
