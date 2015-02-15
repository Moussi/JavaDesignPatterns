package com.moussi.factory.main;

import com.moussi.factory.Shape;
import com.moussi.factory.ShapeFactory;

/**
 * Factory Design Pattern
 * @author Aymen
 *
 */
public class FactoryDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory=new ShapeFactory();
		Shape circle = shapeFactory.getShape("Circle");
		System.out.println("**********");
		circle.draw();
		System.out.println("**********");
		Shape rectangle = shapeFactory.getShape("Rectangle");
		rectangle.draw();
		System.out.println("**********");
		Shape square = shapeFactory.getShape("Square");
		square.draw();
		
	}

}
