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
package com.kitri.awt.design;

import java.awt.*;

public class BaseBall extends Frame {

	
	Panel pE = new Panel();
	Panel pS = new Panel();
	
	//pC
	TextArea ta = new TextArea();
	
	//pE
	Button newG = new Button("�� ����");
	Button clear = new Button("�����");
	Button dap = new Button("����");
	Button fontC = new Button("���ڻ�");
	
	//pS
	Label l = new Label("����");
	TextField tf = new TextField();
	Button exit = new Button("����");
	
	

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
		
		
		
		
		
		//�����Ҵ�
		add(ta,"Center");
		add(pE,"East");
		add(pS,"South");
		
		//ȭ�鱸��
		setBounds(300, 200, 300, 500);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new BaseBall();
		
	}
}
