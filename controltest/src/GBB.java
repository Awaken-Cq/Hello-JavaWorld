/*
*���������� ����.
1. 0 ( ����), 1 (����), 2(��)
2. �� : ����(0,1,2)
3. ��� Logic(��, ��, ��)
4. ��� ���
	�� : ��, �� : ���� ��� : �̰��.
	�� : ��, �� : ���� ��� : ����.
	�� : ��, �� : �� ��� : ����.
(my + 2) - com
0		 1		 2
��		��		��
0 0 =��  0 2 2%3 2
0 1	=��	-1 1 0%3 0
0 2 =�� -2 0 1%3 1
1 0 =��  1 3 0%3 0
1 1 =��  0 2 2%3 2
1 2 =�� -1 1 1%3 1
2 0 =��  2 4 1%3 1
2 1 =��  1 3 0%3 0
2 2 =��  0 2 2%3 2          


*/


public class GBB {

	public static void main(String[] args) {
		int my = 0;		
		double com = (int)(Math.random() * 3);
		String result = "";
		String myStr = "";
		String comStr = "";

		if((my-com+2)%3 == 2){
			result = "���º�";
		} else if ((my-com+2)%3 == 1){
			result = "�й�";
		} else { result = "�¸�";}
		

		if(my == 0){
			myStr = "����";
		} else if (my == 1){
			myStr = "����";
		} else { myStr = "��";}

		if(com == 0){
			comStr = "����";
		} else if (com == 1){
			comStr = "����";
		} else { comStr = "��";}


/*
		switch(my) {
			case 0 : if(com == 2){
						result = "�̱�";break;
					}else if (com == 1){
						result = "��";break;
					} else {
						result = "���";break;}

			case 1 : if(com == 0){
						result = "�̱�";break;
					}else if (com == 2){
						result = "��";break;
					} else {
						result = "���";break;}

			case 2 : if(com == 1){
						result = "�̱�";break;
					}else if (com == 0){
						result = "��";break;
					} else {
						result = "���";break;}
				}
		
		*/
	
		System.out.println("���� " + myStr + " " + "��ǻ�ʹ� " + comStr + " ��� : " + result);
	}
}


