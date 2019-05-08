package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.*;

import com.sun.glass.events.WindowEvent;
import com.sun.javafx.stage.WindowCloseRequestHandler;

public class FontColorChooser extends Frame {
	// 선언
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
	Label lR = new Label("빨강");
	Label lG = new Label("초록");
	Label lB = new Label("파랑");
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);

//		pEC
	Panel colorP = new Panel();

//		pES
	Label colorL = new Label();
	Button ok = new Button("확인");

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

//			초기구역할당
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

		
		

//			화면구현
		setBounds(300, 200, 500, 500);


//		changeColor();

		
		
//		windowlisner를 상속받아야하지만 이미 상속받은게 있기에 다중상속이 안됨.
//		그리고 임플리먼츠를 하기에는 윈도우 리스너가 가진 오버라이딩해야하는 추상메소드가 많음.
//		고로 자기자신의 추상클래스인 윈도우 아답터를 생성하므로써 메소드 한개만 
//		오버라이딩하여 간단하게 사용.
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {
				setVisible(false);
				super.windowClosing(e);
			}
			
		
		});
	}

	

}
