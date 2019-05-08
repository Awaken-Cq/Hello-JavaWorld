import java.awt.*;
import java.awt.event.*;

public class InterfaceTest extends Frame implements WindowListener, ActionListener {

	
	Button b = new Button("@눌러봐@");

	public InterfaceTest(){
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
	
		
		//WindowListener wl = new InterfaceTest();
		//생성자 호출과 setvisible로 인해 계속 무한루프
		//addWindowListener(wl); 앞에는 this.가 생략되어있고 즉 프레임이다.
		//윈도우 리스터의 역할은 프레임 감시!!.
		//새로운 것을 만들면 계속 무한루프에 들어간다.
		//근데 현재 클래스는 인터페이스는 윈도우 리스너인터페이스를 임플루먼트했고
		//생성자를 만들었기때문에 this가 들어간다.
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
