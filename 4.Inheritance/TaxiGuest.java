public class TaxiGuest {

	public static void main(String[] args) {
		Taxi t1 = new Taxi();
		System.out.println("t1 >>" + t1.info());

		Taxi t2 = new Taxi("K5","��ȫ��","���");
		System.out.println("t2 >>" + t2.info());
		
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

	
	}
}

