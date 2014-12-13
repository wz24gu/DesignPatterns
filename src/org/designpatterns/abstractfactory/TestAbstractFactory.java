package org.designpatterns.abstractfactory;

public class TestAbstractFactory {

	public static void main(String[] args) {

		ShapeFactory shapeFactory;
		Shape shape;
		
		shapeFactory = GetShapeFactory.getShapeFactory("simple");
		shape = shapeFactory.getShape("circle");
		shape.draw();
		
		shapeFactory = GetShapeFactory.getShapeFactory("complex");
		shape = shapeFactory.getShape("ellipse");
		shape.draw();

	}

}
