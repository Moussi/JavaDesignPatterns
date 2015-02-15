package com.moussi.factory.shape;

import com.moussi.abstractfactory.AbstractFactory;
import com.moussi.factory.color.Color;

/**
 * In Factory pattern, we create object without exposing the creation logic to
 * the client and refer to newly created object using a common interface.
 * 
 * @author Aymen
 *
 */
public class ShapeFactory extends AbstractFactory{
	private final static String CIRCLE_SHAPE = "CIRCLE";
	private final static String RECTANGLE_SHAPE = "RECTANGLE";
	private final static String SQUARE_SHAPE = "SQUARE";

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (CIRCLE_SHAPE.equals(shapeType.toUpperCase())) {
			return new Circle();
		} else if (RECTANGLE_SHAPE.equals(shapeType.toUpperCase())) {
			return new Rectangle();
		}
		if (SQUARE_SHAPE.equals(shapeType.toUpperCase())) {
			return new Square();
		}
		return null;
	}
	
	@Override
	public Color getColor(String color) {
	      return null;
	   }
}
