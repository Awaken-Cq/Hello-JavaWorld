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
				System.out.println("경고 : 모드변경불가");
			}
		
		}
// 문자열에서 숫자를 출력하는방법 숫자 + ""
		String getStatus() {
			return hp < 0 ? "die" : hp+"" ;
		}
}
