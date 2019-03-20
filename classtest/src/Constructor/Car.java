package Constructor;

public class Car {

	String carName;
	String color;
	String maker;
	int speed;
//  �����Ǿ��ִ� default ������. �׷��� �ٸ� �����ڸ� �����Ѵٸ�
//	default�����ڴ� ������� ������ �׶��� ������ ����������.
	public Car() {
	/*	carName = "�Ÿ";
		color = "������";
		maker = "����";
		*/
		this("�Ÿ", "������", "����");
	}
/*	���� �ߺ��� ���ϱ� ���� method.overloading���� ���ڰ��� '����'.
	public Car(String c) {	
		carName = "�Ÿ";
		color = c;
		maker = "����";
		*/

// ���������� ���� �̸��� ���������� �����ϸ� ����� ���������� �켱���� 
// �ν��ϱ⶧���� ���� color�� ����� �ҷ��ͼ� ���� color�� �ִ� �۾��� �ǰ�,
// ���������� color�� �״�� null�̰� �װ� �ҷ��� ����ϴ� null�� �Ǵ°�.
// �׷��ٸ� ���������� ���� ����� ���������� �־�����ϴµ� �׷��ٸ�
// ���������� ���� �̸��� ���������� �����ؾ��ϴµ� this.�� ����Ͽ� ��������
// ���ÿ� ���ٸ� ��ü���� ��� ���� Ŭ���� ������ ������ �� �ִ� ����
// this.�� �����Ǿ��ִٴ� �ǹ�.
	public Car(String color) {	
		/*carName = "�Ÿ";
		this.color = color;
		maker = "����";
		*/
		this("�Ÿ", color, "����");
	}
//	string c���ϸ� '����'�θ� �ν��ؼ� ���� ���Ͻ� ��޵Ǳ⿡ ���ڰ� 2���� ó��.
	public Car(String carName, String color) {
	/*
	this.carName = carName;
	this.color = color;
	maker = "����";
	*/
		this(carName, color, "����");
	}
//	���� �ߺ����� �ʱ� ���� ����Ŀ���� ���ڰ� 3���� ������. '����','����','����'
	public Car(String carName, String color, String maker) {
		this.carName = carName;
		this.color = color;
		this.maker = maker;
	}



	public void speedUp(){
		speed += 10;

	}
//���� �޼ҵ尡 �ֱ� ������ ���ڰ��� �־� �з��Ͽ� ���� ���� ���� ���ϰ��� ��ȯ
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
//this�� ����
	String info() {
		return "���̸� : " + carName + "  ���� : " 
			+ color + "  ������ : " + maker;
	}
}
