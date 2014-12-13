package org.designpatterns.abstractfactory;

public class ComplexShapeFactory extends ShapeFactory {

	@Override
	public Shape getShape(String type) {

		Shape shape = null;
		
		if (type.equals("ellipse")) {
			shape = new Ellipse();
		}
		
		return shape;
	}

}
