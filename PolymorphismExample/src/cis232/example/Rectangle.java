package cis232.example;

public class Rectangle implements Shape, Comparable{
	double length, width;
	
	public Rectangle(double l, double w){
		length = l;
		width = w;
	}
	
	public double getArea(){
		return length * width;
	}

	@Override
	public int compareTo(Object other) {
		if(other instanceof Shape){
			return ShapeUtil.compare(this, (Shape)other);
		}
		return 0;
	}
}
