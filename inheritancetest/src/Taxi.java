/*
1.요금
기본요금(basicPrice)
	일반 : 3800
	심야 : 5000

요금합(누적)(totalPrice)
요금(price)
	일반 : 100/km
	심야 : 150/km
-------------------
2.요금계산(calcprice())
3.심야할증 : 0시 ~6시
*/



import java.util.*;

// Car클래스 상속
public class Taxi extends Car{

	int basicPrice; 
	int totalPrice;
	int price;
	int cPrice;
	int hour;

	public Taxi(){
//상속관계일 경우 첫줄에 따로 쓰지않아도 자동으로 super()가 붙는다.(default)
//고로 Car클래스의 default값을 가져오게된다.
		




		/*
		if(time=am){
				basicprice = 3800;
				price = 100;
			}else{
			basicPrice = 5000;
			price = 150;
			}
		*/	
	}

	public Taxi(String carName, String color, String maker) {
		super(carName = carName, color = color, maker = maker);
		
	}
	
	int initPrice(){
		Calendar calendar = Calendar.getInstance();
		hour = calendar.get(Calendar.HOUR_OF_DAY);

		if (hour >= 6){
			basicPrice = 3800;
			cPrice = 100;
		} else { 
			basicPrice = 5000;
			cPrice = 150;
		}
		return price = basicPrice;
	}

	public int calcPrice(int km){
		price = basicPrice + (km * cPrice);
		return price;
	}

	public int sumPrice(){
		totalPrice += price;
		basicPrice = 0;
		return price =0;
		
	}

	@Override
	public int speedUp(int speed){
		speed = super.speedUp(speed);
		if(speed > 150)
			this.speed = 150;
		return this.speed;

	
	}


	
	

	String info(){
		return maker + "에서 만든 " + color + " " + carName;
	}
	
	@Override
	public String toString(){
			return super.toString() + "택시";
		}
}
