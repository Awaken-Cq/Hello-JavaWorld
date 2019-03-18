public class SmartPhone {

	private String maker;
	private String name;
	private int price;
	private int discountRate;
	
	public SmartPhone(String maker, String name, int price){
		this.maker = maker;
		this.name = name;
		this.price = price;
		
	}

	public SmartPhone(String maker, String name, int price, int discountRate){
		this(maker, name, price);
		this.discountRate = discountRate;
	}
	
	public int calculateDiscount(){
			price = price *(100-discountRate)/100;
			return price;
	}
	
	
	public void info(){
		if(discountRate == 0)
		System.out.println(name + " [" + maker + "]\n가격 : " + price); 
		else
		System.out.println(name + " [" + maker + "]\n가격 : " + price 
			+ "\n할인가격 : " + calculateDiscount());
	}
	
}
