/* 0. com, my 3자리 배열. 교차로 비교할 수 있게끔. for문
 * 1. com 세자리 난수 발생 -> com 배열안으로 >> comRandom()
 * 2. 1의 숫자는 중복 숫자 X, 0으로 시작 X (!= 0)
 * 3. 내가 입력한 3자리숫자를  my 배열에 넣기
 * 4. 숫자비교와 자리비교 count++
 * 5. 숫자가 같다면 if ? 5-1 : 아웃
 * 	5-1. 자리수 같다면 if중첩 ? 스크 :볼
 * 6. 5의 결과
 * 6-1. strike가 3 : xxx는 x번째만에 정답입니다. 
 * 		계속(1), 종료(0);
 * 6-2. strike가 3이 아니라면
 * 		xxx는 x스트라이크 x볼입니다.
 * 		-> 3.
 */

package com.kitri.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberBaseBall {

	private static int my[] = new int[3];
	private int com[] = new int[3];
	BufferedReader in;
	private int cnt = 0;

	private void comRandom() {
		while (com[0] == 0) {
			com[0] = (int) (Math.random() * 10); // 1~9
		}
		do {
			com[1] = (int) (Math.random() * 10); // com[0] != , 0~9
		} while (com[0] == com[1]);
		do {
			com[2] = (int) (Math.random() * 10); // com[0] , com[1] != , 0~9
		} while (com[0] == com[2] || com[1] == com[2]);

	}

	private void game() throws NumberFormatException, IOException {
		int strike;
		int ball;
		while (true) {
			strike = 0;
			ball = 0;

			System.out.println("숫자입력 : ");
			int myNum = getNumber();// 149
			my[0] = myNum / 100;// 1
//			my[1] = Math.round((myNum%100)/10);//4
			my[1] = (myNum / 10) % 10; // 4
			my[2] = myNum % 10;// 9

			// 숫자와 자리수 비교

			for (int i = 0; i < 3; i++) {
				for (int y = 0; y < 3; y++) {
					if (my[i] == com[y] && i == y)
						strike++;
					else if (my[i] == com[y])
						ball++;
					// if, if else가 더 효율적인듯.
				}
			}
			cnt++; // 게임이 정상적으로 돌았을때 카운트를 올리는게 이치에 맞다.

			System.out.println(my[0] + "" + my[1] + "" + my[2] + "==" + com[0] + com[1] + com[2]);
			// 결과
			if (strike != 3) {
				System.out.println("strike : " + strike + "\tball : " + ball);
			} else {
				System.out.println(myNum + "은 " + cnt + "번째 만에 정답입니다!!");
				exit();
			}
		}

	}

	public NumberBaseBall() {
		comRandom();
		in = new BufferedReader(new InputStreamReader(System.in));

	}

	private int getNumber() {
		int num = 0;
		try {
			num = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return num;
	}

	// exit()메소드를 따로 만들필요없이, game()안에서 짜도 문제가 없다. 오히려 나은가???
	private void exit() throws NumberFormatException, IOException {
		while (true) {
			System.out.println("다시 하시겠습니까? 다시(1), 종료(0)");
			int e = Integer.parseInt(in.readLine());
			if (e == 1) {
				cnt = 0;
				comRandom();
				break;
			} else if (e == 0) {
				System.out.println("프로그램이 종료됩니다.");
				System.exit(0);
			} else {
				System.out.println("입력이 옳지 않습니다.");
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		NumberBaseBall nbb = new NumberBaseBall();
		nbb.game();

	}

}
