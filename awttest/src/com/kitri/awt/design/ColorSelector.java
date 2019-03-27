/* 1. Frame ���
 * 2. �����
 * pW grid 3label, 3scroll
 * pE Panel, label, button
 * 
 * �翷���� ������
 * �����ʲ� ���Ʒ��� ������
 * �Ʒ����� �翷���� ����
 * 
 * 
 * 6�� �̻�
 * ��ü�������� �׸����
 */

package com.kitri.awt.design;

import java.awt.*;

public class ColorSelector extends Frame {
//����
	Panel pW = new Panel();
	Panel pE = new Panel();
	
//	pW
	Panel pWC = new Panel();
	Panel pWN = new Panel();
	Panel pWS = new Panel();
	
	Panel pWCW = new Panel();
	Panel pWCC = new Panel();

	Panel pES = new Panel();
	Panel pESC = new Panel();
	Panel pESE = new Panel();

//	pW
	Label lR = new Label("����");
	Label lG = new Label("�ʷ�");
	Label lB = new Label("�Ķ�");
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 255/2, 10, 0, 255);
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 255/2, 10, 0, 255);
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 255/2, 10, 0, 255);

//	pEC
	Panel colorP = new Panel();

//	pES
	Label colorL = new Label("���̸�");
	Button ok = new Button("Ȯ��");

	
	
	public ColorSelector() {

//		pW
		

		pWCW.add(lR);
		pWCC.add(sbR);
		pWCW.add(lG);
		pWCC.add(sbG);
		pWCW.add(lB);
		pWCC.add(sbB);




		

//		�ʱⱸ���Ҵ�
		setLayout(new GridLayout(1, 2, 0, 0));
		add(pW);
		add(pE);
		
		pW.setLayout(new BorderLayout(0,150));
		pW.add(pWN,"North");
		pW.add(pWC,"Center");
		pW.add(pWS,"South");
		
		pWC.setLayout(new BorderLayout());
		pWC.add(pWCW,"West");
		pWC.add(pWCC,"Center");
		
		
		pWCW.setLayout(new GridLayout(3, 1, 0, 50));
		pWCC.setLayout(new GridLayout(3, 1, 0, 50));
		
		
		pE.setLayout(new BorderLayout(0, 10));
		pE.add(colorP);
		pE.add(pES, "South");
		
		pES.add(colorL, "Center");
		pES.add(ok, "East");
		
		colorP.setBackground(Color.pink);
		
//		ȭ�鱸��
		setBounds(300, 200, 300, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ColorSelector();

	}
}
