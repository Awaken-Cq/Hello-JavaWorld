public class ForTest1 {

	public static void main(String[] args) {
		System.out.println("1 ~ 10까지 출력.");
		int i;
		for(i = 1; i<11;i++){
			System.out.print(i+"\n");
		}
		System.out.print('\n');
		System.out.println("프로그램 종료!!!");

		System.out.println("1 ~ 10까지 출력(홀수만).");
		for(i=1;i<11;i+=2){
			System.out.println(i);
		}
			

		System.out.println("1 ~ 100까지 출력(10개단위 줄바꿈).");
		

		for(i=1;i<101;i++){
			System.out.print(i+" ");
			if(i%10 == 0){
				System.out.print("\n");}
		}
	


		System.out.print('\n');
		System.out.println("프로그램 종료!!!");

	}
}
