package org.designpatterns.decorator;

public class GreenTea extends Beverage {
	
	public GreenTea() {
		description = "Green Tea";
		price = 1.00;
	}
	
	@Override
	public double cost() {
		return price;
	}

}
