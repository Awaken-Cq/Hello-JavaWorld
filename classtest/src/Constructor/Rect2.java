package Constructor;

public class Rect2 {

	double width;
	double height;
	
	public Rect2(double a, double b){
		width = a;
		height = b;
	}

	public double calcArea(){
		return width * height;  
	}

	public double calcRound(){
		return (width + height)*2;
	}
}
