package cis232.example;

public class ShapeUtil {
	static int compare(Shape lhs, Shape rhs){
		if(lhs.getArea() < rhs.getArea()){
			return 1;
		}else if (lhs.getArea() > rhs.getArea()){
			return -1;
		}
		return 0;
	}
}
