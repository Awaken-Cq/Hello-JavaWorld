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

		public Marine(){
			hp = 100;
			mode = 0;
			
		}
		
		public void attack(Marine a, int count){
			if(mode == 0){
			a.hp -= count*10;
			}else{
			a.hp -= count*15;
			}
		}

		public void mode(Marine a,int b){
			
			if(a.mode == 0 &&a.hp >= 40){
				a.mode = b;
				a.hp -= 20;
			} else {
				System.out.println("��� : ��庯��Ұ�");
			}
		
		}
}
