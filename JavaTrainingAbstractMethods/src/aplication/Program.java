package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		
		List<Shape> listShape = new ArrayList<>();
		
		int shapeNumbers = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0 ; i < shapeNumbers ; i++){
			
		System.out.println("Shape #" + (i+1) + " data: ");
		
		System.out.print("Rectangle or Circle (r/c)? ");
			char type = sc.next().charAt(0);
			
			System.out.println("BLACK/BLUE/RED: ");
			Color color = Color.valueOf(sc.next());
			
			if (type == 'r') {
				System.out.println("Width: ");
				double width = sc.nextDouble();
				System.out.println("Height: ");
				double height = sc.nextDouble();
				listShape.add(new Rectangle(color, width, height));
			}
			else {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				listShape.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		
		for(Shape shape : listShape) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		
		sc.close();
	}

}
