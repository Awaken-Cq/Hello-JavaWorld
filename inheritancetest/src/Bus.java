/*
1.field
�°��� pCount
����ģ ������ �� sCount

2.method
Ÿ�� getOn
������ getOff

3.ù�����忡���� ���� ����� ����.
ź������� ���� ����� ���� �� ����.

*/


public class Bus extends Car {

	
		
	int pCount;
	int sCount;
	
	public Bus(){
	
	}

	public Bus (String carName, String color, String maker){
			super(carName, color, maker);
	}

	public void getOn(int pCount){
			this.pCount += pCount;
			sCount++;
	}
	
	public void getOff(int pCount){
			if(this.pCount < pCount){
				System.out.println("���� �°��� �����ϴ�.");
			} else {
				this.pCount -= pCount;
			}
	}



}
