/*
1.���
�⺻���(basicPrice)
	�Ϲ� : 3800
	�ɾ� : 5000

�����(����)(totalPrice)
���(price)
	�Ϲ� : 100/km
	�ɾ� : 150/km
-------------------
2.��ݰ��(calcprice())
3.�ɾ����� : 0�� ~6��
*/



import java.util.*;

// CarŬ���� ���
public class Taxi extends Car{

	int basicPrice; 
	int totalPrice;
	int price;
	int cPrice;
	int hour;

	public Taxi(){
//��Ӱ����� ��� ù�ٿ� ���� �����ʾƵ� �ڵ����� super()�� �ٴ´�.(default)
//��� CarŬ������ default���� �������Եȴ�.
		




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
		return maker + "���� ���� " + color + " " + carName;
	}
	
	@Override
	public String toString(){
			return super.toString() + "�ý�";
		}
}
