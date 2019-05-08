/*1. extends Frame
 * 2. �����
 * nor - cen, ea	/	2Label
 * cen - 16button �迭���
 * sou - 1button
 * 
 * 
 * 
 * tooment2@nate.com
 * ���� 3�� ���� calc, cont, serv
 * ÷������ �̸� : calculator_�̸�.zip
 * �������� :kitri_����Ź_���ڸ�or�����ڸ�
 * ���� c.java
 * �ڵ�����
 * c.c
 * �ڵ�����
 * c.s
 * �ڵ�����
 */



package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Calculator extends Frame  {
//	p
	Panel pN = new Panel();
	Panel pC = new Panel();
	Button exit = new Button("Exit");
	
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

//		�����Ҵ�
		pN.setLayout(new BorderLayout());
		numL.setBackground(Color.pink);
		pN.add(numL,"Center");
		operL.setBackground(Color.lightGray);		
		pN.add(operL,"East");
		

		pC.setLayout(new GridLayout(4,4,10,10));
		
		
		int r = 100;
		int g = 170;
		int b = 150;
	
//		
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
//		
		
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
		
//		ȭ�鱸��
		setTitle("CalCulator");
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
