package Constructor;

/*
1.���� width, ���� height
2. ���� : calcArea()
   �ѷ� : calcRound()

*/



public class Rect {

		int width;
		int height;
		int calcArea;
		int calcRound;
		

		String sen(){
		return "���ΰ� " + width + "�̰� ���ΰ� " + height +
				"�� �簢���� ���̴� " + calcArea + "�̰�, �ѷ��� " + calcRound + "�Դϴ�.";
		}
		public Rect(){
			width = 4;
			height = 3;
		}
	
		public Rect(int width, int height){
			this.width = width;
			this.height = height;
		}

		public void calcArea(){
			calcArea = width * height;
		}

		public void calcRound(){
			calcRound = width*2 + height*2;
		}
		

			






}
		



/*
		public int calcArea(){
			this(4,3);
		}
			public int calcRound(){
			calcRound = width*2 + height*2;
			return calcRound;
		}
		
		
		public int calcArea(int width, int height){
			this.calcArea = width*2 + height*2;
			return calcArea;
		}

		

		public int calcRound(int width, int height){
			calcRound = width*2 + height*2;
			return calcRound;
		}
		

//int width, int height, int calcArea, int calcRound */