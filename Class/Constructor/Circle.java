/*
1. ������ radius
2. ���� : calcArea()
   �ѷ� : calcRound()
*/



public class Circle {
		
		int radius;
		double pie = 3.14;
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
			calcArea = (radius * radius) * pie;
		}

		
		public void calcRound(){
			calcRound = radius*2*pie;
		}

		

}
