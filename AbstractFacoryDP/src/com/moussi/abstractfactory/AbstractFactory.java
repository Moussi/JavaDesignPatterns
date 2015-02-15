package com.moussi.abstractfactory;

import com.moussi.factory.color.Color;
import com.moussi.factory.shape.Shape;

/**
 * Create an Abstract class to get factories for Color and Shape Objects.
 * @author Aymen
 *
 */
public abstract class AbstractFactory {
	
	public abstract Color getColor(String color);

	public abstract Shape getShape(String shape);
}
