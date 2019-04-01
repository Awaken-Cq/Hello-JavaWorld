/* E.S�� 17��.
 * �迭�� �̿��ϸ�
 * 
 * 
 * 
 * 
 * 
 * 
 */

package com.kitri.awt.event;

import java.awt.Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController implements ActionListener {

	Calculator calculator;
	CalculatorService calculatorService;

	String obStr = "";
	String numStr = "";
	String opStr = "";


	public CalculatorController(Calculator calculator) {
		super();
		this.calculator = calculator;
		calculatorService = new CalculatorService(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		Button b = (Button) ob;
		obStr = b.getLabel();
		System.out.println(ob);

		if (calculatorService.isNumber(obStr) == true) {

			numStr += obStr;
			calculator.numL.setText(numStr);
			


		} else if (calculatorService.isNumber(obStr) == false) {
			calculatorService.branch();
			

		}
	}
}
