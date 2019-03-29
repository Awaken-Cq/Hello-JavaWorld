package com.kitri.awt.event;

import java.awt.Checkbox;
import java.awt.event.*;

public class ItemLogic implements ItemListener, ActionListener {

	ItemTest itemTest;
	
public ItemLogic(ItemTest itemTest) {
		this.itemTest = itemTest;
	}

	//	우리가 호출할 수 없는 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object ob = e.getSource();
			if(ob == itemTest.ch) {
				String str = itemTest.ch.getSelectedItem();
				if(str.equals("아침")) {
					itemTest.mor.setState(true);
				}else if(str.equals("점심")) {
					itemTest.aft.setState(true);					
				}else {
					itemTest.eve.setState(true);
				}
		}
		Checkbox sel = itemTest.cg.getSelectedCheckbox();
		String selStr = sel.getLabel();
//		System.out.println(selStr);
		itemTest.ta.setText("--- " + selStr + " ---\n");
//		ta.append("1. 사과 : " + (app.getState()==true? "먹었다" : "안먹었다")+ "\n");
//		ta.append("2. 바나나 : " + (bana.getState() == true ? "먹었다" : "안먹었다")+ "\n");
//		ta.append("3. 딸기 : " + (straw.getState() == true ? "먹었다" : "안먹었다")+ "\n");
//		3삼연산자 코딩 3개가 모두 같은 기능을 하는 코딩이기 때문에 적을 수록 좋다 그렇기 때문에
//		getState의 반환값이 boolean이고 그 값을 받아서 String을 반환하는 메소드를 만듬
		itemTest.ta.append("1. 사과 : " + eat(itemTest.app.getState())+ "\n");
		itemTest.ta.append("2. 바나나 : " + eat(itemTest.bana.getState())+ "\n");
		itemTest.ta.append("3. 딸기 : " + eat(itemTest.straw.getState())+ "\n");
		itemTest.ch.select(selStr);
		
	}
	
	private String eat(boolean flag) {
		return flag ? "먹었다" : "안먹었다.";
	}
}
