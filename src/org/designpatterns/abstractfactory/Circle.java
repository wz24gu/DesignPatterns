package org.designpatterns.abstractfactory;

public class Circle implements Shape {
	
	private int x;
	private int y;
	private double radious;

	@Override
	public void draw() {
		
		System.out.println("Drawing a circle ...");
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getRadious() {
		return radious;
	}

	public void setRadious(double radious) {
		this.radious = radious;
	}

}
