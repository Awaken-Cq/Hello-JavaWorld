public class DoHyung2 {

	public static void main(String[] args) {
	Rect2 r1 = new Rect2(4,3);
	double area = r1.calcArea();
	double round = r1.calcRound();
	
	System.out.println(r1 + "�� ���ΰ� " + r1.width + "�̰� ���ΰ� " + r1.height +
		"�� �簢���� ���̴� " + area + "�̰�, �ѷ��� " + round + "�Դϴ�.");
	Rect2 r2 = new Rect2(6,5);
	area = r2.calcArea();
	round = r2.calcRound();
	System.out.println(r2 + "�� ���ΰ� " + r2.width + "�̰� ���ΰ� " + r2.height +
		"�� �簢���� ���̴� " + area + "�̰�, �ѷ��� " + round + "�Դϴ�.");
	

	Circle2 c1 = new Circle2(5);
	area = c1.calcArea();
	round = c1.calcRound();
	System.out.println(c1 + "�� �������� " + c1.radius + "�̰� ���� ���̴� " +
		area + "�̰�, �ѷ��� " + round + "�Դϴ�.");

	Circle2 c2 = new Circle2(7);
	area = c2.calcArea();
	round = c2.calcRound();
	System.out.println(c2 + "�� �������� " + c2.radius + "�̰� ���� ���̴� " +
		area + "�̰�, �ѷ��� " + round + "�Դϴ�.");
	}
}

/*
r1���ΰ� 4�̰� ���ΰ� 3�� �簢���� ���̴� 12�̰�, �ѷ��� 14�Դϴ�.
r2 ���Ǽ���
c1�������� 4�� ���� ���̴� 48.xxx�̰� �ѷ��� 24.xxx�Դϴ�.
c2 ���Ǽ���
*/