/*1.Frame ���
 *2.�����
 *�������̾ƿ�
 * Center ta
 * pE grid 4Button
 * pS grid Label, tF, Button
 * 
 * 
 * �г� 2��
 * E.S. ��6��  5button 1tf
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
	Button newG = new Button("�� ����");
	Button clear = new Button("�����");
	Button dap = new Button("����");
	Button fontC = new Button("���ڻ�");
	Button exit = new Button("����");

	// pCS
	Label l = new Label("����");
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

		// �����Ҵ�
		add(pC, "Center");
		add(pE, "East");

		// ȭ�鱸��
		setBounds(300, 200, 500, 500);
		setVisible(true);

		baseBallController = new BaseBallController(this);

//		BaseBall â �̺�Ʈ ���
		newG.addActionListener(baseBallController);
		clear.addActionListener(baseBallController);
		dap.addActionListener(baseBallController);
		fontC.addActionListener(baseBallController);
		exit.addActionListener(baseBallController);
		tf.addActionListener(baseBallController);
		this.addWindowListener(baseBallController);
		
//		FontColorChooserâ �̺�Ʈ ���
		fontColorChooser.sbR.addAdjustmentListener(baseBallController);
		fontColorChooser.sbG.addAdjustmentListener(baseBallController);
		fontColorChooser.sbB.addAdjustmentListener(baseBallController);
		fontColorChooser.ok.addActionListener(baseBallController);
		
//		��ƮĮ�������� x��ư �������� ���ᰡ �ƴ϶� ����⸦ �ؾ��Ѵ�.
//		�׷��� ���⼭ �����츮���ʸ� �߰��ϸ� ���α׷���ü�� ����ȴ�.
//		fontColorChooser.addWindowListener(baseBallController);
//		���⼭ �� �ҽ��� �����ϸ� �ȵǰ� ������ â���� ������ �ؾ��Ѵ�. -> fontColorChooser
	}

	public static void main(String[] args) {
		new BaseBall();

	}
}
