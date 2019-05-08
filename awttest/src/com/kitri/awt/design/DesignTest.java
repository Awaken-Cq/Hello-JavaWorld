package com.kitri.awt.design;

import java.awt.*;

/* 디자인만 하는 예제
 * 1.Frame 상속.
 * 2.선언부에 필요한 객체 생성.
 * 3.배치부에서 design(component 배치.)
 * **작업은 소 >> 대(패널에서 3개를 다 붙인 다음 그것을 보더에 붙인다.,패널의 색을 다 입히고 보더에 붙인다.)
 * 
 */

public class DesignTest extends Frame {

//	선언부
//	panel()
//	panel(LayoutManager layout)
	Panel pN = new Panel();
	Panel pS = new Panel();
	
//	Label()
//	Label(String text)
//	Label(String text, in alignments)	
	Label l = new Label("입력", Label.CENTER);
	
//	TextField()
//	TextField(int col글씨사이즈)
//	TextField(String text)
	TextField tf = new TextField();
	
	Button send = new Button("전송");
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
			
	Button exit = new Button("종료");
	
	
	public DesignTest() {
		super("Design Test !!!");
//		배치부
		
		l.setText("입력")	;
//		LayoutManager lm = new BorderLayout(int hgap, vgap)
//		컴포넌트와 컴포넌트사이의 갭일뿐 양끝 벽과의 갭은 아니다
		pN.setLayout(new BorderLayout(10,0));
//		색상만드는 방법 2가지 'Color.원색' or 'new Color(r,g,b)'
//		배경색상변경
		l.setBackground(new Color(210,150,150));
//		폰트색상변경
//		l.setForeground(new Color(200,100,200));
		l.setForeground(Color.PINK);
		Font f = new Font("굴림", Font.BOLD, 20);
		l.setFont(f);
		pN.add(l, "West");
		pN.add(tf, "Center");
		send.setFont(f);
		pN.add(send, "East");
		
		
		
//		pS.setLayout(new GridLayout(row, col, 좌우, 높이));
		pS.setLayout(new GridLayout(1, 2, 10, 0));
		ch.add("서울");
		ch.add("경기, 인천");
		ch.add("강원");
		ch.add("충정");
		ch.add("전라");
		pS.add(ch);
		exit.setFont(f);
		pS.add(exit);
		
//		frame은 디폴트가 BorderLayout이기 때문에 따로 선언하지 않고 바로 입력
//		2가지방법
		//여백을 주기위해선 선언.
		setLayout(new BorderLayout(0,10));
		add(pN,"North");
		add(ta,"Center");
		add(pS,BorderLayout.SOUTH);
		
		
		
//		1)사이즈를 지정하고 2)위치를 지정하고 3)화면에 보이는 순서로 진행.
		setSize(300, 400);
		setLocation(300, 200);
//		set Size와 setLocation을 합쳐놓은게 setBounds(x,y,width,height)
		setBounds(300, 200, 300, 500);
//		사이즈를 바꿀수 없게할때
		setResizable(false);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
//		dt로 생성자를 호출에서 dt.~~를 할 일이 없기때문에 익명으로 생성자 호출해도됨.
//		DesignTest dt = new DesignTest();
		new DesignTest();
	}

}
