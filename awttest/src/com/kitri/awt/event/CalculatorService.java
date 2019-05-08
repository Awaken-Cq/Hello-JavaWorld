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
	String num1;
	String num2;

	Calculator cc;
	boolean opFlag = false;
	boolean eqFlag = false;
	boolean cFlag = false;
	double total;

	public CalculatorService(CalculatorController calculatorController) {
		super();
		this.calculatorController = calculatorController;
		cc = calculatorController.calculator;

	}

	public void branch() {
		
		switch (calculatorController.obStr) {

		case "C":
			reset();
			break;

		case "Exit":
			exit();
			break;

		case "=":
			eqFlag = true;
			flow();
			calculatorController.opStr = "";
			cc.operL.setText("");
			break;

		default:
			if(calculatorController.numStr == "") {
				calculatorController.opStr = calculatorController.obStr;
				cc.operL.setText(calculatorController.opStr);
				return;
			}
			flow();
			
			break;

		}
	}

	public void flow() {
		
		opC();
		
		if (opFlag == true) {
			
			calC();
			result();
		}

		calculatorController.opStr = calculatorController.obStr;
		calculatorController.numStr = "";

	}

	public void opC() {

		if (calculatorController.opStr == "") {
			
			cc.operL.setText(calculatorController.obStr);
			if(eqFlag == true) {
				opFlag = true;
				num2 = calculatorController.numStr;
			}else {
				opFlag = false;
				num1 = calculatorController.numStr;
			}
		} else {
			
			opFlag = true;
			cc.operL.setText(calculatorController.obStr);
			num2 = calculatorController.numStr;
		}
	}

	public void calC() {

		switch (calculatorController.opStr) {

		case "+":
			total = Double.parseDouble(num1) + Double.parseDouble(num2);
			break;

		case "-":
			total = Double.parseDouble(num1) - Double.parseDouble(num2);
			break;

		case "*":
			total = Double.parseDouble(num1) * Double.parseDouble(num2);
			break;

		case "/":
			total = Double.parseDouble(num1) / Double.parseDouble(num2);
			break;
		}

	}

	/*
	 * switch(calculatorController.opStr) { case "+" : if(opFlag == true) { // num1
	 * = calculatorController.numStr;
	 * 
	 * calculatorController.numStr = "";
	 * cc.operL.setText(calculatorController.obStr); }else {
	 * cc.operL.setText(calculatorController.obStr); num =
	 * Double.parseDouble(calculatorController.toStr) +
	 * Double.parseDouble(calculatorController.numStr); result();
	 * calculatorController.opStr = calculatorController.obStr;
	 * 
	 * }break; case "-" : if(opFlag == true) {
	 * cc.operL.setText(calculatorController.obStr); calculatorController.toStr =
	 * calculatorController.numStr; calculatorController.numStr = ""; }else {
	 * cc.operL.setText(calculatorController.obStr); num =
	 * Double.parseDouble(calculatorController.toStr) -
	 * Double.parseDouble(calculatorController.numStr); result();
	 * calculatorController.opStr = calculatorController.obStr; }break;
	 * 
	 * case "*" : if(opFlag == true) { cc.operL.setText(calculatorController.obStr);
	 * calculatorController.toStr = calculatorController.numStr;
	 * calculatorController.numStr = ""; }else {
	 * cc.operL.setText(calculatorController.obStr); num =
	 * Double.parseDouble(calculatorController.toStr)
	 * Double.parseDouble(calculatorController.numStr); result();
	 * calculatorController.opStr = calculatorController.obStr; }break; case "/" :
	 * if(opFlag == true) { cc.operL.setText(calculatorController.opStr);
	 * calculatorController.toStr = calculatorController.numStr;
	 * calculatorController.numStr = ""; }else {
	 * cc.operL.setText(calculatorController.opStr); num =
	 * Double.parseDouble(calculatorController.toStr) /
	 * Double.parseDouble(calculatorController.numStr); result();
	 * calculatorController.opStr = calculatorController.obStr; }break; }
	 */

	/*
	 * public void calC() { opC(); switch(calculatorController.opStr) { case "+" :
	 * if(opFlag == true) { // if(calculatorController.numStr != "")
	 * calculatorController.toStr = calculatorController.numStr;
	 * calculatorController.numStr = "";
	 * cc.operL.setText(calculatorController.obStr); }else {
	 * cc.operL.setText(calculatorController.obStr); num =
	 * Double.parseDouble(calculatorController.toStr) +
	 * Double.parseDouble(calculatorController.numStr); result();
	 * calculatorController.opStr = calculatorController.obStr;
	 * 
	 * }break; case "-" : if(opFlag == true) {
	 * cc.operL.setText(calculatorController.obStr); calculatorController.toStr =
	 * calculatorController.numStr; calculatorController.numStr = ""; }else {
	 * cc.operL.setText(calculatorController.obStr); num =
	 * Double.parseDouble(calculatorController.toStr) -
	 * Double.parseDouble(calculatorController.numStr); result();
	 * calculatorController.opStr = calculatorController.obStr; }break;
	 * 
	 * case "*" : if(opFlag == true) { cc.operL.setText(calculatorController.obStr);
	 * calculatorController.toStr = calculatorController.numStr;
	 * calculatorController.numStr = ""; }else {
	 * cc.operL.setText(calculatorController.obStr); num =
	 * Double.parseDouble(calculatorController.toStr)
	 * Double.parseDouble(calculatorController.numStr); result();
	 * calculatorController.opStr = calculatorController.obStr; }break; case "/" :
	 * if(opFlag == true) { cc.operL.setText(calculatorController.opStr);
	 * calculatorController.toStr = calculatorController.numStr;
	 * calculatorController.numStr = ""; }else {
	 * cc.operL.setText(calculatorController.opStr); num =
	 * Double.parseDouble(calculatorController.toStr) /
	 * Double.parseDouble(calculatorController.numStr); result();
	 * calculatorController.opStr = calculatorController.obStr; }break; }
	 * 
	 * }
	 * 
	 */

	public void result() {
		calculatorController.numStr = String.valueOf(total);
		num1 = calculatorController.numStr;
		cc.numL.setText(calculatorController.numStr);
		
	}

	public void reset() {

		calculatorController.numStr = "";
		calculatorController.opStr = "";
		calculatorController.obStr = "";
		num1 = "";
		num2 = "";
		total = 0.0;
		cc.numL.setText(" ");
		cc.operL.setText(" ");
		opFlag = false;
		eqFlag = false;
		cFlag = false;

	}

	public void exit() {
		System.exit(0);

	}

	boolean isNumber(String obStr) {
		boolean flag = true;
		int num = obStr.charAt(0) - 48;
		if (num < 0 || num > 9) {
			flag = false;
		}
		return flag;
	}

}
