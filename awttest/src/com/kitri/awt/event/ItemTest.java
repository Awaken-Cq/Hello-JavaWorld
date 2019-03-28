package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.*;

/* 1. 프레임상속
 * 2. 선언부
 * 북 컴포넌트 6개 그리드 레이아웃 2,3 위는 레이도박스 아래는 체크박스 v
 * 남 컴포넌트 2개 플로우 0,2 좌는 초이스 우는 버튼 v
 * 보더레이아웃 북 중 남
 * 3.배치부 디자인
 * 4.기능설정
 * 1)체크박스그룹을 바꾸면 밑에 초이스도 바뀜(반대도 포함)
 * 2) 1)에 따라서 ta에 
 * -- 저녁 --	//	<-- 바뀜
 * 1. 사과 : //	체크에 따라서 "먹었다" , "안먹었다"로 출력
 * 2. 바나나 :
 * 3. 딸기 :
 * 3)종료누르면 창 종료
 * 5.E.S. 5개
 * 버튼 에드액션 - 액션리스너
 * 체크박스6개 에드아이템 - 액션리스너
 * 초이스 에드아이템 - 아이템리스너
 * 
 * 
 * 패널 2개
 * 
 */

public class ItemTest extends Frame implements ItemListener, ActionListener {

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
		
		exit.addActionListener(this);

		mor.addItemListener(this);
		aft.addItemListener(this);
		eve.addItemListener(this);
		app.addItemListener(this);
		bana.addItemListener(this);
		straw.addItemListener(this);
		ch.addItemListener(this);
	}

	public static void main(String[] args) {

		new ItemTest();

	}
//	우리가 호출할 수 없는 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object ob = e.getSource();
			if(ob == ch) {
				String str = ch.getSelectedItem();
				if(str.equals("아침")) {
					mor.setState(true);
				}else if(str.equals("점심")) {
					aft.setState(true);					
				}else {
					eve.setState(true);
				}
		}
		Checkbox sel = cg.getSelectedCheckbox();
		String selStr = sel.getLabel();
//		System.out.println(selStr);
		ta.setText("--- " + selStr + " ---\n");
//		ta.append("1. 사과 : " + (app.getState()==true? "먹었다" : "안먹었다")+ "\n");
//		ta.append("2. 바나나 : " + (bana.getState() == true ? "먹었다" : "안먹었다")+ "\n");
//		ta.append("3. 딸기 : " + (straw.getState() == true ? "먹었다" : "안먹었다")+ "\n");
//		3삼연산자 코딩 3개가 모두 같은 기능을 하는 코딩이기 때문에 적을 수록 좋다 그렇기 때문에
//		getState의 반환값이 boolean이고 그 값을 받아서 String을 반환하는 메소드를 만듬
		ta.append("1. 사과 : " + eat(app.getState())+ "\n");
		ta.append("2. 바나나 : " + eat(bana.getState())+ "\n");
		ta.append("3. 딸기 : " + eat(straw.getState())+ "\n");
		ch.select(selStr);
	}
		private String eat(boolean flag) {
			return flag ? "먹었다" : "안먹었다.";
		}
	
}
