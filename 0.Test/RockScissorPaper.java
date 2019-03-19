/*
comrandom o
exit o


0 0 비김 0  2 %3	
0 1 패배-1  1 %3	1
0 2 승리-2  0 %3	0
1 0 승리 1  3 %3	0
1 1 비김 0  2 %3	
1 2 패배-1  1 %3	1
2 0 패배 2  4 %3	1
2 1 승리 1  3 %3	0
2 2 비김 0  2 %3	




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
			result = "비겼다.";
		}else if((my-com+2)%3 == 0){
			result = "이겼다.";
		}else{
			result = "졌다.";
		}
		

		System.out.println("my === " + gbb(my) + "  " + result + "  " 
			+ gbb(com) + " === com");
	}

	public String gbb(int num){
		String gbb = "";

		if(num == 0) {
			return gbb = "가위";
		}else if(num == 1){
			return gbb = "바위";
		}else{
			return gbb = "보";
	}
	}


	private void comRandom(){
		com = (int)(Math.random()*3);
	}

	private void menu() throws Exception {
		int menu;
		
		do{
		System.out.print("게임 계속(1), 종료(0)을 입력하세요. : ");
		menu = Integer.parseInt(in.readLine());
		}
		while(menu>1);
		
		if(menu == 0)
			exit();
	}


	public void exit(){
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);	
	}
	
	
	
	
	public static void main(String[] args) throws Exception {
	RockScissorPaper t = new RockScissorPaper();
	System.out.println("==== 컴퓨터와 가위바위보 한판!!! ====");
		while(true){
		System.out.print("가위(0)  바위(1)  보(2) 중 하나를 선택하시오. : ");
		int my = Integer.parseInt(t.in.readLine());
		while(my >2){
			System.out.println("0 - 2 중 하나만 입력 가능합니다.");
			my = Integer.parseInt(t.in.readLine());
		}
		t.comRandom();
		t.game(my);
		t.menu();
		}
			
	}
}

