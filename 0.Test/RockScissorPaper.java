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
	public void game() throws Exception{
		while(true){
		
		System.out.print("가위(0)  바위(1)  보(2) 중 하나를 선택하시오. : ");
		int my = Integer.parseInt(in.readLine());
		while(my >2){
			System.out.println("0 - 2 중 하나만 입력 가능합니다.");
			my = Integer.parseInt(in.readLine());
		}
		comRandom();
		
		if(my == com){
			System.out.println("my === " + my + "  비김  " + com + " === com");
		}else if((my-com+2)%3 == 0){
			System.out.println("my === " + my + "  승리  " + com + " === com");
		}else{
			System.out.println("my === " + my + "  패배  " + com + " === com");
		}
		System.out.print("게임 계속(1), 종료(0)을 입력하세요. : ");
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
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);	
	}
	
	
	
	
	public static void main(String[] args) throws Exception {
	RockScissorPaper t = new RockScissorPaper();
	System.out.println("==== 컴퓨터와 가위바위보 한판!!! ====");
		t.game();
			
	}
}

