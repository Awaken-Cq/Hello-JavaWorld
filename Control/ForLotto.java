/*
* Lotto
1 - 3������ ���� �ٸ� ���� 
���� 3���� �޴´�
*/

public class ForLotto{
	public static void main(String[] args) {
		int num1 = 0; 
		int num2 = 0;
		int num3 = 0;
	//1��	
	/*	for(;;){
			if (num1 == num2 || num1 == num3 || num2 == num3){
				num1 = (int)(Math.random()*3+1);
				num2 = (int)(Math.random()*3+1);
				num3 = (int)(Math.random()*3+1);
			} else {
				break;
			}
		}	
	//2��	
		for(;;){
			if (num1 != num2 && num1 != num3 && num2 != num3){
				break;
			} else {
				num1 = (int)(Math.random()*3+1);
				num2 = (int)(Math.random()*3+1);
				num3 = (int)(Math.random()*3+1);
			}
		
		}		
	//3��
		for(;;){
			num1 = (int)(Math.random()*3+1);
				num2 = (int)(Math.random()*3+1);
				num3 = (int)(Math.random()*3+1);
			if (num1 != num2 && num1 != num3 && num2 != num3){
				break;
			}
		}		
		*/
	//4��
		{
		num1 = (int)(Math.random()*+1);
		for(;;){
				num2 = (int)(Math.random()*3+1);
				
			if (num1 != num2){
				break;
			}
		}	
		for(;;){
			num3 = (int)(Math.random()*3+1);
			if(num1 != num3 && num2 != num3){
				break;
			}
		}
		}
		System.out.println("���� ��÷ ��ȣ : " + num1 + " " + num2 + " " + num3);
	}
}
// 1~3���� 4���� ���̸� �˾ƾ���. 1~3���� ����� �����Ǹ� �߸��ǵ� ���δٽ�.
//�׷��� 4���� �ϳ��� ��ȣ�� �̾� ���ϹǷ� �ٽû̴� ��ȣ ���� ���� ����.

/*

		lotto = (int)(Math.random()*3);
		num1 = lotto;
		lotto = (int)(Math.random()*3);
		for(i=1;i<2;++i){
		lotto = (int)(Math.random()*3);
*/