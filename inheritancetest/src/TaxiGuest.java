public class TaxiGuest {

	public static void main(String[] args) {
		Taxi t1 = new Taxi();
		System.out.println("t1 >>" + t1.toString());

		Taxi t2 = new Taxi("K5","��ȫ��","���");
		System.out.println("t2 >>" + t2.toString());
		
		int price = t2.initPrice();
		int km = 20;
		System.out.println(t2.info() + "�� Ÿ�� ���𿡼� ��������"
		+ km + "km�̵�!!");
		price = t2.calcPrice(km);
		System.out.println("��� : " + price + "��");
		t2.sumPrice();
		System.out.println("���� ���� : " + t2.totalPrice + "��" + "  ���â : " + t2.price + "��");


		price = t2.initPrice();
		km = 20;
		System.out.println(t2.info() + "�� Ÿ�� �������� �������"
		+ km + "km�̵�!!");
		price = t2.calcPrice(km);
		System.out.println("��� : " + price + "��");
		t2.sumPrice();
		System.out.println("���� ���� : " + t2.totalPrice + "��" + "  ���â : " + t2.price + "��");

		int upDown = 50;
		System.out.println("t2�� �ӵ��� " + upDown + "��ŭ ����!!");
		int speed = t2.speedUp(upDown);
		System.out.println("t2�� �ӵ� : " + speed + "  " + t2.speed);

		upDown = 250;
		System.out.println("t2�� �ӵ��� " + upDown + "��ŭ ����!!");
		speed = t2.speedUp(upDown);
		System.out.println("t2�� �ӵ� : " + speed + "  " + t2.speed);
		
		//�׳� t1, t2���� .toString()�� �ڵ�����
		System.out.println(t1 + "    " + t2);
		System.out.println(t1.toString() + "    " + t2.toString());

		
		Taxi t3 = new Taxi("K5","��ȫ��","���");

		//'����'�� ������ '��'�� �������� �ƴϴ�.
		System.out.println(t2 + "    " + t3);
		System.out.println(t2.hashCode() + "    " + t3.hashCode());
		//'=='(�񱳿�����)�� �⺻ DT�� ��쿡 ���� ��������
		//������ DT�� ���� �ּҰ��� ��.
		 if (t2 == t3){    
            System.out.println("t2�� t3�� �������̴�.");
        } else {
            System.out.println("t2�� t3�� �ٸ����̴�.");
        }
		if (t2 == t3){	
			System.out.println("t2�� t3�� �ּҰ��� �������̴�.");
		} else {
			System.out.println("t2�� t3�� �ּҰ��� �ٸ����̴�.");
		}
		
		if (t2.equals(t3)){	
			System.out.println("t2�� t3�� ���̸��� �������̴�.");
		} else {
			System.out.println("t2�� t3�� ���̸��� �ٸ����̴�.");
		}
		

				/*Car car =new Car();
		Car car = new Taxi();
		Taxi t = new Taxi();
		t = (Taxi)car;*/

		/*Car b = new Bus();
		Taxi t = (Taxi)b;*/


	}
}

