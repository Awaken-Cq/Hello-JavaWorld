import java.awt.*;
import java.awt.event.*;

public class AbstractTest3 extends Frame {

	
	Button b = new Button("@������@");

	public AbstractTest3(){
		//����� �ȹ޾������� �����ڿ� ���ڰ��� �־����� ����� �޾ұ⶧����
		//super�� ���� ����Ŭ������ �޼ҵ带 ����ؾ��Ѵ�.
		super("Is A Test!!!");
		//f.setTitle("Is A Test");
		setLayout(new FlowLayout());
		//b.setLabel("������!!!");
		add(b);
		setSize(400,300);
		setLocation(300,200);
		setVisible(true);

		
		WindowListener wl = new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				//System.exit(0);
				System.out.println("������ȭ!");
			}
	};

		addWindowListener(wl);
	}


	public static void main(String[] args) {
		AbstractTest3 iat = new AbstractTest3();
	}
}