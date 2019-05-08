package Constructor;

public class Circle2 {

	double radius;

	
	public Circle2(double a){
		radius = a;
	}

	public double calcArea(){
		return radius*radius*3.14;
	}

	public double calcRound(){
		return radius*2*3.14;
	}
}
