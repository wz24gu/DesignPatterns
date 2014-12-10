package org.designpatterns.simplefactory;

public class SimpleTeaFactory {
	
	public Tea createTea(String type) {
		
		if (type.equals("Chinese")) {
			return new ChineseStyleTea();
		} else if (type.equals("American")) {
			return new AmericanStyleTea();
		} else {
			return null;
		}
		
	}

}
