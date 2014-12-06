package org.designpatterns.strategy;

public class FamilyCarBehavior implements CarBehavior {

	@Override
	public void drive() {
		
		System.out.println("Driving at 60 miles per hour ...");

	}

}
