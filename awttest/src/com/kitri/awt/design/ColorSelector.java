/* 1. Frame 상속
 * 2. 선언부
 * pW grid 3label, 3scroll
 * pE Panel, label, button
 * 
 * 양옆으로 나눠서
 * 오른쪽껄 위아래로 나눠서
 * 아래것을 양옆으로 나눔
 * 
 * 
 * 6개 이상
 * 전체프레임은 그리드로
 */

package com.kitri.awt.design;

import java.awt.*;

public class ColorSelector extends Frame {
//선언
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
	Label lR = new Label("빨강");
	Label lG = new Label("초록");
	Label lB = new Label("파랑");
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);

//	pEC
	Panel colorP = new Panel();

//	pES
	Label colorL = new Label();
	Button ok = new Button("확인");

	
	
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




		

//		초기구역할당
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
		
		
		
//		화면구현
		setBounds(300, 200, 300, 500);
		setVisible(true);
		
//		횡한 화면 채우기(스크롤바 기준치와 같은 값을 보여주자)
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
