/*1.Frame ���
 *2.�����
 *�������̾ƿ�
 * Center ta
 * pE grid 4Button
 * pS grid Label, tF, Button
 * 
 * 
 * �г� 2��
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
	Button newG = new Button("�� ����");
	Button clear = new Button("�����");
	Button dap = new Button("����");
	Button fontC = new Button("���ڻ�");
	Button exit = new Button("����");
	
	//pCS
	Label l = new Label("����");
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
		
		
		
		
		
		
		
		//�����Ҵ�
		add(pC,"Center");
		add(pE,"East");
		
		
		//ȭ�鱸��
		setBounds(300, 200, 300, 500);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new BaseBall();
		
	}
}
