package Constructor;

public class StarCraft2 {

	public static void main(String[] args) {
		
		Marine2 m1 = new Marine2();
		Marine2 m2 = new Marine2();

		
		System.out.println("m1 체력 : " + m1.status() + "  m2 체력 : " + m2.status());
		int count = 2;
		System.out.println("내가 적을 " + count + "회 공격!");
		m1.attack(m2,count);
		System.out.println("m1 체력 : " + m1.status() + "  m2 체력 : " + m2.status());

		count = 4;
		System.out.println("적이 나를 " + count + "회 공격!");
		m2.attack(m1,count);
		System.out.println("m1 체력 : " + m1.status() + "  m2 체력 : " + m2.status());
		
		System.out.println("m1 모드변경!!!");
		m1.activation(true);

		count = 3;
		System.out.println("내가 적을 " + count + "회 공격!");
		m1.attack(m2,count);
		System.out.println("m1 체력 : " + m1.status() + "  m2 체력 : " + m2.status());

		System.out.println("m1 모드변경!!!");
		m1.activation(true);
		System.out.println("m1 체력 : " + m1.status() + "  m2 체력 : " + m2.status());

		count = 3;
		System.out.println("내가 적을 " + count + "회 공격!");
		m1.attack(m2,count);
		System.out.println("m1 체력 : " + m1.status() + "  m2 체력 : " + m2.status());



	}
}
