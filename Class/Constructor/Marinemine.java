/*
1.체력 hp 100, 모드(0 : 일반, 1 : 흥분)
2.공격attack()
	1회 공격당 적체력 (0 : -10, 1 : -15)

  모드변경changMode()
	내체력 -25;
	내체력이 40이하일 경우 변경 불가.
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
			return "내가 적을 " + count + "회 공격!";
		}
		String comTurn(){
			return "적이 나를 " + count + "회 공격!";
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
