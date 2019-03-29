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
	int  cal = 0;
	int num = 0;
	
//	public void tran() {
//		num = Integer.parseInt(calculatorController.numStr);
//		
//	}

//	cc.numL.setText(" ");
	
	
	public void plus() {
		cc.operL.setText(calculatorController.opStr);
		num = Integer.parseInt(calculatorController.numStr);
		calculatorController.numStr = "";
		
		cal = 1;
	}

	
	public void minus() {
		cc.operL.setText(calculatorController.opStr);
		num = Integer.parseInt(calculatorController.numStr);
		calculatorController.numStr = "";
	
		cal = 2;
	}

	public void multi() {
		cc.operL.setText(calculatorController.opStr);
		num = Integer.parseInt(calculatorController.numStr);
		calculatorController.numStr = "";
	
		cal = 3;
}

	public void div() {
		cc.operL.setText(calculatorController.opStr);
		num = Integer.parseInt(calculatorController.numStr);
		calculatorController.numStr = "";
	
		cal = 4;
	}
	
	public void calc() {
		
		switch(cal) {
		case 1 : num += Integer.parseInt(calculatorController.numStr);break;
		case 2 : num -= Integer.parseInt(calculatorController.numStr);break;
		case 3 : num *= Integer.parseInt(calculatorController.numStr);break;
		case 4 : num /= Integer.parseInt(calculatorController.numStr);break;
		}
		calculatorController.numStr = String.valueOf(num);

	
		
		
//	public void calc() {
//		num2 = Integer.parseInt(calculatorController.numStr);
//		switch(cal) {
//		case 1 : ;
//		case 2 : calculatorController.numStr = String.valueOf(num1 - num2);
//		case 3 : calculatorController.numStr = String.valueOf(num1 * num2);
//		case 4 : calculatorController.numStr = String.valueOf(num1 / num2);
//		}
		
	}

	public void reset() {
		calculatorController.numStr = "";
		calculatorController.opStr = "";
		cc.numL.setText("");
		cc.operL.setText("");
		num = 0;
		cal = 0;
	}
	
	public void exit() {
		System.exit(0);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
