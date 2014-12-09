package org.designpatterns.factory;

public class ChineseStyleTeaFactory extends TeaFactory {

	@Override
	public Tea createTea() {
		return new ChineseStyleTea();
	}

}
