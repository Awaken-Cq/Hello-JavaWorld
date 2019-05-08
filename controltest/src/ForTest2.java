public class ForTest2 {

	public static void main(String[] args) {
	//备备窜 5窜
	System.out.println("备备窜5窜");
		int dan = 5;
		int i;
		for(i=1;i<10;i++){
			System.out.println(dan + " * " + i + "=" + dan*i);
		}

	//备备窜1
	System.out.println("备备窜1");

	for(i=1;i<10;i++){
		for(dan=2;dan<10;dan++){
			System.out.print(dan + " * " + i + " = " + dan*i +", ");
		}
		System.out.println("");
	}



	
	//备备窜2
	System.out.println("备备窜2");

	for(dan=2;dan<10;dan++){
		for(i=1;i<10;i++){
		System.out.print(dan + " * " + i + " = " + dan*i + ", ");
		}
	System.out.println("");
	}


		System.out.println("");
	}
}
