package com.kitri.awt.design;

import java.awt.*;

/* �����ӻ��
 * ����Ʈ : listL
 * ���� : 4Button
 * �̽�Ʈ: listR
 * ��콺 : 2Button
 * 
 * 
 * �г� 3��
 */


public class ListTest extends Frame {

	
	
	
//	pL
	Panel pL = new Panel();
	List listL = new List();
	TextField tfL = new TextField();
//	��ư�κ� PC
	Panel pC = new Panel();
	Button btR = new Button("��");
	Button btRAll = new Button("��");
	Button btL = new Button("��");
	Button btLAll = new Button("��");
	
//	pR
	List listR = new List();
	Panel pR = new Panel();
	TextField tfR = new TextField();
	
	Font f= new Font("����",Font.BOLD,20);
	
	public ListTest() {
		
		pL.setLayout(new BorderLayout(0,10));
		listL.setBackground(Color.red);
		pL.add(listL,"Center");
		pL.add(tfL,"South");
		
		
		
		pC.setLayout(new GridLayout(6,1,0,10));
		pC.add(new Label(""));
		btR.setFont(f);
		pC.add(btR);
		btRAll.setFont(f);
		pC.add(btRAll);
		btL.setFont(f);
		pC.add(btL);
		btLAll.setFont(f);
		pC.add(btLAll);

	 	
		
		
		
		
		pR.setLayout(new BorderLayout(0,10));
		listR.setBackground(Color.blue);
		pR.add(listR,"Center");
		pR.add(tfR,"South");
		
		setLayout(new GridLayout(1, 3, 10, 0));
		add(pL);
		add(pC);
		add(pR);
		
		
		setBounds(300,200,300,500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		new ListTest();
	}
}
