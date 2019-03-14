public class TaxiGuest {

	public static void main(String[] args) {
		Taxi t1 = new Taxi();
		System.out.println("t1 >>" + t1.info());

		Taxi t2 = new Taxi("K5","감홍색","기아");
		System.out.println("t2 >>" + t2.info());
		
		int price = t2.initPrice();
		int km = 20;
		System.out.println(t2.info() + "를 타고 구디에서 강남까지"
		+ km + "km이동!!");
		price = t2.calcPrice(km);
		System.out.println("요금 : " + price + "원");
		t2.sumPrice();
		System.out.println("누적 수익 : " + t2.totalPrice + "원" + "  요금창 : " + t2.price + "원");


		price = t2.initPrice();
		km = 20;
		System.out.println(t2.info() + "를 타고 강남에서 구디까지"
		+ km + "km이동!!");
		price = t2.calcPrice(km);
		System.out.println("요금 : " + price + "원");
		t2.sumPrice();
		System.out.println("누적 수익 : " + t2.totalPrice + "원" + "  요금창 : " + t2.price + "원");

	
	}
}

