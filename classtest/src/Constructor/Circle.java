package Constructor;

/*
1. ������ radius
2. ���� : calcArea()
   �ѷ� : calcRound()
*/



public class Circle {
		
		int radius;
		double pie = Math.PI;
		double calcRound;
		double calcArea;

		public String sen(){
			return "�������� " + radius + "�� ���� ���̴� " +
				calcArea + "�̰� �ѷ��� " + calcRound + "�Դϴ�.";
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
