package org.designpatterns.strategy;

public class SportsCarBehavior implements CarBehavior {

	@Override
	public void drive() {

		System.out.println("Speeding at 100 miles per hour ...");

	}

}
