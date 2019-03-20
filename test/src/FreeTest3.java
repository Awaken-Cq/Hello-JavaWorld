public class FreeTest3 {

	public static void main(String[] args) {
		SmartPhone sp1 = new SmartPhone("삼성", "갤럭시노트2", 850000);
		SmartPhone sp2 = new SmartPhone("애플", "아이폰5", 740000, 30);
		SmartPhone sp3 = new SmartPhone("삼성", "갤럭시S3", 750000, 35);

		int calc = sp1.calculateDiscount();
		System.out.println("=== 제 품 목 록 ===");
		System.out.println("---------------------");
		//sp1.info();
		//System.out.println(sp1.name + " [" + sp1.maker + "]\n가격 : " + sp1.price);
		System.out.println(sp1.toString());
		System.out.println("---------------------");
		
		//System.out.println(sp2.name + " [" + sp2.maker + "]\n가격 : " + sp2.price 
		//	+ "\n할인가격 : " + calc );
		//sp2.info();
		System.out.println("---------------------");
		System.out.println(sp2.toString());
		//System.out.println(sp3.name + " [" + sp3.maker + "]\n가격 : " + sp3.price 
		//	+ "\n할인가격 : " + calc );
		//sp3.info();
		System.out.println("---------------------");
		System.out.println(sp3.toString());
		


	}
}
