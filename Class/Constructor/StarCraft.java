public class StarCraft {

	public static void main(String[] args) {
		int count = 2;
		Marine my = new Marine();
		Marine com = new Marine();

		my.attack(com,count);
		System.out.println("���� ���� " + count + "ȸ ����!");
		System.out.println("�� ü�� : "+ my.hp + " : �� ü�� : " + com.hp);
//		
		count = 4;
		com.attack(my,count);
		System.out.println("���� ���� " + count + "ȸ ����!");
		System.out.println("�� ü�� : "+ my.hp + " : �� ü�� : " + com.hp);
//		
		System.out.println("��� ����!!!");
		my.mode(my,1);
		System.out.println("�� ü�� : "+ my.hp + " : �� ü�� : " + com.hp);

		count = 3;
		my.attack(com,count);
		System.out.println("���� ���� " + count + "ȸ ����!");
		System.out.println("�� ü�� : "+ my.hp + " : �� ü�� : " + com.hp);

		System.out.println("��� ����!!!");
		my.mode(my,1);
		System.out.println("�� ü�� : "+ my.hp + " : �� ü�� : " + com.hp);

		count = 3;
		my.attack(com,count);
		System.out.println("���� ���� " + count + "ȸ ����!");
		System.out.println("�� ü�� : "+ my.hp + " : �� ü�� : " + "die\n" + "win");



/*
		//��ü�� : 100 ��ü�� : 100
		int count = 2;
		System.out.println("���� ���� " + count + "ȸ ����!");
		//����~

		//��ü�� : 100 ��ü�� : 80
		
		count = 4;
		System.out.println("���� ���� " + count + "ȸ ����!");

		//��ü�� : 60 ��ü�� : 80
		System.out.println("��� ����!!!!");

		//��ü�� : 35 ��ü�� : 80
		count = 3;
		System.out.println("���� ���� " + count + "ȸ ����!");

		//��ü�� : 35 ��ü�� : 35
		System.out.println("��� ����!!!!");

		//��� : ��� ���� �Ұ�.
		//��ü�� : 35 ��ü�� : 35
		count = 3;
		System.out.println("���� ���� " + count + "ȸ ����!");


		//��ü�� : 35 ��ü�� : die
		//			win
		*/
	}
}
