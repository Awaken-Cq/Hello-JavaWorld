package Constructor;

/*
1. 반지름 radius
2. 넓이 : calcArea()
   둘레 : calcRound()
*/



public class Circle {
		
		int radius;
		double pie = Math.PI;
		double calcRound;
		double calcArea;

		public String sen(){
			return "반지름이 " + radius + "인 원의 넓이는 " +
				calcArea + "이고 둘레는 " + calcRound + "입니다.";
		}

		public Circle(){
			radius = 4;
		}
		
		public Circle(int radius){
			this.radius = radius;
		}
		
		public void calcArea(){
			calcArea = Math.pow(radius, 2) * pie;
		}

		
		public void calcRound(){
			calcRound = radius*2*pie;
		}

		

}
