// 8�� 50��

public class FreeTest1 {

	public static void main(String[] args) {
		
		
		int basu2 = 0;
		int basu3 = 0;
		int basu5 = 0;
		int number = 20;

		System.out.println("�ݺ� Ƚ���� �Է��ϼ��� : " + number);
		for(int i=1;i<=number;i++){
			System.out.print(i + ". ");
			if(0 == i%2){
				basu2++;
				System.out.print("2�� ��� ");		
			}
			if(0 == i%3){
				basu3++;
				System.out.print("3�� ��� ");
			}
			
			if(0 == i%5){
				basu5++;
				System.out.print("5�� ��� ");
			}
			System.out.print('\n');
		}
		System.out.println("===== ��� Ƚ�� =====");
		System.out.println("2�� ��� : " + basu2);
		System.out.println("3�� ��� : " + basu3);
		System.out.println("5�� ��� : " + basu5);
	}
}
