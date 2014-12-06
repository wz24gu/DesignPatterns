package org.designpatterns.strategy;

public class TestStrategy {

	public static void main(String[] args) {

		Car car_1 = new Toyota();
		Car car_2 = new Mustang();
		
		car_1.performBehavior();
		car_2.performBehavior();
		
		car_1.setCarBehavior(new SportsCarBehavior());
		car_1.performBehavior();

	}

}
