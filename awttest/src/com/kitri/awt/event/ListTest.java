package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* �����ӻ��
 * ����Ʈ : listL
 * ���� : 4Button
 * �̽�Ʈ: listR
 * ��콺 : 2Button
 * 
 * �г� 3��
 * 
 * E.S.6
 * 4button �׼�
 * 
 */


public class ListTest extends Frame implements ActionListener{

	
	
	
//	pL
	Panel pL = new Panel();
	List listL = new List(0,true);
	TextField tfL = new TextField();
//	��ư�κ� PC
	Panel pC = new Panel();
	Button btR = new Button("��");
	Button btRAll = new Button("��");
	Button btL = new Button("��");
	Button btLAll = new Button("��");
	
//	pR
	List listR = new List(0,true);
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
		
		tfL.addActionListener(this);
		tfR.addActionListener(this);
		btL.addActionListener(this);
		btLAll.addActionListener(this);
		btR.addActionListener(this);
		btRAll.addActionListener(this);
	}
	
	
	public static void main(String[] args) {
		
		new ListTest();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == tfL) {
//			1. tfL�� �� get(+��ȿ�� �˻�)
//			�������� trim
			String tmp = tfL.getText().trim();
//			�̹� tfL�� �޾ƿԱ� ������ setText�� �����ع�����
			tfL.setText("");
			if(tmp.isEmpty())
//			�����ڰ� ȣ���� �����ϱ� �ٽ� ���������� �����ϰ���
				return;
//			2. listL�� �߰�
			listL.add(tmp);
//			�ؽ�Ʈ �߰��� ��ĭ���� �ʱ�ȭ(�׷��� delete,remove,reset ���� �޼ҵ�¾���)
			
		}else if(ob == tfR) {
//			1.tfR�ǰ��� ����.(��ȿ���˻�)
			String tmp = tfR.getText().trim();
//			3.tfR �ʱ�ȭ.
			tfR.setText("");
			if(tmp.isEmpty())
				return;
//			2.listR�� �߰�
			listR.add(tmp);

		}else if(ob == btL) {
//			1.listR ������ ������ ����.(��ȿ���˻��ؾ���)
			String tmp[] = listR.getSelectedItems();
//			if(tmp == null)
//				return;
//			2.listL�� �߰�.
			int len = tmp.length;
			for (int i = 0; i < len; i++) {
				listL.add(tmp[i]);
//			3.listR �� ����.
				listR.remove(tmp[i]);
					}
			
		}else if(ob == btLAll) {
//			1.listR�� ���� ��� ����.
			String tmp[] = listR.getItems();
//			2.listL�� ��� �߰���.
			int len = tmp.length;
				for (int i = 0; i < len; i++) {
					listL.add(tmp[i]);
				}
//			3.listR�� ���� ��� ����.
			listR.removeAll();
			
		}else if(ob == btR) {
//			1. listL���� ������ ���ڿ� get.
			String tmp[] = listL.getSelectedItems();
//			if(tmp == null)
//				return;
//			2. 1�� ���� listR�� �߰�.
			int len = tmp.length;
			for (int i = 0; i < len; i++) {
				listR.add(tmp[i]);
//			3. 1�� ���� listL���� ����.
				listL.remove(tmp[i]);
			}
			
		}else if(ob == btRAll) {
//			1. listL�� ���� ��� get. => �迭
			String tmp[] = listL.getItems();
//			2.1���� listR�� ��� �߰�.
			int len = tmp.length;
			for (int i = 0; i < len; i++) {
				listR.add(tmp[i]);
			}
			
//			3.1���� listL���� ��� ����.
//			len = tmp.length;
//			for (int i = len-1; i >= 0; i--) {
//				listL.remove(i);
//			}
			listL.removeAll();

		}
	
		
	}
}
