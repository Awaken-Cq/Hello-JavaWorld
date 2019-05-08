public class truckUser {

	public static void main(String[] args) {
		
	Truck t1 = new Truck("옵티머스", "민트", "현대", 1000);

	System.out.println("최대중량 : " + t1.maxWeight + "kg" + "  현재중량 : " + t1.weight + "kg");
	
	System.out.println("100kg을 적재합니다.");
	t1.loadUp(100);
	System.out.println("현재중량 : " + t1.weight + "kg");
	
	System.out.println("800kg을 적재합니다.");
	t1.loadUp(800);
	System.out.println("현재중량 : " + t1.weight + "kg");

	System.out.println("500kg을 적재합니다.");
	t1.loadUp(500);
	System.out.println("현재중량 : " + t1.weight + "kg");

	System.out.println("300kg을 하차합니다.");
	t1.loadDown(300);
	System.out.println("현재중량 : " + t1.weight + "kg");

	System.out.println("1100kg을 하차합니다.");
	t1.loadDown(1100);
	System.out.println("현재중량 : " + t1.weight + "kg");


	}
}
