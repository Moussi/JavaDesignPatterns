package com.moussi.abstractfactory;

import com.moussi.factory.color.Color;
import com.moussi.factory.color.ColorFactory;
import com.moussi.factory.shape.Shape;
import com.moussi.factory.shape.ShapeFactory;

/**
 * Create a Factory generator/producer class to get factories by passing an
 * information such as Shape or Color
 * 
 * @author Aymen
 *
 */
public class FactoryProducer {
	private final static String SHAPE_FACTORY = "SHAPE";
	private final static String COLOR_FACTORY = "COLOR";

	public static AbstractFactory getFactory(String factorytype) {
		if (factorytype == null) {
			return null;
		}
		if (SHAPE_FACTORY.equals(factorytype.toUpperCase())) {
			return new ShapeFactory();
		} else if (COLOR_FACTORY.equals(factorytype.toUpperCase())) {
			return new ColorFactory();
		}
		return null;
	}
}
