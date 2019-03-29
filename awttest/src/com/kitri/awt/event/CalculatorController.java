/* E.S는 17개.
 * 배열을 이용하면
 * 
 * 
 * 
 * 
 * 
 * 
 */



package com.kitri.awt.event;

import java.awt.Button;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController implements ActionListener {

	
	Calculator calculator;
	CalculatorService calculatorService;
	
	String numStr = "";
	String opStr = "";
//	TextArea ta;
	int i = 0;
	public CalculatorController(Calculator calculator) {
		super();
		this.calculator = calculator;
		calculatorService = new CalculatorService(this);
		}



	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		System.out.println(ob);

		if(ob == calculator.exit) {
			calculatorService.exit();
		
		}else if (ob == calculator.btn[0]) {
			
	}

}
