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
					System.out.println("나 : 바위	컴퓨터 : 바위	결과는 비겼다.");
				}else if((my-com+2)%3 == 0){
					System.out.println("나 : 바위	컴퓨터 : 가위	결과는 이겼다.");
				}else{
					System.out.println("나 : 바위	컴퓨터 : 보		결과는 졌다.");
				}break;
			case 2 :
				if(my == com){
					System.out.println("나 : 보		컴퓨터 : 보		결과는 비겼다.");
				}else if((my-com+2)%3 == 0){
					System.out.println("나 : 보		컴퓨터 : 바위	결과는 이겼다.");
				}else{
					System.out.println("나 : 보		컴퓨터 : 가위	결과는 졌다.");
				}break;
			case 0 :
				if(my == com){
					System.out.println("나 : 가위	컴퓨터 : 가위	결과는 비겼다.");
				}else if((my-com+2)%3 == 0){
					System.out.println("나 : 가위	컴퓨터 : 보		결과는 이겼다.");
				}else{
					System.out.println("나 : 가위	컴퓨터 : 바위	결과는 졌다.");
				}break;

	}
		/*
		if(my == com){
			System.out.println("my === " + my + "  비김  " + com + " === com");
		}else if((my-com+2)%3 == 0){
			System.out.println("my === " + my + "  승리  " + com + " === com");
		}else{
			System.out.println("my === " + my + "  패배  " + com + " === com");
		}
		*/
		
		
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
	Test t = new Test();
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
