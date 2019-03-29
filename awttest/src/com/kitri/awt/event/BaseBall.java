/*1.Frame 상속
 *2.선언부
 *볼더레이아웃
 * Center ta
 * pE grid 4Button
 * pS grid Label, tF, Button
 * 
 * 
 * 패널 2개
 * E.S. 총6개  5button 1tf
 */
package com.kitri.awt.event;

import java.awt.*;

public class BaseBall extends Frame {

	Panel pC = new Panel();
	Panel pCS = new Panel();
	Panel pE = new Panel();

	// pC
	TextArea ta = new TextArea();

	// pR
	Button newG = new Button("새 게임");
	Button clear = new Button("지우기");
	Button dap = new Button("정답");
	Button fontC = new Button("글자색");
	Button exit = new Button("종료");

	// pCS
	Label l = new Label("숫자");
	TextField tf = new TextField();

	BaseBallController baseBallController;

	FontColorChooser fontColorChooser = new FontColorChooser();

	public BaseBall() {

		// pCS
		pCS.setLayout(new BorderLayout(10, 0));
		pCS.add(l, "West");
		pCS.add(tf, "Center");
//		tf.setEnabled(false);

		// pE
		pE.setLayout(new GridLayout(5, 0, 10, 10));

		pE.add(newG);
		pE.add(clear);
		pE.add(dap);
		pE.add(fontC);
		pE.add(exit);

		// pC
		pC.setLayout(new BorderLayout(0, 10));
		ta.setBackground(Color.GREEN);
		ta.setEditable(false);
		pC.add(ta, "Center");
		pC.add(pCS, "South");

		// 구역할당
		add(pC, "Center");
		add(pE, "East");

		// 화면구현
		setBounds(300, 200, 500, 500);
		setVisible(true);

		baseBallController = new BaseBallController(this);

//		BaseBall 창 이벤트 등록
		newG.addActionListener(baseBallController);
		clear.addActionListener(baseBallController);
		dap.addActionListener(baseBallController);
		fontC.addActionListener(baseBallController);
		exit.addActionListener(baseBallController);
		tf.addActionListener(baseBallController);

//		FontColorChooser창 이벤트 등록
		fontColorChooser.sbR.addAdjustmentListener(baseBallController);
		fontColorChooser.sbG.addAdjustmentListener(baseBallController);
		fontColorChooser.sbB.addAdjustmentListener(baseBallController);
		
		fontColorChooser.ok.addActionListener(baseBallController);
		
		
		
	}

	public static void main(String[] args) {
		new BaseBall();

	}
}
