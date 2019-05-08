package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* 프레임상속
 * 웨스트 : listL
 * 센터 : 4Button
 * 이스트: listR
 * 사우스 : 2Button
 * 
 * 패널 3개
 * 
 * E.S.6
 * 4button 액션
 * 
 */


public class ListTest extends Frame implements ActionListener{

	
	
	
//	pL
	Panel pL = new Panel();
	List listL = new List(0,true);
	TextField tfL = new TextField();
//	버튼부분 PC
	Panel pC = new Panel();
	Button btR = new Button("▷");
	Button btRAll = new Button("▶");
	Button btL = new Button("◁");
	Button btLAll = new Button("◀");
	
//	pR
	List listR = new List(0,true);
	Panel pR = new Panel();
	TextField tfR = new TextField();
	
	Font f= new Font("굴림",Font.BOLD,20);
	
	public ListTest() {
		
		pL.setLayout(new BorderLayout(0,10));
		listL.setBackground(Color.red);
		pL.add(listL,"Center");
		pL.add(tfL,"South");
		
		
		
		pC.setLayout(new GridLayout(6,1,0,10));
		pC.add(new Label(""));
		btR.setFont(f);
		pC.add(btR);
		btRAll.setFont(f);
		pC.add(btRAll);
		btL.setFont(f);
		pC.add(btL);
		btLAll.setFont(f);
		pC.add(btLAll);

		
		pR.setLayout(new BorderLayout(0,10));
		listR.setBackground(Color.blue);
		pR.add(listR,"Center");
		pR.add(tfR,"South");
		
		setLayout(new GridLayout(1, 3, 10, 0));
		add(pL);
		add(pC);
		add(pR);
		
		
		setBounds(300,200,300,500);
		setVisible(true);
		
		tfL.addActionListener(this);
		tfR.addActionListener(this);
		btL.addActionListener(this);
		btLAll.addActionListener(this);
		btR.addActionListener(this);
		btRAll.addActionListener(this);
	}
	
	
	public static void main(String[] args) {
		
		new ListTest();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == tfL) {
//			1. tfL의 값 get(+유효성 검사)
//			공백제거 trim
			String tmp = tfL.getText().trim();
//			이미 tfL은 받아왔기 때문에 setText를 먼저해버리면
			tfL.setText("");
			if(tmp.isEmpty())
//			감시자가 호출을 했으니까 다시 돌려보내서 감시하게함
				return;
//			2. listL에 추가
			listL.add(tmp);
//			텍스트 추가후 빈칸으로 초기화(그러나 delete,remove,reset 등의 메소드는없음)
			
		}else if(ob == tfR) {
//			1.tfR의값을 받음.(유효성검사)
			String tmp = tfR.getText().trim();
//			3.tfR 초기화.
			tfR.setText("");
			if(tmp.isEmpty())
				return;
//			2.listR에 추가
			listR.add(tmp);

		}else if(ob == btL) {
//			1.listR 선택한 값들을 겟함.(유효성검사해야함)
			String tmp[] = listR.getSelectedItems();
//			if(tmp == null)
//				return;
//			2.listL에 추가.
			int len = tmp.length;
			for (int i = 0; i < len; i++) {
				listL.add(tmp[i]);
//			3.listR 값 삭제.
				listR.remove(tmp[i]);
					}
			
		}else if(ob == btLAll) {
//			1.listR의 값을 모두 겟함.
			String tmp[] = listR.getItems();
//			2.listL에 모두 추가함.
			int len = tmp.length;
				for (int i = 0; i < len; i++) {
					listL.add(tmp[i]);
				}
//			3.listR의 값을 모두 지움.
			listR.removeAll();
			
		}else if(ob == btR) {
//			1. listL에서 선택한 문자열 get.
			String tmp[] = listL.getSelectedItems();
//			if(tmp == null)
//				return;
//			2. 1의 값을 listR에 추가.
			int len = tmp.length;
			for (int i = 0; i < len; i++) {
				listR.add(tmp[i]);
//			3. 1의 값을 listL에서 제거.
				listL.remove(tmp[i]);
			}
			
		}else if(ob == btRAll) {
//			1. listL의 값을 모두 get. => 배열
			String tmp[] = listL.getItems();
//			2.1값을 listR에 모두 추가.
			int len = tmp.length;
			for (int i = 0; i < len; i++) {
				listR.add(tmp[i]);
			}
			
//			3.1값을 listL에서 모두 제거.
//			len = tmp.length;
//			for (int i = len-1; i >= 0; i--) {
//				listL.remove(i);
//			}
			listL.removeAll();

		}
	
		
	}
}
