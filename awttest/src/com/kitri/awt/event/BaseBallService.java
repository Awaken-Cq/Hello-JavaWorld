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
		System.out.println("��ǻ�� : " + com[0] + com[1] + com[2]);
		clear();
		viewResult("���ο� ������ �����մϴ�.");
		bb.tf.setEnabled(true);
		cnt = 0;
	}

	public void clear() {
		bb.ta.setText(" ");
	}

	public void showDap() {
		bb.ta.append("������ " + com[0] + com[1] + com[2] + "�Դϴ�.\n");
		viewResult("�� ���� �Ǵ� ���Ḧ �����ÿ�.");
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
			viewResult("3�ڸ� ���ڸ� �Է��ϼ���!!");
			return;
		}

		if (!isNumber(myNumStr)) {
			viewResult("���ڸ� �Է��ϼ���!!");
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
				// if, if else�� �� ȿ�����ε�.
			}
		}

		cnt++;

		if (strike != gameLength) {
			viewResult(cnt + ". " + myNumStr + "��  strike : " + strike + "\tball : " + ball + '\n');

		} else {
			viewResult(myNumStr + "�� " + cnt + "��° ���� �����Դϴ�!!");
			viewResult("�� ���� �Ǵ� ���Ḧ �����ÿ�.");
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
