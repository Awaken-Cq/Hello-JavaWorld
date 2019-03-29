/*1. extends Frame
 * 2. 선언부
 * nor - cen, ea	/	2Label
 * cen - 16button 배열사용
 * sou - 1button
 * 
 * 
 * 
 * tooment2@nate.com
 * 파일 3개 압축 calc, cont, serv
 * 첨부파일 이름 : calculator_이름.zip
 * 메일제목 :kitri_노정탁_한자리or여러자리
 * 내용 c.java
 * 코딩내용
 * c.c
 * 코딩내용
 * c.s
 * 코딩내용
 */



package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Calculator extends Frame  {
//	p
	Panel pN = new Panel();
	Panel pC = new Panel();
	Button exit = new Button("종\t료");
	
	CalculatorController calculatorController;
	
//	pN
	Label numL = new Label();
	Label operL = new Label();
//	pC
//	Button btn = new Button();
	Button btn[] = new Button[16];
	String str[] = {"7","8","9","+","4","5","6","-","1","2","3","*","0","C","=","/"};
	
	
	public Calculator() {
		
		calculatorController = new CalculatorController(this);

//		구역할당
		pN.setLayout(new BorderLayout());
		numL.setBackground(Color.pink);
		pN.add(numL,"Center");
		operL.setBackground(Color.lightGray);		
		pN.add(operL,"East");
		

		pC.setLayout(new GridLayout(4,4,10,10));
		
		
		int r = 100;
		int g = 170;
		int b = 150;
		
//		int len = str.length;
//		System.out.println(str.length);
//		for (int i = 0; i < len; i++) {
//				pC.add(btn = new Button());
//				String x = str[i];
//				btn.setLabel(x);
//		
//				btn.setBackground(new Color(r, g, b));
//				r += 3;
//				g += 5;
//				b += 7;
//			
//				}
		
		
		int len = btn.length;
			for (int i = 0; i < len; i++) {
				pC.add(btn[i] = new Button(str[i]));
				
				btn[i].setBackground(new Color(r, g, b));
				r += 7;
				g += 2;
				b += 7;
			}
		

//		setLayout(new BorderLayout());
		add(pN,"North");
		add(pC,"Center");
		add(exit,"South");
		
//		화면구현
		setBounds(300, 200, 300, 500);
		setVisible(true);
		
		
		
		for (int i = 0; i < len; i++) {
			btn[i].addActionListener(calculatorController);
		}
		exit.addActionListener(calculatorController);
		
	}
		
	public static void main(String[] args) {
			new Calculator();
		

	}

	

}
