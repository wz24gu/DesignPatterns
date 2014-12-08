package org.designpatterns.decorator;

public class Chocolate extends CondimentDecorator {
	
	public Chocolate(Beverage beverage) {
		description = "Chocolate";
		price = 0.30;
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + " + " + description;
	}

	@Override
	public double cost() {
		return beverage.cost() + price;
	}

}
