package cis232.example;

import java.util.ArrayList;

public class PolymorphismExample {

	public static void main(String[] args) {
		
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(new Rectangle(2,5));
		shapes.add(new Square(5));
		shapes.add(new Circle(2));
		
		for(Shape shape : shapes){
			System.out.println("Shape area is: " + shape.getArea());
			
			if(shape instanceof Circle){
				Circle circ = (Circle)shape;
				System.out.println("Circle diameter is: " + circ.getDiameter());
			}
		}

	}

}
