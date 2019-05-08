public class Circle implements DohyungArea {

	double radius;
	
	
	public Circle(double radius){
		this.radius = radius;
	}

	
	@Override
	public double getArea(){
		return Math.PI * Math.pow(radius,2);
	}

	/*
	@Override
	public double getRound(){
		return 2 * radius * Math.PI;
	}
	*/
	
}
