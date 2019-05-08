/*트럭
1.field
중량 weight
최대중량 maxWeight

2.method
상차 loadUp
하자 loadDown
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
		System.out.println("중량 초과입니다. 한계중량까지만 적재합니다.");
		weight = maxWeight;
		}
	}

	public void loadDown(int kg){
			weight -= kg;
		if (weight < 0){
		System.out.println("에러 : " + kg + "kg" + "만큼의 짐이 없습니다.");
			weight += kg;
			//weight = 0;
		}
	}
}
