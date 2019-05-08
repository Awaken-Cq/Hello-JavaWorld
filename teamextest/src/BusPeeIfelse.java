public class BusPeeIfelse {

	public static void main(String[] args) {
	int pee = 1000;
	int age = 13;	
	
	if(age <4)
		pee = pee * 0 / 100;
		else if(age < 14)
		pee = pee * 50 / 100;
		else if(age < 20)
		pee = pee * 75/100;
		else 
		pee = pee * 100 / 100;
		


	System.out.println("최종요금 : " + pee);
	}
}
