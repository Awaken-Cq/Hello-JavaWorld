/*
1.체력 hp 100, 모드(0 : 일반, 1 : 흥분)
2.공격attack()
	1회 공격당 적체력 (0 : -10, 1 : -15)

  모드변경changMode()
	내체력 -25;
	내체력이 40이하일 경우 변경 불가.
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
				System.out.println("경고 : 모드변경불가");
			}
		
		}
}
