package Constructor;

public class StarCraft2 {

	public static void main(String[] args) {
		
		Marine2 m1 = new Marine2();
		Marine2 m2 = new Marine2();

		
		System.out.println("m1 ü�� : " + m1.status() + "  m2 ü�� : " + m2.status());
		int count = 2;
		System.out.println("���� ���� " + count + "ȸ ����!");
		m1.attack(m2,count);
		System.out.println("m1 ü�� : " + m1.status() + "  m2 ü�� : " + m2.status());

		count = 4;
		System.out.println("���� ���� " + count + "ȸ ����!");
		m2.attack(m1,count);
		System.out.println("m1 ü�� : " + m1.status() + "  m2 ü�� : " + m2.status());
		
		System.out.println("m1 ��庯��!!!");
		m1.activation(true);

		count = 3;
		System.out.println("���� ���� " + count + "ȸ ����!");
		m1.attack(m2,count);
		System.out.println("m1 ü�� : " + m1.status() + "  m2 ü�� : " + m2.status());

		System.out.println("m1 ��庯��!!!");
		m1.activation(true);
		System.out.println("m1 ü�� : " + m1.status() + "  m2 ü�� : " + m2.status());

		count = 3;
		System.out.println("���� ���� " + count + "ȸ ����!");
		m1.attack(m2,count);
		System.out.println("m1 ü�� : " + m1.status() + "  m2 ü�� : " + m2.status());



	}
}
