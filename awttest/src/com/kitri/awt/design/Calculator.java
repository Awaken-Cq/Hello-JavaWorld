/*1. extends Frame
 * 2. �����
 * nor - cen, ea	/	2Label
 * cen - 16button �迭���
 * sou - 1button
 * 
 * 
 * 
 * 
 * 
 */



package com.kitri.awt.design;

import java.awt.*;



public class Calculator extends Frame {
//	p
	Panel pN = new Panel();
	Panel pC = new Panel();
	Button exit = new Button("��\t��");
	
//	pN
	Label numL = new Label();
	Label operL = new Label();
//	pC
	Button btn = new Button();
	String str[] = {"7","8","9","+","4","5","6","-","1","2","3","*","0","C","=","/"};
	
	
//	for(int i = 1;i<17;i++) {
//		Button btn = new Button(i);
//		}
	
	
	
	public Calculator() {
		


//		�����Ҵ�
		pN.setLayout(new BorderLayout());
		pN.add(numL,"Center");
		pN.add(operL,"East");
		
//		@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		pC.setLayout(new GridLayout(4,4));
		
		
		
		int len = str.length;
				for (int i = 0; i < len; i++) {
					pC.add(btn);
//					btn.getLabel(i-1);;
				}

//		setLayout(new BorderLayout());
		add(pN,"North");
		add(pC,"Center");
		add(exit,"South");
		
//		ȭ�鱸��
		setBounds(300, 200, 300, 500);
		setVisible(true);
	}
		
	public static void main(String[] args) {
			new Calculator();
		

	}

}
