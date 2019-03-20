public class SwitchTest2 {

	public static void main(String[] args) {
		int score = 65;
		String grade;
		/*
		switch (score/10){
		
		case 10 : case 9 : if (score >= 95){
							grade = "A+";
		} else { grade = "A"; }break;				
		case 8 : if( score >= 85){
							grade = "B+";break;
		} else { grade = "B"; }break;
		case 7 : if( score >= 75){
							grade = "C+";break;
		} else { grade = "C"; }break;
		case 6 : if( score >= 65){
							grade = "D+";break;
		} else { grade = "D"; }break;
		default : grade = "F";


		}
		*/
		switch (score/10){
				
				case 10 : case 9 : grade = "A";break;				
				case 8 : grade = "B";break;
				case 7 : grade = "C";break;
				case 6 : grade = "D";break;
				default : grade = "F";		
		}
		if()
		

		System.out.println(score + "ดย " + grade);
	}
}
