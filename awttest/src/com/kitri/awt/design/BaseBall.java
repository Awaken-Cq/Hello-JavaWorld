/*1.Frame 상속
 *2.선언부
 *볼더레이아웃
 * Center ta
 * pE grid 4Button
 * pS grid Label, tF, Button
 * 
 * 
 * 패널 2개
 */
package com.kitri.awt.design;

import java.awt.*;

public class BaseBall extends Frame {

	
	Panel pE = new Panel();
	Panel pS = new Panel();
	
	//pC
	TextArea ta = new TextArea();
	
	//pE
	Button newG = new Button("새 게임");
	Button clear = new Button("지우기");
	Button dap = new Button("정답");
	Button fontC = new Button("글자색");
	
	//pS
	Label l = new Label("숫자");
	TextField tf = new TextField();
	Button exit = new Button("종료");
	
	

	public BaseBall() {
		
		
		//pC
		
		ta.setBackground(Color.GREEN);
		
		//pE
		pE.setLayout(new GridLayout(4, 0, 20, 20));
		pE.add(newG);
		pE.add(clear);
		pE.add(dap);
		pE.add(fontC);
		
		//pS
		pS.setLayout(new BorderLayout());
		pS.add(l,"West");
		pS.add(tf,"Center");
		pS.add(exit,"East");
		
		
		
		
		
		//구역할당
		add(ta,"Center");
		add(pE,"East");
		add(pS,"South");
		
		//화면구현
		setBounds(300, 200, 300, 500);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new BaseBall();
		
	}
}
