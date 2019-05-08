//31분

public class FreeTest2 {

	
		
		String bookName;
		int price;
		int totalPrice;
		double disC = 0.15;

		
		public FreeTest2(String bookName, int price){
			this.bookName = bookName;
			this.price = price;
		}
		
		public FreeTest2(){
			this("Java", 24000);
		}
/*		public FreeTest2(){
			this("JQuery", 21000);
		}

		public FreeTest2(){
			this("오라클", 19000);
		}


		public FreeTest2(){
			this("스프링", 35000);
		}
*/
		
		public int dissum(int a){
				totalPrice = (int)(a *(1- disC));
				return totalPrice;
		}


}
