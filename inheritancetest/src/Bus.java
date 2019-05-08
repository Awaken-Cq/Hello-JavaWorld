/*
1.field
승객수 pCount
지나친 정류장 수 sCount

2.method
타다 getOn
내리다 getOff

3.첫정류장에서는 내릴 사람이 없다.
탄사람보다 많은 사람이 내릴 수 없다.

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
				System.out.println("내릴 승객이 없습니다.");
			} else {
				this.pCount -= pCount;
			}
	}



}
