package Constructor;

/*
r1���ΰ� 4�̰� ���ΰ� 3�� �簢���� ���̴� 12�̰�, �ѷ��� 14�Դϴ�.
r2 ���Ǽ���
c1�������� 4�� ���� ���̴� 48.xxx�̰� �ѷ��� 24.xxx�Դϴ�.
c2 ���Ǽ���
*/

public class DohyungTest {

	public static void main(String[] args) {

//r1���ΰ� 4�̰� ���ΰ� 3�� �簢���� ���̴� 12�̰�, �ѷ��� 14�Դϴ�.
Rect r1 = new Rect();

r1.calcArea();
r1.calcRound();
System.out.println(r1.sen());

//r2 ���Ǽ���
Rect r2 = new Rect(5,7);

r2.calcArea();
r2.calcRound();
System.out.println(r2.sen());


//c1�������� 4�� ���� ���̴� 48.xxx�̰� �ѷ��� 24.xxx�Դϴ�.
Circle c1 = new Circle();

c1.calcArea();
c1.calcRound();
System.out.println(c1.sen());

//c2 ���Ǽ���
Circle c2 = new Circle(5);

c2.calcArea();
c2.calcRound();
System.out.println(c2.sen());


/*
		Circle c1 = new c1();

		Circle c2 = new c2();

		Rect.r1= calcArea();*/
	}
}
