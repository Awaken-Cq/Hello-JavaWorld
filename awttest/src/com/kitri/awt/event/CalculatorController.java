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

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController implements ActionListener {

	
	Calculator calculator;
	CalculatorService calculatorService;
	
	String numStr = "";
	String opStr = "";
//	TextArea ta;

	public CalculatorController(Calculator calculator) {
		super();
		this.calculator = calculator;
		calculatorService = new CalculatorService(this);
		}



	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == calculator.exit) {
			calculatorService.exit();
		
		}else if (ob == calculator.btn[0]) {
			calculator.numL.setText(" ");
			numStr += calculator.btn[0].getLabel();
			calculator.numL.setText(numStr);
		}else if (ob == calculator.btn[1]) {
			calculator.numL.setText(" ");
			numStr += calculator.btn[1].getLabel();
			calculator.numL.setText(numStr);
		}else if (ob == calculator.btn[2]) {
			calculator.numL.setText(" ");
			numStr += calculator.btn[2].getLabel();
			calculator.numL.setText(numStr);
//		+
		}else if (ob == calculator.btn[3]) {
			opStr = calculator.btn[3].getLabel();
			calculatorService.plus();
		
		}else if (ob == calculator.btn[4]) {
			calculator.numL.setText(" ");
			numStr += calculator.btn[4].getLabel();
			calculator.numL.setText(numStr);
		}else if (ob == calculator.btn[5]) {
			calculator.numL.setText(" ");
			numStr += calculator.btn[5].getLabel();
			calculator.numL.setText(numStr);
		}else if (ob == calculator.btn[6]) {
			calculator.numL.setText(" ");
			numStr += calculator.btn[6].getLabel();
			calculator.numL.setText(numStr);
//		-
		}else if (ob == calculator.btn[7]) {
			opStr = calculator.btn[7].getLabel();
			calculatorService.minus();
			
		}else if (ob == calculator.btn[8]) {
			calculator.numL.setText(" ");
			numStr += calculator.btn[8].getLabel();
			calculator.numL.setText(numStr);
		}else if (ob == calculator.btn[9]) {
			calculator.numL.setText(" ");
			numStr += calculator.btn[9].getLabel();
			calculator.numL.setText(numStr);
		}else if (ob == calculator.btn[10]) {
			calculator.numL.setText(" ");
			numStr += calculator.btn[10].getLabel();
			calculator.numL.setText(numStr);
//		*
		}else if (ob == calculator.btn[11]) {
			opStr = calculator.btn[11].getLabel();
			calculatorService.multi();
		
		}else if (ob == calculator.btn[12]) {
			calculator.numL.setText(" ");
			numStr += calculator.btn[12].getLabel();
			calculator.numL.setText(numStr);
//		C
		}else if (ob == calculator.btn[13]) {
			calculatorService.reset();
			
//		=	
		}else if (ob == calculator.btn[14]) {
			calculatorService.calc();
			calculator.numL.setText(numStr);
//		/
		}else if (ob == calculator.btn[15]) {
			opStr = calculator.btn[15].getLabel();
			calculatorService.div();
		}

	
	
		
	
			
			
			
		
//		ta.append(numStr);
//		numStr = ta.getText();
	}

}
