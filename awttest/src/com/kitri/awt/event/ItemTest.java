package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.*;

/* 1. �����ӻ��
 * 2. �����
 * �� ������Ʈ 6�� �׸��� ���̾ƿ� 2,3 ���� ���̵��ڽ� �Ʒ��� üũ�ڽ� v
 * �� ������Ʈ 2�� �÷ο� 0,2 �´� ���̽� ��� ��ư v
 * �������̾ƿ� �� �� ��
 * 3.��ġ�� ������
 * 4.��ɼ���
 * 1)üũ�ڽ��׷��� �ٲٸ� �ؿ� ���̽��� �ٲ�(�ݴ뵵 ����)
 * 2) 1)�� ���� ta�� 
 * -- ���� --	//	<-- �ٲ�
 * 1. ��� : //	üũ�� ���� "�Ծ���" , "�ȸԾ���"�� ���
 * 2. �ٳ��� :
 * 3. ���� :
 * 3)���ᴩ���� â ����
 * 5.E.S. 5��
 * ��ư ����׼� - �׼Ǹ�����
 * üũ�ڽ�6�� ��������� - �׼Ǹ�����
 * ���̽� ��������� - �����۸�����
 * 
 * 
 * �г� 2��
 * 
 */

public class ItemTest extends Frame implements ItemListener, ActionListener {

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
		
		exit.addActionListener(this);

		mor.addItemListener(this);
		aft.addItemListener(this);
		eve.addItemListener(this);
		app.addItemListener(this);
		bana.addItemListener(this);
		straw.addItemListener(this);
		ch.addItemListener(this);
	}

	public static void main(String[] args) {

		new ItemTest();

	}
//	�츮�� ȣ���� �� ���� �޼ҵ�
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object ob = e.getSource();
			if(ob == ch) {
				String str = ch.getSelectedItem();
				if(str.equals("��ħ")) {
					mor.setState(true);
				}else if(str.equals("����")) {
					aft.setState(true);					
				}else {
					eve.setState(true);
				}
		}
		Checkbox sel = cg.getSelectedCheckbox();
		String selStr = sel.getLabel();
//		System.out.println(selStr);
		ta.setText("--- " + selStr + " ---\n");
//		ta.append("1. ��� : " + (app.getState()==true? "�Ծ���" : "�ȸԾ���")+ "\n");
//		ta.append("2. �ٳ��� : " + (bana.getState() == true ? "�Ծ���" : "�ȸԾ���")+ "\n");
//		ta.append("3. ���� : " + (straw.getState() == true ? "�Ծ���" : "�ȸԾ���")+ "\n");
//		3�￬���� �ڵ� 3���� ��� ���� ����� �ϴ� �ڵ��̱� ������ ���� ���� ���� �׷��� ������
//		getState�� ��ȯ���� boolean�̰� �� ���� �޾Ƽ� String�� ��ȯ�ϴ� �޼ҵ带 ����
		ta.append("1. ��� : " + eat(app.getState())+ "\n");
		ta.append("2. �ٳ��� : " + eat(bana.getState())+ "\n");
		ta.append("3. ���� : " + eat(straw.getState())+ "\n");
		ch.select(selStr);
	}
		private String eat(boolean flag) {
			return flag ? "�Ծ���" : "�ȸԾ���.";
		}
	
}
