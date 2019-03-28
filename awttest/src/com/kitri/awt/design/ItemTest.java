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
	CheckboxGroup cg = new CheckboxGroup();
	Checkbox mor = new Checkbox("��ħ", cg, true);
	Checkbox aft = new Checkbox("����", cg, false);
	Checkbox eve = new Checkbox("����", cg, false);

	Checkbox app = new Checkbox("���", true);
	Checkbox bana = new Checkbox("�ٳ���");
	Checkbox straw = new Checkbox("����");

	TextArea ta = new TextArea();

	Choice ch = new Choice();

	Button exit = new Button("����");

	public ItemTest() {

		pN.setLayout(new GridLayout(2, 3, 10, 0));
		mor.setBackground(Color.yellow);
		pN.add(mor);
		aft.setBackground(Color.red);
		pN.add(aft);
		eve.setBackground(Color.PINK);
		pN.add(eve);

		pN.add(app);
		app.setBackground(Color.red);
		pN.add(bana);
		bana.setBackground(Color.yellow);
		pN.add(straw);
		straw.setBackground(Color.red);

		pS.setLayout(new BorderLayout(10, 0));
		ch.add("��ħ");
		ch.add("����");
		ch.add("����");
		
		ch.setSize(100, 20);
		pS.add(ch, "Center");
		exit.setBackground(Color.CYAN);
		pS.add(exit, "East");

		add(pN, "North");
		add(ta, "Center");
		add(pS, "South");

		setBounds(300, 200, 300, 500);
		setVisible(true);

	}

	public static void main(String[] args) {

		new ItemTest();

	}
}
