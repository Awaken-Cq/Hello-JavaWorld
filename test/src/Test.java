/*
comrandom o
exit o


0 0 ��� 0  2 %3	
0 1 �й�-1  1 %3	1
0 2 �¸�-2  0 %3	0
1 0 �¸� 1  3 %3	0
1 1 ��� 0  2 %3	
1 2 �й�-1  1 %3	1
2 0 �й� 2  4 %3	1
2 1 �¸� 1  3 %3	0
2 2 ��� 0  2 %3	




*/

import java.io.*;

public class Test {

	private int com;
	
	BufferedReader in;

	public Test(){
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	public void game(int my) throws Exception{
		
		switch (my) {

			case 1 : 
				if(my == com){
					System.out.println("�� : ����	��ǻ�� : ����	����� ����.");
				}else if((my-com+2)%3 == 0){
					System.out.println("�� : ����	��ǻ�� : ����	����� �̰��.");
				}else{
					System.out.println("�� : ����	��ǻ�� : ��		����� ����.");
				}break;
			case 2 :
				if(my == com){
					System.out.println("�� : ��		��ǻ�� : ��		����� ����.");
				}else if((my-com+2)%3 == 0){
					System.out.println("�� : ��		��ǻ�� : ����	����� �̰��.");
				}else{
					System.out.println("�� : ��		��ǻ�� : ����	����� ����.");
				}break;
			case 0 :
				if(my == com){
					System.out.println("�� : ����	��ǻ�� : ����	����� ����.");
				}else if((my-com+2)%3 == 0){
					System.out.println("�� : ����	��ǻ�� : ��		����� �̰��.");
				}else{
					System.out.println("�� : ����	��ǻ�� : ����	����� ����.");
				}break;

	}
		/*
		if(my == com){
			System.out.println("my === " + my + "  ���  " + com + " === com");
		}else if((my-com+2)%3 == 0){
			System.out.println("my === " + my + "  �¸�  " + com + " === com");
		}else{
			System.out.println("my === " + my + "  �й�  " + com + " === com");
		}
		*/
		
		
		}
	

	private void comRandom(){
		com = (int)(Math.random()*3);
	}

	private void menu() throws Exception {
		int menu;
		
		do{
		System.out.print("���� ���(1), ����(0)�� �Է��ϼ���. : ");
		menu = Integer.parseInt(in.readLine());
		}
		while(menu>1);
		if(menu == 0)
			exit();
	}


	public void exit(){
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);	
	}
	
	
	
	
	public static void main(String[] args) throws Exception {
	Test t = new Test();
	System.out.println("==== ��ǻ�Ϳ� ���������� ����!!! ====");
		
		while(true){
		
		System.out.print("����(0)  ����(1)  ��(2) �� �ϳ��� �����Ͻÿ�. : ");
		int my = Integer.parseInt(t.in.readLine());
		while(my >2){
			System.out.println("0 - 2 �� �ϳ��� �Է� �����մϴ�.");
			my = Integer.parseInt(t.in.readLine());
		}
		t.comRandom();
		t.game(my);	
		t.menu();
		}
	}
}
