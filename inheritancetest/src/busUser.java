public class busUser {

	public static void main(String[] args) {
		
		Bus b1 = new Bus("타요","파란색","현대");
		int pCount=0;
		pCount=5;
		System.out.println(pCount + "명의 승객이 내립니다.");
		b1.getOff(pCount);
		System.out.println("현재 승객 수 : " + b1.pCount + "명");

		pCount=5;
		System.out.println(pCount + "명의 승객이 탑니다.");
		b1.getOn(pCount);
		System.out.println("현재 승객 수 : " + b1.pCount + "명");

		pCount=5;
		System.out.println(pCount + "명의 승객이 탑니다.");
		b1.getOn(pCount);
		System.out.println("현재 승객 수 : " + b1.pCount + "명");

		pCount=7;
		System.out.println(pCount + "명의 승객이 내립니다.");
		b1.getOff(pCount);
		System.out.println("현재 승객 수 : " + b1.pCount + "명");
	}
}
