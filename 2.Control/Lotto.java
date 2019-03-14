public class Lotto {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;

		for(int i= 1 ; i < 851 ; ++i){

		num1 = (int)(Math.random()*45+1);

		do{	num2 = (int)(Math.random()*45+1);
		} while (num1 == num2);

		do{	num3 = (int)(Math.random()*45+1);
		} while (num1 == num2 || num1 == num3 || num2 == num3);

		do{num4 = (int)(Math.random()*45+1);
		} while (num1 == num2 || num1 == num3 || num2 == num3
				|| num1 == num4 || num2 == num4 || num3 == num4);

		do{	num5 = (int)(Math.random()*45+1);
		} while (num1 == num2 || num1 == num3 || num2 == num3
				|| num1 == num4 || num2 == num4 || num3 == num4
				|| num1 == num5 || num2 == num5 || num3 == num5
				|| num4 == num5);

		do{	num6 = (int)(Math.random()*45+1);
		} while (num1 == num2 || num1 == num3 || num2 == num3
				|| num1 == num4 || num2 == num4 || num3 == num4
				|| num1 == num5 || num2 == num5 || num3 == num5
				|| num4 == num5 || num1 == num6 || num2 == num6
				|| num3 == num6 || num4 == num6 || num5 == num6);
		

		System.out.println("금주의 로또 번호는 " + num1 + "  " + num2 + "  " 
			+ num3 + "  " + num4+ "  " + num5 + "  " + num6);
		}
		System.out.println("");
	}
}
