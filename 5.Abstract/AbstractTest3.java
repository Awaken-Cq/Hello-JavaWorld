import java.awt.*;
import java.awt.event.*;

public class AbstractTest3 extends Frame {

	
	Button b = new Button("@눌러봐@");

	public AbstractTest3(){
		//상속을 안받았을때는 생성자에 인자값을 넣었지만 상속을 받았기때문에
		//super를 통해 상위클래스의 메소드를 사용해야한다.
		super("Is A Test!!!");
		//f.setTitle("Is A Test");
		setLayout(new FlowLayout());
		//b.setLabel("눌러봐!!!");
		add(b);
		setSize(400,300);
		setLocation(300,200);
		setVisible(true);

		
		WindowListener wl = new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				//System.exit(0);
				System.out.println("아이콘화!");
			}
	};

		addWindowListener(wl);
	}


	public static void main(String[] args) {
		AbstractTest3 iat = new AbstractTest3();
	}
}