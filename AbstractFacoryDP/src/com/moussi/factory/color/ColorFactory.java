package com.moussi.factory.color;

import com.moussi.abstractfactory.AbstractFactory;
import com.moussi.factory.shape.Shape;

/**
 * In Factory pattern, we create object without exposing the creation logic to
 * the client and refer to newly created object using a common interface.
 * 
 * @author Aymen
 *
 */
public class ColorFactory extends AbstractFactory {
	private final static String RED_COLOR = "RED";
	private final static String BLUE_COLOR = "BLUE";
	private final static String GREEN_COLOR = "GREEN";

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (RED_COLOR.equals(color.toUpperCase())) {
			return new Red();
		} else if (BLUE_COLOR.equals(color.toUpperCase())) {
			return new Blue();
		} else if (GREEN_COLOR.equals(color.toUpperCase())) {
			return new Green();
		}
		return null;
	}
}
