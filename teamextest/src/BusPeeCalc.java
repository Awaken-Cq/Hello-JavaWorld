
public class BusPeeCalc {

	public static void main(String[] args) {
		
		int age = 17;
		double discount = 0.25;
		int pee = 1000;
		
		if (age >= 20)
			System.out.println("최종요금 : " + pee + "원");
		else {
			pee = (int)(pee *(1-discount));
			System.out.println("최종요금 : " + pee + "원");
			
		}
		
	}
}
