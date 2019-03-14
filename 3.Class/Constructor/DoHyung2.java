public class DoHyung2 {

	public static void main(String[] args) {
	Rect2 r1 = new Rect2(4,3);
	double area = r1.calcArea();
	double round = r1.calcRound();
	
	System.out.println(r1 + "의 가로가 " + r1.width + "이고 세로가 " + r1.height +
		"인 사각형의 넓이는 " + area + "이고, 둘레는 " + round + "입니다.");
	Rect2 r2 = new Rect2(6,5);
	area = r2.calcArea();
	round = r2.calcRound();
	System.out.println(r2 + "의 가로가 " + r2.width + "이고 세로가 " + r2.height +
		"인 사각형의 넓이는 " + area + "이고, 둘레는 " + round + "입니다.");
	

	Circle2 c1 = new Circle2(5);
	area = c1.calcArea();
	round = c1.calcRound();
	System.out.println(c1 + "의 반지름은 " + c1.radius + "이고 원의 넓이는 " +
		area + "이고, 둘레는 " + round + "입니다.");

	Circle2 c2 = new Circle2(7);
	area = c2.calcArea();
	round = c2.calcRound();
	System.out.println(c2 + "의 반지름은 " + c2.radius + "이고 원의 넓이는 " +
		area + "이고, 둘레는 " + round + "입니다.");
	}
}

/*
r1가로가 4이고 세로가 3인 사각형의 넓이는 12이고, 둘레는 14입니다.
r2 임의설정
c1반지름이 4인 원의 넓이는 48.xxx이고 둘레는 24.xxx입니다.
c2 임의설정
*/