/*
* Lotto
1 - 3까지의 서로 다른 난수 
공은 3개만 받는다
*/

public class ForLotto{
	public static void main(String[] args) {
		int num1 = 0; 
		int num2 = 0;
		int num3 = 0;
	//1번	
	/*	for(;;){
			if (num1 == num2 || num1 == num3 || num2 == num3){
				num1 = (int)(Math.random()*3+1);
				num2 = (int)(Math.random()*3+1);
				num3 = (int)(Math.random()*3+1);
			} else {
				break;
			}
		}	
	//2번	
		for(;;){
			if (num1 != num2 && num1 != num3 && num2 != num3){
				break;
			} else {
				num1 = (int)(Math.random()*3+1);
				num2 = (int)(Math.random()*3+1);
				num3 = (int)(Math.random()*3+1);
			}
		
		}		
	//3번
		for(;;){
			num1 = (int)(Math.random()*3+1);
				num2 = (int)(Math.random()*3+1);
				num3 = (int)(Math.random()*3+1);
			if (num1 != num2 && num1 != num3 && num2 != num3){
				break;
			}
		}		
		*/
	//4번
		{
		num1 = (int)(Math.random()*+1);
		for(;;){
				num2 = (int)(Math.random()*3+1);
				
			if (num1 != num2){
				break;
			}
		}	
		for(;;){
			num3 = (int)(Math.random()*3+1);
			if(num1 != num3 && num2 != num3){
				break;
			}
		}
		}
		System.out.println("금주 당첨 번호 : " + num1 + " " + num2 + " " + num3);
	}
}
// 1~3번과 4번의 차이를 알아야함. 1~3번은 군대식 한조건만 잘못되도 전부다시.
//그러나 4번은 하나씩 번호를 뽑아 비교하므로 다시뽑는 번호 수가 점차 줄음.

/*

		lotto = (int)(Math.random()*3);
		num1 = lotto;
		lotto = (int)(Math.random()*3);
		for(i=1;i<2;++i){
		lotto = (int)(Math.random()*3);
*/