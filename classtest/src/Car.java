public class Car {

	String carName;
	String color;
	String maker;
	int speed;
	
	//	�����ڸ� ���� ������ ������ public Car(){}���
	//	default�����ڰ� ���ο� ��������.(3.12 �ʱ� ������.3)




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