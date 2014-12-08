package org.designpatterns.decorator;

public abstract class Beverage {
	
	String description;
	double price;
	
	public String getDescription() {
		return description;
	}
	
	public void setDescprition(String description) {
		this.description = description;
	}
	
	public abstract double cost();

}
