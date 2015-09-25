package cis232.example;

import java.util.ArrayList;
import java.util.Scanner;

public class PolymorphismExample2 {

	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<>();
		list.add(new Rectangle(2,5));
		list.add(new Square(5));
		list.add(new Circle(2));
		Boss b = new Boss("Tyler");
		list.add(new LowlyEmployee("Jake", b));
		list.add(new Scanner(System.in));
		
		for(Object obj : list){
			if(obj instanceof Shape){
				Shape shape = (Shape)obj;
				System.out.println("Shape area is: " + shape.getArea());
			
				if(shape instanceof Circle){
					Circle circ = (Circle)shape;
					System.out.println("Circle diameter is: " + circ.getDiameter());
				}
			}else{
				System.out.println(obj);
			}
		}

	}

}
