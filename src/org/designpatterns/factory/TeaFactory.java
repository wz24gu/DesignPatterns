package org.designpatterns.factory;

public abstract class TeaFactory {
	
	public abstract Tea createTea();
	
	public void makeTea() {
		Tea tea = createTea();
		System.out.println("Making " + tea.getName() + ":");
				
		tea.prepare();
		tea.brew();
		tea.addCondiments(tea.condiments);		
	}

}
