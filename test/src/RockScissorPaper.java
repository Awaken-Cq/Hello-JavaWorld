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
	public void game(int my) throws Exception{
		String result = "";
	
		if(my == com){
			result = "����.";
		}else if((my-com+2)%3 == 0){
			result = "�̰��.";
		}else{
			result = "����.";
		}
		

		System.out.println("my === " + gbb(my) + "  " + result + "  " 
			+ gbb(com) + " === com");
	}

	public String gbb(int num){
		String gbb = "";

		if(num == 0) {
			return gbb = "����";
		}else if(num == 1){
			return gbb = "����";
		}else{
			return gbb = "��";
	}
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
	RockScissorPaper t = new RockScissorPaper();
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

