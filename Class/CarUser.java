public class CarUser {

	public static void main(String[] args) {
		Car car1 = null;	//stack�� car1�̶�� ������ ���� ����
		car1 = new Car();	//heap������ Car�����ڷ� �޸��Ҵ� �� car1�� ������.
		
		System.out.println("1. ���̸� : " + car1.carName + "  ���� : " 
			+ car1.color + "  ������ : " + car1.maker);
		car1.carName = "�Ÿ";
		car1.color = "������";
		car1.maker = "����";
		
		System.out.println("2. ���̸� : " + car1.carName + "  ���� : " 
			+ car1.color + "  ������ : " + car1.maker);

		Car car2 = new Car();
		System.out.println("2. ���̸� : " + car2.carName + "  ���� : " 
			+ car2.color + "  ������ : " + car2.maker);

		car2.carName = "K5";
		car2.color = "���";
		car2.maker = "���";
		
		System.out.println("2. ���̸� : " + car2.carName + "  ���� : " 
			+ car2.color + "  ������ : " + car2.maker);
	}
}
