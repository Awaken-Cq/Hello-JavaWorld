public class StarCraft {

	public static void main(String[] args) {
		Marine bt = new Marine();

		

		while(bt.die == true){
		bt.myAttack();
		System.out.println(bt.myTurn());
		System.out.println(bt.info());

		bt.comAttack();
		System.out.println(bt.myTurn());
		System.out.println(bt.info());
		}
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
