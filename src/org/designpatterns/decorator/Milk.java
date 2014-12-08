package org.designpatterns.decorator;

public class Milk extends CondimentDecorator {
	
	public Milk(Beverage beverage) {
		description = "Milk";
		price = 0.25;
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
