/*기능메소드
 *1.숫자버튼을 누르면 숫자가 써지게해야함.
 *1-1. 연산버튼을 누르면 연산버튼이 operL에 써져야함.
 *2.연산자버튼을 누르면 누른 연산자 버튼 적용
 *3.숫자입력 하면 기존 숫자가 지워지고 새 숫자 입력
 *4.'='을 누르면 연산결과 출력. 입력되었던 연산자 사라짐?
 *5.거기에 다시 연산자를 누르면 누적되어있던 연산결과에 추가 연산
 *6.'C'버튼을 누르면 기존 저장되어있는 내용 삭제, 두개의 tf에 있는 내용 삭제.
 *7.종료버튼을 누르면 종료v
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
	
	
	
	
	
	
	
	
	

