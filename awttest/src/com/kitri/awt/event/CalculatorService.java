/*��ɸ޼ҵ�
 *1.���ڹ�ư�� ������ ���ڰ� �������ؾ���.
 *1-1. �����ư�� ������ �����ư�� operL�� ��������.
 *2.�����ڹ�ư�� ������ ���� ������ ��ư ����
 *3.�����Է� �ϸ� ���� ���ڰ� �������� �� ���� �Է�
 *4.'='�� ������ ������ ���. �ԷµǾ��� ������ �����?
 *5.�ű⿡ �ٽ� �����ڸ� ������ �����Ǿ��ִ� �������� �߰� ����
 *6.'C'��ư�� ������ ���� ����Ǿ��ִ� ���� ����, �ΰ��� tf�� �ִ� ���� ����.
 *7.�����ư�� ������ ����v
 *
 * 
 * 
 * 
 */


package com.kitri.awt.event;

public class CalculatorService {

	CalculatorController calculatorController;
	
	Calculator cc;
	
	public CalculatorService(CalculatorController calculatorController) {
		super();
		this.calculatorController = calculatorController;
		cc = calculatorController.calculator;
		
	}
	
	

	
	public void calC() {
		
		switch(calculatorController.opStr) {
		case "+" : cc.operL.setText(opStr);	break;
					
		case "-" : calculator.operL.setText(opStr);	break;
		
		case "*" : calculator.operL.setText(opStr);	break;
		
		case "/" : calculator.operL.setText(opStr);	break;
		
		case "=" : 	break;
		
		default : calculatorService.exit();	break;
			
			
		}
//		cc.operL.setText(calculatorController.opStr);
//		switch(calculatorController.i) {
//		case 1 : num += Integer.parseInt(calculatorController.numStr);break;
//		case 2 : num -= Integer.parseInt(calculatorController.numStr);break;
//		case 3 : num *= Integer.parseInt(calculatorController.numStr);break;
//		case 4 : num /= Integer.parseInt(calculatorController.numStr);break;
//		}
//		calculatorController.numStr = "";
	
	
	
		
		
	}

	public void result() {
		
		calculatorController.numStr = String.valueOf(num);
	}

	
	public void reset() {
		calculatorController.numStr = "";
		calculatorController.opStr = "";
		cc.numL.setText("");
		cc.operL.setText("");
		num = 0;
//		calculatorController.i = 0;
	}
	
	public void exit() {
		System.exit(0);
		
	}
	
	
	boolean isNumber(String obStr) {
		boolean flag = true;
		int num = obStr.charAt(0)-48;
		if(num < 0 || num > 9 ) {
			flag = false;
		}
		return flag;
	}
	
	
	
}	
	
	
	
	
	
	
	
	
	

