public class FreeTest3 {

	public static void main(String[] args) {
		SmartPhone sp1 = new SmartPhone("�Ｚ", "�����ó�Ʈ2", 850000);
		SmartPhone sp2 = new SmartPhone("����", "������5", 740000, 30);
		SmartPhone sp3 = new SmartPhone("�Ｚ", "������S3", 750000, 35);

		int calc = sp1.calculateDiscount();
		System.out.println("=== �� ǰ �� �� ===");
		System.out.println("---------------------");
		//sp1.info();
		//System.out.println(sp1.name + " [" + sp1.maker + "]\n���� : " + sp1.price);
		System.out.println(sp1.toString());
		System.out.println("---------------------");
		
		//System.out.println(sp2.name + " [" + sp2.maker + "]\n���� : " + sp2.price 
		//	+ "\n���ΰ��� : " + calc );
		//sp2.info();
		System.out.println("---------------------");
		System.out.println(sp2.toString());
		//System.out.println(sp3.name + " [" + sp3.maker + "]\n���� : " + sp3.price 
		//	+ "\n���ΰ��� : " + calc );
		//sp3.info();
		System.out.println("---------------------");
		System.out.println(sp3.toString());
		


	}
}
