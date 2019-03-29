/* 0. com, my 3�ڸ� �迭. ������ ���� �� �ְԲ�. for��
 * 1. com ���ڸ� ���� �߻� -> com �迭������ >> comRandom()
 * 2. 1�� ���ڴ� �ߺ� ���� X, 0���� ���� X (!= 0)
 * 3. ���� �Է��� 3�ڸ����ڸ�  my �迭�� �ֱ�
 * 4. ���ں񱳿� �ڸ��� count++
 * 5. ���ڰ� ���ٸ� if ? 5-1 : �ƿ�
 * 	5-1. �ڸ��� ���ٸ� if��ø ? ��ũ :��
 * 6. 5�� ���
 * 6-1. strike�� 3 : xxx�� x��°���� �����Դϴ�. 
 * 		���(1), ����(0);
 * 6-2. strike�� 3�� �ƴ϶��
 * 		xxx�� x��Ʈ����ũ x���Դϴ�.
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

			System.out.println("�����Է� : ");
			int myNum = getNumber();// 149
			my[0] = myNum / 100;// 1
//			my[1] = Math.round((myNum%100)/10);//4
			my[1] = (myNum / 10) % 10; // 4
			my[2] = myNum % 10;// 9

			// ���ڿ� �ڸ��� ��

			for (int i = 0; i < 3; i++) {
				for (int y = 0; y < 3; y++) {
					if (my[i] == com[y] && i == y)
						strike++;
					else if (my[i] == com[y])
						ball++;
					// if, if else�� �� ȿ�����ε�.
				}
			}
			cnt++; // ������ ���������� �������� ī��Ʈ�� �ø��°� ��ġ�� �´�.

			System.out.println(my[0] + "" + my[1] + "" + my[2] + "==" + com[0] + com[1] + com[2]);
			// ���
			if (strike != 3) {
				System.out.println("strike : " + strike + "\tball : " + ball);
			} else {
				System.out.println(myNum + "�� " + cnt + "��° ���� �����Դϴ�!!");
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

	// exit()�޼ҵ带 ���� �����ʿ����, game()�ȿ��� ¥�� ������ ����. ������ ������???
	private void exit() throws NumberFormatException, IOException {
		while (true) {
			System.out.println("�ٽ� �Ͻðڽ��ϱ�? �ٽ�(1), ����(0)");
			int e = Integer.parseInt(in.readLine());
			if (e == 1) {
				cnt = 0;
				comRandom();
				break;
			} else if (e == 0) {
				System.out.println("���α׷��� ����˴ϴ�.");
				System.exit(0);
			} else {
				System.out.println("�Է��� ���� �ʽ��ϴ�.");
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		NumberBaseBall nbb = new NumberBaseBall();
		nbb.game();

	}

}
