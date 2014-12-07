package org.designpatterns.observer;

public class TestObserver {

	public static void main(String[] args) {
		
		WareHouse wareHouse = new WareHouse();
		
		LocalStore localStore_1 = new LocalStore(wareHouse);
		LocalStore localStore_2 = new LocalStore(wareHouse);
		
		wareHouse.setAll(100, 100);
		localStore_1.display();
		localStore_2.display();
		
		wareHouse.setAll(50, 150);
		localStore_1.display();
		localStore_2.display();
		
		wareHouse.setNumOfProdcts(200);
		localStore_1.display();
		localStore_2.display();
		
		wareHouse.setNumOfTools(300);
		localStore_1.display();
		localStore_2.display();
	}

}
