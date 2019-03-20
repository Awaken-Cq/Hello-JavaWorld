package Constructor;

/*
r1가로가 4이고 세로가 3인 사각형의 넓이는 12이고, 둘레는 14입니다.
r2 임의설정
c1반지름이 4인 원의 넓이는 48.xxx이고 둘레는 24.xxx입니다.
c2 임의설정
*/

public class DohyungTest {

	public static void main(String[] args) {

//r1가로가 4이고 세로가 3인 사각형의 넓이는 12이고, 둘레는 14입니다.
Rect r1 = new Rect();

r1.calcArea();
r1.calcRound();
System.out.println(r1.sen());

//r2 임의설정
Rect r2 = new Rect(5,7);

r2.calcArea();
r2.calcRound();
System.out.println(r2.sen());


//c1반지름이 4인 원의 넓이는 48.xxx이고 둘레는 24.xxx입니다.
Circle c1 = new Circle();

c1.calcArea();
c1.calcRound();
System.out.println(c1.sen());

//c2 임의설정
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
