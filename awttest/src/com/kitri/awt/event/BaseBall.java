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
package com.kitri.awt.event;

import java.awt.*;

public class BaseBall extends Frame {

	
	Panel pC = new Panel();
	Panel pCS = new Panel();
	Panel pE = new Panel();
	
	//pC
	TextArea ta = new TextArea();
	
	//pR
	Button newG = new Button("새 게임");
	Button clear = new Button("지우기");
	Button dap = new Button("정답");
	Button fontC = new Button("글자색");
	Button exit = new Button("종료");
	
	//pCS
	Label l = new Label("숫자");
	TextField tf = new TextField();
	
	
	

	public BaseBall() {
		
		//pCS
		pCS.setLayout(new BorderLayout(10,0));
		pCS.add(l,"West");
		pCS.add(tf,"Center");
		

		//pE
		pE.setLayout(new GridLayout(5, 0, 10, 10));
		
		pE.add(newG);
		pE.add(clear);
		pE.add(dap);
		pE.add(fontC);
		pE.add(exit);
		
		//pC
		pC.setLayout(new BorderLayout(0,10));
		ta.setBackground(Color.GREEN);
		pC.add(ta,"Center");
		pC.add(pCS,"South");
		
		
		
		
		
		
		
		//구역할당
		add(pC,"Center");
		add(pE,"East");
		
		
		//화면구현
		setBounds(300, 200, 300, 500);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new BaseBall();
		
	}
}
