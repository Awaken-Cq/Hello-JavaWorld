public class FreeTest22 {

	public static void main(String[] args) {
			int sum = 0;
			int total = 0;

			FreeTest2 ft1 = new FreeTest2();
			sum += ft1.price;
			FreeTest2 ft2 = new FreeTest2("JQuery",21000);
			
			sum += ft2.price;
			FreeTest2 ft3 = new FreeTest2("오라클", 19000);
		
			sum += ft3.price;
			FreeTest2 ft4 = new FreeTest2("스프링", 35000);
		
			sum += ft4.price;

			System.out.println("===== 도서 구입 목록 =====");
			System.out.println(ft1.bookName + " : " + ft1.price);
			System.out.println(ft2.bookName + " : " + ft2.price);
			System.out.println(ft3.bookName + " : " + ft3.price);
			System.out.println(ft4.bookName + " : " + ft4.price);

			System.out.println("--------------------------");
			System.out.println("주문 총금액 : " + sum + "원");
			total = ft1.dissum(sum);
			System.out.println("할인후 결제 금액 : " + total  + "원");

		}
}
