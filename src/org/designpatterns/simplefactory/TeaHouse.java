package org.designpatterns.simplefactory;

public class TeaHouse {
	
	SimpleTeaFactory teaFactory;
	
	public TeaHouse(SimpleTeaFactory teaFactory) {
		this.teaFactory = teaFactory;
	}
	
	public void makeTea(String type) {
		Tea tea = teaFactory.createTea(type);
		
		tea.prepare();
		tea.brew();
		tea.addCondiments(tea.condiments);
	}

}
