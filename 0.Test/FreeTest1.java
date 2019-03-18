// 8분 50초

public class FreeTest1 {

	public static void main(String[] args) {
		
		
		int basu2 = 0;
		int basu3 = 0;
		int basu5 = 0;
		int number = 20;

		System.out.println("반복 횟수를 입력하세요 : " + number);
		for(int i=1;i<=number;i++){
			System.out.print(i + ". ");
			if(0 == i%2){
				basu2++;
				System.out.print("2의 배수 ");		
			}
			if(0 == i%3){
				basu3++;
				System.out.print("3의 배수 ");
			}
			
			if(0 == i%5){
				basu5++;
				System.out.print("5의 배수 ");
			}
			System.out.print('\n');
		}
		System.out.println("===== 출력 횟수 =====");
		System.out.println("2의 배수 : " + basu2);
		System.out.println("3의 배수 : " + basu3);
		System.out.println("5의 배수 : " + basu5);
	}
}
