public class IfElseTest2 {

	public static void main(String[] args) {
		/*score(점수)가
		90이상이면 A
		80이상이면 B
		70이상이면 C
		60이상이면 D
		60미만이면 F
		x5이상이면 x+ 학점
		결과 : 점수가 ??점이므로 ?학점입니다.*/

		int score;
		String grade;
		
		/*if (score >= 90){
			grade = 'A';
		} else if (score>= 80){
			grade = 'B';
		} else if (score >= 70){
			grade = 'C';
		} else if (score >= 60){
			grade = 'D';
		} else  {
			grade = 'F';
		}*/

		/*score = 58;
		if (score >= 95){
			grade = "A+";
		} else if (score >= 90){
			grade = "A";
		} else if (score >= 85){
			grade = "B+";
		} else if (score >= 80){
			grade = "B";
		} else if (score >= 75){
			grade = "C+";
		} else if (score >= 70){
			grade = "C";
		} else if (score >= 65){
			grade = "D+";
		} else if (score >= 60){
			grade = "D";
		} else {
			grade = "F";
		} */

		/*score = 100;
		if (score >= 90){
			if(score%10 >= 5){
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (score >= 80){
			if(score%10 >= 5){
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (score >= 70){
			if(score%10 >= 5){
				grade = "C+";
			} else {
				grade = "C";
			}
		} else if (score >= 60){
			if(score%10 >= 5){
				grade = "D+";
			} else {
				grade = "D";
			}
		} else {
			grade ="F";
		}*/

		score = 100;
		if (score >= 90){
			grade = "A";
		} else if (score>= 80){
			grade = "B";
		} else if (score >= 70){
			grade = "C";
		} else if (score >= 60){
			grade = "D";
		} else  {
			grade = "F";
		}
				
		if(score >= 60 && (score % 10 > 5 ||  score >= 100) ){
				grade += "+";
		}
		System.out.println("점수가 " + score + "점이므로 " + grade + "학점입니다.");

		/* &&연산이 선 || 연산이 후, 
			if(grade != "F" && score % 10 > 5 || score >= 100){
				grade += "+";*/
		

		String gender;
		int jumin = 1;
		
		if(jumin% 2 == 0){
			gender = "여자";
		} else {
			gender = "남자";
		}
		System.out.println("당신의 성별은 " + gender + "입니다.");

	}
}

	

