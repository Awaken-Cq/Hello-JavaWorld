public class BusPee {

	public static void main(String[] args) {
		
	int pee = 1000;
	int age = 64;	
	
	if(age >= 65)
		pee = pee * 0 / 100;
	if (age >= 20 && age < 65)
		pee = pee * 100 / 100;
	if(age >= 14 && age <=19)
		pee = pee * 75/100;
	if(age >= 4 && age<= 13)
		pee = pee * 50 / 100;
	if(age < 4)
		pee = pee * 0 / 100;


	System.out.println("최종요금 : " + pee);

	}
}
