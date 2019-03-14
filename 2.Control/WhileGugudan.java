public class WhileGugudan {

	public static void main(String[] args) {
		int dan = 0;
		int i = 0;
		

		while(i < 9){
			++i;
			dan = 1;
			while(dan < 9){
			++dan;
			System.out.print(dan + " * " + i + " = " + dan*i + "  ");
			}

			System.out.println("");
			
		}
	
		
		
		
	}
}
