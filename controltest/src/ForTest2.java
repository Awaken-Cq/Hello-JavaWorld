public class ForTest2 {

	public static void main(String[] args) {
	//������ 5��
	System.out.println("������5��");
		int dan = 5;
		int i;
		for(i=1;i<10;i++){
			System.out.println(dan + " * " + i + "=" + dan*i);
		}

	//������1
	System.out.println("������1");

	for(i=1;i<10;i++){
		for(dan=2;dan<10;dan++){
			System.out.print(dan + " * " + i + " = " + dan*i +", ");
		}
		System.out.println("");
	}



	
	//������2
	System.out.println("������2");

	for(dan=2;dan<10;dan++){
		for(i=1;i<10;i++){
		System.out.print(dan + " * " + i + " = " + dan*i + ", ");
		}
	System.out.println("");
	}


		System.out.println("");
	}
}
