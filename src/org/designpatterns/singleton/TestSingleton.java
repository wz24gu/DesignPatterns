package org.designpatterns.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		WaterBoilerSingleton waterBoiler_1 = WaterBoilerSingleton.getInstance();
		waterBoiler_1.fill();
		waterBoiler_1.boil();
		waterBoiler_1.drain();
		
		WaterBoilerSingleton waterBoiler_2 = WaterBoilerSingleton.getInstance();
		waterBoiler_2.fill();
		waterBoiler_2.boil();
		waterBoiler_2.drain();

	}

}
