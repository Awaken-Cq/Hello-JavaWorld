package com.kitri.awt.design;

import java.awt.*;

/* �����θ� �ϴ� ����
 * 1.Frame ���.
 * 2.����ο� �ʿ��� ��ü ����.
 * 3.��ġ�ο��� design(component ��ġ.)
 * **�۾��� �� >> ��(�гο��� 3���� �� ���� ���� �װ��� ������ ���δ�.,�г��� ���� �� ������ ������ ���δ�.)
 * 
 */

public class DesignTest extends Frame {

//	�����
//	panel()
//	panel(LayoutManager layout)
	Panel pN = new Panel();
	Panel pS = new Panel();
	
//	Label()
//	Label(String text)
//	Label(String text, in alignments)	
	Label l = new Label("�Է�", Label.CENTER);
	
//	TextField()
//	TextField(int col�۾�������)
//	TextField(String text)
	TextField tf = new TextField();
	
	Button send = new Button("����");
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
			
	Button exit = new Button("����");
	
	
	public DesignTest() {
		super("Design Test !!!");
//		��ġ��
		
		l.setText("�Է�")	;
//		LayoutManager lm = new BorderLayout(int hgap, vgap)
//		������Ʈ�� ������Ʈ������ ���ϻ� �糡 ������ ���� �ƴϴ�
		pN.setLayout(new BorderLayout(10,0));
//		���󸸵�� ��� 2���� 'Color.����' or 'new Color(r,g,b)'
//		�����󺯰�
		l.setBackground(new Color(210,150,150));
//		��Ʈ���󺯰�
//		l.setForeground(new Color(200,100,200));
		l.setForeground(Color.PINK);
		Font f = new Font("����", Font.BOLD, 20);
		l.setFont(f);
		pN.add(l, "West");
		pN.add(tf, "Center");
		send.setFont(f);
		pN.add(send, "East");
		
		
		
//		pS.setLayout(new GridLayout(row, col, �¿�, ����));
		pS.setLayout(new GridLayout(1, 2, 10, 0));
		ch.add("����");
		ch.add("���, ��õ");
		ch.add("����");
		ch.add("����");
		ch.add("����");
		pS.add(ch);
		exit.setFont(f);
		pS.add(exit);
		
//		frame�� ����Ʈ�� BorderLayout�̱� ������ ���� �������� �ʰ� �ٷ� �Է�
//		2�������
		//������ �ֱ����ؼ� ����.
		setLayout(new BorderLayout(0,10));
		add(pN,"North");
		add(ta,"Center");
		add(pS,BorderLayout.SOUTH);
		
		
		
//		1)����� �����ϰ� 2)��ġ�� �����ϰ� 3)ȭ�鿡 ���̴� ������ ����.
		setSize(300, 400);
		setLocation(300, 200);
//		set Size�� setLocation�� ���ĳ����� setBounds(x,y,width,height)
		setBounds(300, 200, 300, 500);
//		����� �ٲܼ� �����Ҷ�
		setResizable(false);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
//		dt�� �����ڸ� ȣ�⿡�� dt.~~�� �� ���� ���⶧���� �͸����� ������ ȣ���ص���.
//		DesignTest dt = new DesignTest();
		new DesignTest();
	}

}
