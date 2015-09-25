package cis232.example;

public class Circle implements Shape{

	private double radius;
	
	public Circle(double r){
		radius = r;
	}
	
	public double getArea() {
		
		return Math.PI * radius * radius;
	}

	public double getDiameter(){
		return radius * 2;
	}

	@Override
	public int compareTo(Object other) {
		if(other instanceof Shape){
			return ShapeUtil.compare(this, (Shape)other);
		}
		return 0;
	}
	
}
