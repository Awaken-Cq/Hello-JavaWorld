import java.awt.*;
import java.awt.event.*;

public class InterfaceTest extends Frame implements WindowListener, ActionListener {

	
	Button b = new Button("@������@");

	public InterfaceTest(){
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
	
		
		//WindowListener wl = new InterfaceTest();
		//������ ȣ��� setvisible�� ���� ��� ���ѷ���
		//addWindowListener(wl); �տ��� this.�� �����Ǿ��ְ� �� �������̴�.
		//������ �������� ������ ������ ����!!.
		//���ο� ���� ����� ��� ���ѷ����� ����.
		//�ٵ� ���� Ŭ������ �������̽��� ������ �������������̽��� ���÷��Ʈ�߰�
		//�����ڸ� ������⶧���� this�� ����.
		addWindowListener(this);
		b.addActionListener(this);
	}
		
	public void windowDeactivated(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e){System.exit(0);}
	public void windowOpened(WindowEvent e){}

	public void actionPerformed(ActionEvent e){
		int r  = (int)(Math.random() * 256);
		int g  = (int)(Math.random() * 256);
		int b  = (int)(Math.random() * 256);
		setBackground(new Color(r, g, b));
	}

	public static void main(String[] args) {
		InterfaceTest iat = new InterfaceTest();
	}
}
