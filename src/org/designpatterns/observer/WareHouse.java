package org.designpatterns.observer;

import java.util.ArrayList;

public class WareHouse implements Publisher {
	
	private ArrayList<Observer> observerList;
	private int numOfProducts;
	private int numOfTools;
	
	public WareHouse() {
		observerList = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observerList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int index = observerList.indexOf(o);
		
		if (index >= 0) {
			observerList.remove(o);
		} else {
			System.out.println("This observer is not registered yet.");
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observerList.size(); i++) {
			Observer ob = observerList.get(i);
			ob.update(numOfProducts, numOfTools);
		}
	}
	
	public void stockUpdated() {
		notifyObservers();
	}
	
	public int getNumOfProdcts() {
		return numOfProducts;
	}

	public void setNumOfProdcts(int numOfProdcts) {
		this.numOfProducts = numOfProdcts;
		stockUpdated();
	}

	public int getNumOfTools() {
		return numOfTools;
	}

	public void setNumOfTools(int numOfTools) {
		this.numOfTools = numOfTools;
		stockUpdated();
	}
	
	public void setAll(int numOfProducts, int numOfTools) {
		this.numOfProducts = numOfProducts;
		this.numOfTools = numOfTools;
		stockUpdated();
	}

}
