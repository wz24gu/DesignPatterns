package org.designpatterns.abstractfactory;

public class SimpleShapeFactory extends ShapeFactory {

	@Override
	public Shape getShape(String type) {
		
		Shape shape = null;
		
		if (type.equals("circle")) {
			shape = new Circle();
		}
		else if (type.equals("cube")) {
			shape = new Cube();
		}
		
		return shape;
	}

}
