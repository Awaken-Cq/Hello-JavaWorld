public class IfElseTest1 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		String result;
		// if ~ else
		/*if(x > y){
			System.out.println( x + "�� " + y + "���� ũ��.");
		} else {
			System.out.println( x + "�� " + y + "���� �۴�.");
		}*/


		
		/*if(x > y){
			result = "ũ��.";
			} else {
			result = "�۴�.";
			}

		System.out.println( x + "�� " + y + "���� " + result);*/

		//��ø if
		/*String result;
		if(x == y){
		result = "����.";
		} else {
			if(x < y){
			result = "�۴�.";
			} else {
			result = "ũ��.";
			}			
		}*/

		//if elseif else
		/*if (x == y){
			result = "����.";
		} else if( x > y ){
			result = "ũ��";
		} else {
			result = "�۴�";
		}*/
		
		/*if (x - y == 0){
			result = "����.";
		} else if(x - y > 0){
			result = "ũ��.";
		} else {
			result = "�۴�";
		}*/
				
		result = x == y ? "����" : (x > y ? "ũ��" : "�۴�");

		System.out.println( x + "�� " + y + "���� " + result);


		System.out.println("���α׷� ����!!!");



	}
}
