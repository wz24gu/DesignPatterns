package org.designpatterns.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		Beverage greenTea = new GreenTea();
		System.out.println(greenTea.getDescription());
		System.out.println(greenTea.cost());
		
		Beverage milk = new Milk(greenTea);
		System.out.println(milk.getDescription());
		System.out.println(milk.cost());
		
		Beverage blackTea = new BlackTea();
	    Beverage chocolate = new Chocolate(blackTea);
	    milk = new Milk(chocolate);
	    System.out.println(milk.getDescription());
		System.out.println(milk.cost());	

	}

}
