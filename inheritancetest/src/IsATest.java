import java.awt.*;

public class IsATest extends Frame {

	
	Button b = new Button("@������@");

	public IsATest(){
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
	}


	public static void main(String[] args) {
		IsATest iat = new IsATest();
	}
}
