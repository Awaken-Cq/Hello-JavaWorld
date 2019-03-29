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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class CalculatorController implements ActionListener {

	
	Calculator calculator;
	CalculatorService calculatorService;
	
	String obStr = "";
	String numStr = "";
	String opStr = "";
//	String total1 = "";
	String total = "";
	
	public CalculatorController(Calculator calculator) {
		super();
		this.calculator = calculator;
		calculatorService = new CalculatorService(this);
		}



	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		Button b = (Button)ob;
		obStr = b.getLabel();
		System.out.println(obStr);
		
		
		
		System.out.println(numStr);
		
		if(calculatorService.isNumber(obStr) == true) {
			do {
				numStr += obStr;
				
				calculator.numL.setText(numStr);
			}
			while (calculatorService.isNumber(obStr) == false);
		
		}else if(obStr == "=") {
			calculatorService.calC();
		
		}else{
			total = numStr;
			numStr = "";
			opStr = obStr;
			calculator.operL.setText(opStr);
		}
			
			
			
		
		
//	if(calculatorService.isNumber(obStr) == true) {
//			
//	}else{
//			opStr = obStr;
//	}
//	System.out.println(calculatorService.isNumber(obStr));
//		
	}
}
