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
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);

//	pEC
	Panel colorP = new Panel();

//	pES
	Label colorL = new Label();
	Button ok = new Button("Ȯ��");

	
	
	public ColorSelector() {

//		pW
		
		lR.setBackground(Color.red);
		pWCW.add(lR);
		pWCC.add(sbR);
		lG.setBackground(Color.green);
		pWCW.add(lG);
		pWCC.add(sbG);
		lB.setBackground(Color.blue);
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
		
		
		
//		ȭ�鱸��
		setBounds(300, 200, 300, 500);
		setVisible(true);
		
//		Ⱦ�� ȭ�� ä���(��ũ�ѹ� ����ġ�� ���� ���� ��������)
		int r = sbR.getValue();
		int g = sbG.getValue();
		int b = sbB.getValue();
		colorP.setBackground(new Color(r, g, b));
		colorL.setText("r = " + r + " g = " + g+ " b = " + b);
		
		
		
	}

	public static void main(String[] args) {
		new ColorSelector();

	}
}
