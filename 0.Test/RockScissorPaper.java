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

public class RockScissorPaper {

	private int com;
	
	BufferedReader in;

	public RockScissorPaper(){
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	public void game() throws Exception{
		while(true){
		
		System.out.print("����(0)  ����(1)  ��(2) �� �ϳ��� �����Ͻÿ�. : ");
		int my = Integer.parseInt(in.readLine());
		while(my >2){
			System.out.println("0 - 2 �� �ϳ��� �Է� �����մϴ�.");
			my = Integer.parseInt(in.readLine());
		}
		comRandom();
		
		if(my == com){
			System.out.println("my === " + my + "  ���  " + com + " === com");
		}else if((my-com+2)%3 == 0){
			System.out.println("my === " + my + "  �¸�  " + com + " === com");
		}else{
			System.out.println("my === " + my + "  �й�  " + com + " === com");
		}
		System.out.print("���� ���(1), ����(0)�� �Է��ϼ���. : ");
		menu();
		
		
		}
	}

	private void comRandom(){
		com = (int)(Math.random()*3+1);
	}

	private void menu() throws Exception {
		int menu = Integer.parseInt(in.readLine());
		if(menu == 0)
			exit();
	}


	public void exit(){
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);	
	}
	
	
	
	
	public static void main(String[] args) throws Exception {
	RockScissorPaper t = new RockScissorPaper();
	System.out.println("==== ��ǻ�Ϳ� ���������� ����!!! ====");
		t.game();
			
	}
}

