/*Ʈ��
1.field
�߷� weight
�ִ��߷� maxWeight

2.method
���� loadUp
���� loadDown
*/



public class Truck extends Car {
	
	int weight;
	int maxWeight;
	
	public Truck(){
	
	}
	
	public Truck(String carName, String color, String maker, int maxWeight){
		super(carName, color, maker);
		this.maxWeight = maxWeight;
	}
	
	public void loadUp(int kg){
		weight += kg;
		if(weight > maxWeight){
		System.out.println("�߷� �ʰ��Դϴ�. �Ѱ��߷������� �����մϴ�.");
		weight = maxWeight;
		}
	}

	public void loadDown(int kg){
			weight -= kg;
		if (weight < 0){
		System.out.println("���� : " + kg + "kg" + "��ŭ�� ���� �����ϴ�.");
			weight += kg;
			//weight = 0;
		}
	}
}
