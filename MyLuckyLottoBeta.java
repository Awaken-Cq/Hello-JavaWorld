public class MyLuckyLottoBeta {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;

		//for(int i=1;i<851;++i){

		num1 = (int)(Math.random()*45)+1;
		for(;;){
			num2 = (int)(Math.random()*45)+1;
			if(num1 != num2){
				break;}
		}	
		for(;;){
			num3 = (int)(Math.random()*45)+1;
			if(num1 != num3 && num2 != num3){
				break;}
		}	
		for(;;){
			num4 = (int)(Math.random()*45)+1;
			if(num1 != num4 && num2 != num4 && num3 != num4){
				break;}
		}	
		for(;;){
			num5 = (int)(Math.random()*45)+1;
			if(num1 != num5 && num2 != num5 && num3 != num5 && num4 != num5){
				break;}
		}	
		for(;;){
			num6 = (int)(Math.random()*45)+1;
			if(num1 != num6 && num2 != num6 && num3 != num6 && num4 != num6
				&& num5 != num6){
				break;}
		}	

		System.out.println(num1 + "  " + num2 + "  " + num3 + "  " + num4
			+ "  " + num5 + "  " + num6);
		//}
	}
}