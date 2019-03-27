package com.kitri.awt.design;

import java.awt.*;

/* 프레임상속
 * 웨스트 : listL
 * 센터 : 4Button
 * 이스트: listR
 * 사우스 : 2Button
 * 
 * 
 * 패널 3개
 */


public class ListTest extends Frame {

	
	
	
//	pC
	Panel pC = new Panel();
	List listL = new List();
	
//	버튼부분 PCC
	Panel pCC = new Panel();
	Button btR = new Button("▷");
	Button btRAll = new Button("▶");
	Button btL = new Button("◁");
	Button btLAll = new Button("◀");
	

	List listR = new List();
	
	Panel pS = new Panel();
	TextField tfL = new TextField();
	TextField tfR = new TextField();
	
	
	
	public ListTest() {
		
		pC.setLayout(new GridLayout(0,3));
		
		
		pC.add(listL);
		listL.setBackground(Color.red);

		
		pC.add(pCC);
		pCC.setLayout(new GridLayout(4,0,0,50));
		
		pCC.add(btR);
//		btR.setSize(25,25);
		pCC.add(btRAll);
//		btRAll.setSize(25,25);
		pCC.add(btL);
//		btL.setSize(25,25);
		pCC.add(btLAll);
//		btLAll.setSize(25,25);
	 	
		
		pC.add(listR);
		listR.setBackground(Color.blue);
		
		
		pS.setLayout(new GridLayout(0,2,100,0));
		pS.add(tfL);
		pS.add(tfR);
		
		add(pC,"Center");
		add(pS,"South");
		
		setBounds(300,200,300,500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		new ListTest();
	}
}
