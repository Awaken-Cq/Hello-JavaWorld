package com.kitri.awt.design;

import java.awt.*;

/* 1. 프레임상속
 * 2. 선언부
 * 북 컴포넌트 6개 그리드 레이아웃 2,3 위는 레이도박스 아래는 체크박스 v
 * 남 컴포넌트 2개 플로우 0,2 좌는 초이스 우는 버튼 v
 * 보더레이아웃 북 중 남
 * 3.배치부 디자인
 * 
 * 
 * 패널 2개
 * 
 */

public class ItemTest extends Frame {

	Panel pN = new Panel();
	Panel pS = new Panel();
	CheckboxGroup cg = new CheckboxGroup();
	Checkbox mor = new Checkbox("아침", cg, true);
	Checkbox aft = new Checkbox("점심", cg, false);
	Checkbox eve = new Checkbox("저녁", cg, false);

	Checkbox app = new Checkbox("사과", true);
	Checkbox bana = new Checkbox("바나나");
	Checkbox straw = new Checkbox("딸기");

	TextArea ta = new TextArea();

	Choice ch = new Choice();

	Button exit = new Button("종료");

	public ItemTest() {

		pN.setLayout(new GridLayout(2, 3, 10, 0));
		mor.setBackground(Color.yellow);
		pN.add(mor);
		aft.setBackground(Color.red);
		pN.add(aft);
		eve.setBackground(Color.PINK);
		pN.add(eve);

		pN.add(app);
		app.setBackground(Color.red);
		pN.add(bana);
		bana.setBackground(Color.yellow);
		pN.add(straw);
		straw.setBackground(Color.red);

		pS.setLayout(new BorderLayout(10, 0));
		ch.add("아침");
		ch.add("점심");
		ch.add("저녁");
		
		ch.setSize(100, 20);
		pS.add(ch, "Center");
		exit.setBackground(Color.CYAN);
		pS.add(exit, "East");

		add(pN, "North");
		add(ta, "Center");
		add(pS, "South");

		setBounds(300, 200, 300, 500);
		setVisible(true);

	}

	public static void main(String[] args) {

		new ItemTest();

	}
}
