public class IfElseTest2 {

	public static void main(String[] args) {
		/*score(����)��
		90�̻��̸� A
		80�̻��̸� B
		70�̻��̸� C
		60�̻��̸� D
		60�̸��̸� F
		x5�̻��̸� x+ ����
		��� : ������ ??���̹Ƿ� ?�����Դϴ�.*/

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
		System.out.println("������ " + score + "���̹Ƿ� " + grade + "�����Դϴ�.");

		/* &&������ �� || ������ ��, 
			if(grade != "F" && score % 10 > 5 || score >= 100){
				grade += "+";*/
		

		String gender;
		int jumin = 1;
		
		if(jumin% 2 == 0){
			gender = "����";
		} else {
			gender = "����";
		}
		System.out.println("����� ������ " + gender + "�Դϴ�.");

	}
}

	

