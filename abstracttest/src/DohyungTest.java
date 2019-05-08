public class DohyungTest {

	public static void main(String[] args) {
		Rect r1 = new Rect(4,5);
		System.out.println("가로가 " + r1.width + "이고 세로가 " + r1.height +
			"인 사각형의 넓이는 " +r1.getArea() + "이고 둘레는 " + r1.getRound() + "입니다.");
	
	
	Circle c1 = new Circle(4);
	System.out.println("반지름이 " + c1.radius + 
			"인 원의 넓이는 " +c1.getArea() + "이고 둘레는 " + c1.getRound() + "입니다.");
	
	
	//Dohyung d = new Dohyung();
	//렉트를 만들때 도형도 만들어지기 때문에 렉트클래스를 도형 클래스에 넣을 수 있다.
	//그러나 렉트의 메소드는 도형의 메소드와 링크되어있지만 렉트의 필드는 따로 링크가 되어있지
	//않기때문에 포함되지않는다. 고로 도형에서 어떠한 값이 들어올때 그것이 도형인건 맞지만
	//사각형인지 원인지 알 수 없다.
	Dohyung d1 = new Rect(5,7);
System.out.println("도형의 넓이는 " + d1.getArea() + "이고 둘레는 " + d1.getRound() + "입니다.");
	//도형클래스에는 렉트클래스가 포함되어있기때문에 도형클래스를 렉트클래스로 형변환하여 렉트클래스를 생성할 수 있다.
	Rect r2 = (Rect)d1;
		System.out.println("가로가 " + r2.width + "이고 세로가 " + r2.height +
			"인 사각형의 넓이는 " +r2.getArea() + "이고 둘레는 " + r2.getRound() + "입니다.");
	//도형클래스에는 렉트클래스를 집어넣었기때문에 렉트클래스가 들어가있지만
	//서클 클래스는 들어가있지도, 생성되지도 않았기 때문에 형변환이 불가능하다.
	//Circle c2 = (Circle) d1;

	}

}
