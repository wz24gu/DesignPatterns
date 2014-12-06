package org.designpatterns.strategy;

public abstract class Car {
	
	private CarBehavior carBehavior;
	
	public Car() {
		setCarBehavior(new FamilyCarBehavior());
	}
	
	public void setCarBehavior(CarBehavior cb) {
		carBehavior = cb;
	}
	
	public void performBehavior() {
		carBehavior.drive();
	}

}
