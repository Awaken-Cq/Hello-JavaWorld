/*
1.ü�� hp 100, ���(0 : �Ϲ�, 1 : ���)
2.����attack()
	1ȸ ���ݴ� ��ü�� (0 : -10, 1 : -15)

  ��庯��changMode()
	��ü�� -25;
	��ü���� 40������ ��� ���� �Ұ�.
*/

public class Marine {
		
		//int count = 0;
		int hp;
		//int comhp;
		//int damage;
		int mode;
		//boolean die;

		public Marine(){
			hp = 100;
			mode = 0;
		}
		String myTurn(){
			return "���� ���� " + count + "ȸ ����!";
		}
		String comTurn(){
			return "���� ���� " + count + "ȸ ����!";
		}
		String info(){
			return "myhp : "+ myhp + " : comhp : " + comhp;
		}
		
		public Marine(){
			hp = 100;
			hp = 100;
			damage = 10;
			mode = true;
			die = true;
		}
		
		
		public void myAttack(){
			count = (int)(Math.random()*3+1);
				for(int i=0; i < count;i++)
					comhp -= damage;
					if(comhp < 0){
						comhp = 0;
					die = false;
					System.out.println("com die");
					}
		}

		public void comAttack(){
			count = (int)(Math.random()*3+1);
				for(int i=0; i < count;i++)	
					myhp -= damage;
				if(myhp < 0){
						myhp = 0;
					die = false;
				System.out.println("my die");
				}
		}

	/*	public void changeMode(){
			if(mode == true){
				mode = false;
				damage = 15;
				hp -= 25;
				} else {
				mode = true;
				damage = 10;
			}
		}*/

		

}
