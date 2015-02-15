package com.moussi.factory;

/**
 * In Factory pattern, we create object without exposing the creation logic to
 * the client and refer to newly created object using a common interface.
 * 
 * @author Aymen
 *
 */
public class ShapeFactory {
	private final static String CIRCLE_SHAPE = "CIRCLE";
	private final static String RECTANGLE_SHAPE = "RECTANGLE";
	private final static String SQUARE_SHAPE = "SQUARE";

	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (CIRCLE_SHAPE.toUpperCase().equals(shapeType)) {
			return new Circle();
		} else if (RECTANGLE_SHAPE.toUpperCase().equals(shapeType)) {
			return new Rectangle();
		}
		if (SQUARE_SHAPE.toUpperCase().equals(shapeType)) {
			return new Square();
		}
		return null;
	}
}
