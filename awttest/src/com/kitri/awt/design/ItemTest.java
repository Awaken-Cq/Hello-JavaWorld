package com.kitri.awt.design;

import java.awt.*;

/* 1. �����ӻ��
 * 2. �����
 * �� ������Ʈ 6�� �׸��� ���̾ƿ� 2,3 ���� ���̵��ڽ� �Ʒ��� üũ�ڽ� v
 * �� ������Ʈ 2�� �÷ο� 0,2 �´� ���̽� ��� ��ư v
 * �������̾ƿ� �� �� ��
 * 3.��ġ�� ������
 * 
 * 
 * �г� 2��
 * 
 */


public class ItemTest extends Frame {

	Panel pN = new Panel();
	Panel pS = new Panel();
	CheckboxGroup time = new CheckboxGroup();
	Checkbox mor = new Checkbox("��ħ", time, false);
	Checkbox aft = new Checkbox("����", time, false);
	Checkbox eve = new Checkbox("����", time, false);
	
	Checkbox app = new Checkbox("���");
	Checkbox bana = new Checkbox("�ٳ���");
	Checkbox straw = new Checkbox("����");
	
	TextArea ta = new TextArea();
			
	Choice ch = new Choice();
	
	Button exit = new Button("����");
	
	
	
	
	
	
	
	
	
	
	public ItemTest(){
		
		pN.setLayout(new GridLayout(2,3,10,0));
		pN.add(mor);
		pN.add(aft);
		pN.add(eve);
		
		pN.add(app);
		pN.add(bana);
		pN.add(straw);
		
		
		
		
		pS.setLayout(new BorderLayout());
		pS.add(ch,"Center");
		ch.setSize(100,20);
		ch.add("��ħ");
		
		ch.add("����");
		ch.add("����");
		pS.add(exit,"East");
		
		
		add(pN,"North");
		add(ta,"Center");
		add(pS,"South");
		
		
		setBounds(300,200,300,500);
		setVisible(true);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		new ItemTest();
		
		
	}
}
