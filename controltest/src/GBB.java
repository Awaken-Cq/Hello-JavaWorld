/*
*가위바위보 게임.
1. 0 ( 가위), 1 (바위), 2(보)
2. 컴 : 난수(0,1,2)
3. 결과 Logic(승, 패, 무)
4. 결과 출력
	나 : 보, 컴 : 바위 결과 : 이겼다.
	나 : 보, 컴 : 가위 결과 : 졌다.
	나 : 보, 컴 : 보 결과 : 비겼다.
(my + 2) - com
0		 1		 2
가		바		보
0 0 =비  0 2 2%3 2
0 1	=승	-1 1 0%3 0
0 2 =패 -2 0 1%3 1
1 0 =승  1 3 0%3 0
1 1 =비  0 2 2%3 2
1 2 =패 -1 1 1%3 1
2 0 =패  2 4 1%3 1
2 1 =승  1 3 0%3 0
2 2 =비  0 2 2%3 2          


*/


public class GBB {

	public static void main(String[] args) {
		int my = 0;		
		double com = (int)(Math.random() * 3);
		String result = "";
		String myStr = "";
		String comStr = "";

		if((my-com+2)%3 == 2){
			result = "무승부";
		} else if ((my-com+2)%3 == 1){
			result = "패배";
		} else { result = "승리";}
		

		if(my == 0){
			myStr = "가위";
		} else if (my == 1){
			myStr = "바위";
		} else { myStr = "보";}

		if(com == 0){
			comStr = "가위";
		} else if (com == 1){
			comStr = "바위";
		} else { comStr = "보";}


/*
		switch(my) {
			case 0 : if(com == 2){
						result = "이김";break;
					}else if (com == 1){
						result = "짐";break;
					} else {
						result = "비김";break;}

			case 1 : if(com == 0){
						result = "이김";break;
					}else if (com == 2){
						result = "짐";break;
					} else {
						result = "비김";break;}

			case 2 : if(com == 1){
						result = "이김";break;
					}else if (com == 0){
						result = "짐";break;
					} else {
						result = "비김";break;}
				}
		
		*/
	
		System.out.println("나는 " + myStr + " " + "컴퓨터는 " + comStr + " 결과 : " + result);
	}
}


