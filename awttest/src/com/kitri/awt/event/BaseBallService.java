package com.kitri.awt.event;

import java.awt.Color;

import java.util.Random;

public class BaseBallService {

	BaseBallController baseBallController;
	private FontColorChooser fcc;
	private BaseBall bb;

	private int gameLength = 3;
	private int my[] = new int[gameLength];;
	private int com[] = new int[gameLength];
	private int cnt = 0;
	Random random = new Random();
	int r;
	int g;
	int b;

	public BaseBallService(BaseBallController baseBallController) {
		this.baseBallController = baseBallController;
		bb = baseBallController.baseBall;
		fcc = bb.fontColorChooser;		
		newGame();

	}

	public void newGame() {
		while (com[0] == 0) {
			com[0] = random.nextInt(9) + 1; // 1~9
		}
		do {
			com[1] = random.nextInt(10); // com[0] != , 0~9
		} while (com[0] == com[1]);
		do {
			com[2] = random.nextInt(10); // com[0] , com[1] != , 0~9
		} while (com[0] == com[2] || com[1] == com[2]);
		System.out.println("컴퓨터 : " + com[0] + com[1] + com[2]);
		clear();
		viewResult("새로운 게임을 시작합니다.");
		bb.tf.setEnabled(true);
		cnt = 0;
	}

	public void clear() {
		bb.ta.setText(" ");
	}

	public void showDap() {
		bb.ta.append("정답은 " + com[0] + com[1] + com[2] + "입니다.\n");
		viewResult("새 게임 또는 종료를 누르시오.");
		bb.tf.setEnabled(false);
	}

	public void fontColorChange() {
		fcc.setVisible(true);
		changeColor();
	}

	public void exit() {
		System.exit(0);

	}

	public void Game() {

		int strike = 0;
		int ball = 0;

		String myNumStr = bb.tf.getText().trim();
		bb.tf.setText(" ");

		if (myNumStr.length() != gameLength) {
			viewResult("3자리 숫자를 입력하세요!!");
			return;
		}

		if (!isNumber(myNumStr)) {
			viewResult("숫자만 입력하세요!!");
			return;
		}
		
		for (int i = 0; i < gameLength; i++) {
			my[i] = myNumStr.charAt(i) - 48;
			
		}

		for (int i = 0; i < 3; i++) {
			for (int y = 0; y < 3; y++) {
				if (my[i] == com[y] && i == y)
					strike++;
				else if (my[i] == com[y])
					ball++;
				// if, if else가 더 효율적인듯.
			}
		}

		cnt++;

		if (strike != gameLength) {
			viewResult(cnt + ". " + myNumStr + "은  strike : " + strike + "\tball : " + ball + '\n');

		} else {
			viewResult(myNumStr + "은 " + cnt + "번째 만에 정답입니다!!");
			viewResult("새 게임 또는 종료를 누르시오.");
			bb.tf.setEnabled(false);
		}

	}

	private void viewResult(String msg) {
		bb.ta.append(msg + "\n");
	}

	private boolean isNumber(String str) {
		boolean flag = true;
		for (int i = 0; i < gameLength; i++) {
			int num = str.charAt(i) - 48;
			if (num < 0 || num > 9) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public void changeColor() {
		r = fcc.sbR.getValue();
		g = fcc.sbG.getValue();
		b = fcc.sbB.getValue();
		fcc.colorP.setBackground(new Color(r, g, b));
		fcc.colorL.setText("r = " + r + " g = " + g + " b = " + b);
	}

	public void selectColor() {
		bb.ta.setForeground(new Color(r,g,b));
		fcc.setVisible(false);
	}
}
