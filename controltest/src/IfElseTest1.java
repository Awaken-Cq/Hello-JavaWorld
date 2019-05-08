public class IfElseTest1 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		String result;
		// if ~ else
		/*if(x > y){
			System.out.println( x + "는 " + y + "보다 크다.");
		} else {
			System.out.println( x + "는 " + y + "보다 작다.");
		}*/


		
		/*if(x > y){
			result = "크다.";
			} else {
			result = "작다.";
			}

		System.out.println( x + "는 " + y + "보다 " + result);*/

		//중첩 if
		/*String result;
		if(x == y){
		result = "같다.";
		} else {
			if(x < y){
			result = "작다.";
			} else {
			result = "크다.";
			}			
		}*/

		//if elseif else
		/*if (x == y){
			result = "같다.";
		} else if( x > y ){
			result = "크다";
		} else {
			result = "작다";
		}*/
		
		/*if (x - y == 0){
			result = "같다.";
		} else if(x - y > 0){
			result = "크다.";
		} else {
			result = "작다";
		}*/
				
		result = x == y ? "같다" : (x > y ? "크다" : "작다");

		System.out.println( x + "는 " + y + "보다 " + result);


		System.out.println("프로그램 종료!!!");



	}
}
