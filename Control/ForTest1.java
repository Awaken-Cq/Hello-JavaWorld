public class ForTest1 {

	public static void main(String[] args) {
		System.out.println("1 ~ 10���� ���.");
		int i;
		for(i = 1; i<11;i++){
			System.out.print(i+"\n");
		}
		System.out.print('\n');
		System.out.println("���α׷� ����!!!");

		System.out.println("1 ~ 10���� ���(Ȧ����).");
		for(i=1;i<11;i+=2){
			System.out.println(i);
		}
			

		System.out.println("1 ~ 100���� ���(10������ �ٹٲ�).");
		

		for(i=1;i<101;i++){
			System.out.print(i+" ");
			if(i%10 == 0){
				System.out.print("\n");}
		}
	


		System.out.print('\n');
		System.out.println("���α׷� ����!!!");

	}
}
