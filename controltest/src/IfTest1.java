public class IfTest1 {

	public static void main(String[] args) {
		int x = 10;
		int y = 7;
		if(x > y) {
		System.out.println("x가 크다");
		}
		
		

		int jumin = 2;
		if(jumin%2 == 0){
		System.out.println("여자입니다.");
		}
		
		if(jumin%2 == 1){
		System.out.println("남자입니다.");
		}
		
		if(jumin == 2 || jumin == 4){
		System.out.println("여자입니다.");
		}
		
		if(jumin == 1 || jumin == 3){
		System.out.println("남자입니다.");
		}


		String gender = "남자입니다.";
		if(jumin%2 == 0){
		gender = "여자입니다.";
		}
		System.out.println(gender);


		System.out.println("프로그램 종료됩니다.");
	}


}
