package org.designpatterns.strategy;

public class Mustang extends Car {

	public Mustang() {
		setCarBehavior(new SportsCarBehavior());
	}

}
