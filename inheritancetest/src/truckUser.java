public class truckUser {

	public static void main(String[] args) {
		
	Truck t1 = new Truck("��Ƽ�ӽ�", "��Ʈ", "����", 1000);

	System.out.println("�ִ��߷� : " + t1.maxWeight + "kg" + "  �����߷� : " + t1.weight + "kg");
	
	System.out.println("100kg�� �����մϴ�.");
	t1.loadUp(100);
	System.out.println("�����߷� : " + t1.weight + "kg");
	
	System.out.println("800kg�� �����մϴ�.");
	t1.loadUp(800);
	System.out.println("�����߷� : " + t1.weight + "kg");

	System.out.println("500kg�� �����մϴ�.");
	t1.loadUp(500);
	System.out.println("�����߷� : " + t1.weight + "kg");

	System.out.println("300kg�� �����մϴ�.");
	t1.loadDown(300);
	System.out.println("�����߷� : " + t1.weight + "kg");

	System.out.println("1100kg�� �����մϴ�.");
	t1.loadDown(1100);
	System.out.println("�����߷� : " + t1.weight + "kg");


	}
}
