package org.designpatterns.singleton;

public class WaterBoilerSingleton {
	
	private boolean empty;
	private boolean boiled;
	private static WaterBoilerSingleton uniqueWaterBoiler;
	
	private WaterBoilerSingleton() {
		empty = true;
		boiled = false;
	}
	
	public static WaterBoilerSingleton getInstance() {
		
		if (uniqueWaterBoiler == null) {
			System.out.println("Making a new waterboiler");
			uniqueWaterBoiler = new WaterBoilerSingleton();
		} else {
			System.out.println("Returning an existing waterboiler");
		}
		
		return uniqueWaterBoiler;
	}
	
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			System.out.println("Filling water ...");
		}
	}
	
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			boiled = true;
			System.out.println("Boiling ...");
		}
	}
	
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			empty = true;
			boiled =false;
			System.out.println("Draining the boiler ...");
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}

}
