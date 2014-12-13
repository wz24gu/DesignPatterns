package org.designpatterns.abstractfactory;

public class GetShapeFactory {
	
	public static ShapeFactory getShapeFactory(String type) {
		
		ShapeFactory shapeFactory = null;
		
		if (type.equals("simple")) {
			shapeFactory = new SimpleShapeFactory();
		}
		else if (type.equals("complex")) {
			shapeFactory = new ComplexShapeFactory();
		}
		
		return shapeFactory;
	}

}
