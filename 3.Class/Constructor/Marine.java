/*
1.ü�� hp 100, ���(0 : �Ϲ�, 1 : ���)
2.����attack()
	1ȸ ���ݴ� ��ü�� (0 : -10, 1 : -15)

  ��庯��changMode()
	��ü�� -25;
	��ü���� 40������ ��� ���� �Ұ�.
*/

public class Marine {
		
		
		int hp;
		int mode;
		int power;

		public Marine(){
			hp = 100;
			mode = 0;
			power = 10;
			
		}
		
		public void attack(Marine a, int count){
			for(int i =0; i < count; i++)
				a.hp -= power;
		}

		public void mode(){
			
			if(mode == 0 && hp >= 40){
				mode = 1;
				hp -= 25;
				power = 15;
			} else {
				mode = 0;
				power = 10;
				System.out.println("��� : ��庯��Ұ�");
			}
		
		}
// ���ڿ����� ���ڸ� ����ϴ¹�� ���� + ""
		String getStatus() {
			return hp < 0 ? "die" : hp+"" ;
		}
}
