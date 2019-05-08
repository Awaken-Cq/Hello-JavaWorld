
public class OverlappingIfElse {
	
	public static void main(String[] args) {
		
		
	int x = 10;
	if(x <0)
		System.out.println("x는 0 미만");
	else {
		if(x <= 10)
			System.out.println("x는 10이하");
		else
			System.out.println("x는 10초과");
		}		
	
	}
}
