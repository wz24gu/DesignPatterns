package org.designpatterns.observer;

public class LocalStore implements Observer {
	
	private int numOfProducts;
	private int numOfTools;
	Publisher wareHouse;
	
	public LocalStore(Publisher wareHouse) {
		this.wareHouse = wareHouse;
		wareHouse.registerObserver(this);
	}
	
	@Override
	public void update(int numOfProducts, int numOfTools) {
		setNumOfProducts(numOfProducts);
		setNumOfTools(numOfTools);
	}
	
	public int getNumOfProducts() {
		return numOfProducts;
	}

	public void setNumOfProducts(int numOfProducts) {
		this.numOfProducts = numOfProducts;
	}

	public int getNumOfTools() {
		return numOfTools;
	}

	public void setNumOfTools(int numOfTools) {
		this.numOfTools = numOfTools;
	}

	@Override
	public void display() {
		System.out.println("Number of Products: " + numOfProducts);
		System.out.println("Number of Tools: " + numOfTools);
	}

}
