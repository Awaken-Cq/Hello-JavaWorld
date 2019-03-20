package Constructor;

/*
1.가로 width, 세로 height
2. 넓이 : calcArea()
   둘레 : calcRound()

*/



public class Rect {

		int width;
		int height;
		int calcArea;
		int calcRound;
		

		String sen(){
		return "가로가 " + width + "이고 세로가 " + height +
				"인 사각형의 넓이는 " + calcArea + "이고, 둘레는 " + calcRound + "입니다.";
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