public class Chapter3exDice {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6+1);
		char re = 0;
		if(num == 1){
		re = '1';
		} else if (num == 2){
		re = '2';
		} else if(num ==3){
		re = '3';
		} else if(num ==4){
		re = '4';
		} else if(num ==5){
		re = '5';
		} else {re = '6';}

		System.out.println("눈금은 " + num + " 결과값은 " + re);
		
		switch (num){
		case 1 : re = '1'; break;
		case 2 : re = '2'; break;
		case 3 : re = '3'; break;
		case 4 : re = '4'; break;
		case 5 : re = '5'; break;
		case 6 : re = '6';
		}
		System.out.println("눈금은 " + num + " 결과값은 " + re);
	}
}
