public class FreeTest22 {

	public static void main(String[] args) {
			int sum = 0;
			int total = 0;

			FreeTest2 ft1 = new FreeTest2();
			sum += ft1.price;
			FreeTest2 ft2 = new FreeTest2("JQuery",21000);
			
			sum += ft2.price;
			FreeTest2 ft3 = new FreeTest2("����Ŭ", 19000);
		
			sum += ft3.price;
			FreeTest2 ft4 = new FreeTest2("������", 35000);
		
			sum += ft4.price;

			System.out.println("===== ���� ���� ��� =====");
			System.out.println(ft1.bookName + " : " + ft1.price);
			System.out.println(ft2.bookName + " : " + ft2.price);
			System.out.println(ft3.bookName + " : " + ft3.price);
			System.out.println(ft4.bookName + " : " + ft4.price);

			System.out.println("--------------------------");
			System.out.println("�ֹ� �ѱݾ� : " + sum + "��");
			total = ft1.dissum(sum);
			System.out.println("������ ���� �ݾ� : " + total  + "��");

		}
}
