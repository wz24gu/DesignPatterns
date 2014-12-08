package org.designpatterns.decorator;

public class BlackTea extends Beverage {
	
	public BlackTea() {
		description = "Black Tea";
		price = 1.05;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return price;
	}

}
