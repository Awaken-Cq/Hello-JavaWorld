public class Circle extends Dohyung {

	double radius;
	
	
	public Circle(double radius){
		this.radius = radius;
	}
	@Override
	public double getArea(){
		return 2 * radius * Math.PI;
	}
	@Override
	public double getRound(){
		return Math.PI * Math.pow(radius,2);
	}

	
}
