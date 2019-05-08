public class Chapter3ex{
	public static void main(String[] args){





		int pencils = 534;
		int students = 30;
//4.
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);

		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);
		// 17 , 24

		int value = 356;
		System.out.println(value/ 100 * 100);
		// value - 56 - 356 / 100 * 100
//5.
		/*int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((double)(lengthTop+lengthBottom) * height / 2);
		System.out.println(area);
		//area = 52.0 - area = 52.5
//6.
		int x = 10;
		int y = 5;
		
		System.out.println( (x>7) && (y<=5) );
		System.out.println( (x%3 == 2) || (y%2 != 1) );*/
		// true, false
//8.	
		double x = 5.0;
		double y = 0.0;

		double z = x % y;

		if (Double.isNaN(z)){
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과 : " + result);
		}

		
	}
}

