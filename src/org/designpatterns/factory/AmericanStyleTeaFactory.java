package org.designpatterns.factory;

public class AmericanStyleTeaFactory extends TeaFactory {

	@Override
	public Tea createTea() {
		return new AmericanStyleTea();
	}

}
