package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.*;

import com.sun.glass.events.WindowEvent;
import com.sun.javafx.stage.WindowCloseRequestHandler;

public class FontColorChooser extends Frame {
	// ����
	Panel pW = new Panel();
	Panel pE = new Panel();

//		pW
	Panel pWC = new Panel();
	Panel pWN = new Panel();
	Panel pWS = new Panel();

	Panel pWCW = new Panel();
	Panel pWCC = new Panel();

	Panel pES = new Panel();
	Panel pESC = new Panel();
	Panel pESE = new Panel();

//		pW
	Label lR = new Label("����");
	Label lG = new Label("�ʷ�");
	Label lB = new Label("�Ķ�");
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);

//		pEC
	Panel colorP = new Panel();

//		pES
	Label colorL = new Label();
	Button ok = new Button("Ȯ��");

	public FontColorChooser() {

//			pW

		lR.setBackground(Color.red);
		pWCW.add(lR);
		pWCC.add(sbR);
		lG.setBackground(Color.green);
		pWCW.add(lG);
		pWCC.add(sbG);
		lB.setBackground(Color.blue);
		pWCW.add(lB);
		pWCC.add(sbB);

//			�ʱⱸ���Ҵ�
		setLayout(new GridLayout(1, 2, 0, 0));
		add(pW);
		add(pE);

		pW.setLayout(new BorderLayout(0, 150));
		pW.add(pWN, "North");
		pW.add(pWC, "Center");
		pW.add(pWS, "South");

		pWC.setLayout(new BorderLayout());
		pWC.add(pWCW, "West");
		pWC.add(pWCC, "Center");

		pWCW.setLayout(new GridLayout(3, 1, 0, 50));
		pWCC.setLayout(new GridLayout(3, 1, 0, 50));

		pE.setLayout(new BorderLayout(0, 10));
		pE.add(colorP);
		pE.add(pES, "South");

		pES.add(colorL, "Center");
		pES.add(ok, "East");

		
		

//			ȭ�鱸��
		setBounds(300, 200, 500, 500);


//		changeColor();

		
		
//		windowlisner�� ��ӹ޾ƾ������� �̹� ��ӹ����� �ֱ⿡ ���߻���� �ȵ�.
//		�׸��� ���ø������� �ϱ⿡�� ������ �����ʰ� ���� �������̵��ؾ��ϴ� �߻�޼ҵ尡 ����.
//		��� �ڱ��ڽ��� �߻�Ŭ������ ������ �ƴ��͸� �����ϹǷν� �޼ҵ� �Ѱ��� 
//		�������̵��Ͽ� �����ϰ� ���.
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {
				setVisible(false);
				super.windowClosing(e);
			}
			
		
		});
	}

	

}
