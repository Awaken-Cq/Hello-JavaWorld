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

	
//toString�� ���� ����� �ּҸ� ���ڿ��� ��ȯ �װ��� �������Ͽ�
//���� ���ϴ� ���ڿ� ��ȯ �߿��� ���� toString�� ���ڿ��� ��ȯ�Ѵٴ� ��.
	@Override
	public String toString(){
			return maker + "���� ���� " + color + "  " + carName;
		}
		
	@Override
		public boolean equals(Object obj){
			Car car = (Car) obj;
			//if(carName == car.carName)
			if(carName.equals(car.carName))
			//""�ϰ��� true, enw String("")�� ���� false
			return true;
			return false;
		}


}

