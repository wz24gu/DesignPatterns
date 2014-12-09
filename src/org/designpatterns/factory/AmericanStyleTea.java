package org.designpatterns.factory;

public class AmericanStyleTea extends Tea {
	
	public AmericanStyleTea() {
		name = "American Style Tea";
		material = "tea bag";
		condiments.add("milk");
		condiments.add("sugar");
	}

}
