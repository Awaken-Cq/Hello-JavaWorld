public class busUser {

	public static void main(String[] args) {
		
		Bus b1 = new Bus("Ÿ��","�Ķ���","����");
		int pCount=0;
		pCount=5;
		System.out.println(pCount + "���� �°��� �����ϴ�.");
		b1.getOff(pCount);
		System.out.println("���� �°� �� : " + b1.pCount + "��");

		pCount=5;
		System.out.println(pCount + "���� �°��� ž�ϴ�.");
		b1.getOn(pCount);
		System.out.println("���� �°� �� : " + b1.pCount + "��");

		pCount=5;
		System.out.println(pCount + "���� �°��� ž�ϴ�.");
		b1.getOn(pCount);
		System.out.println("���� �°� �� : " + b1.pCount + "��");

		pCount=7;
		System.out.println(pCount + "���� �°��� �����ϴ�.");
		b1.getOff(pCount);
		System.out.println("���� �°� �� : " + b1.pCount + "��");
	}
}
