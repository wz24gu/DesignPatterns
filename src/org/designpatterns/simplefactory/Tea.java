package org.designpatterns.simplefactory;

import java.util.ArrayList;

public abstract class Tea {
	
	String name;
	String material;
	ArrayList<String> condiments = new ArrayList<String>();
	
	public String getName() {
		return name;
	}
	
	public void prepare() {
		System.out.println("Preparing " + name + " ...");
		System.out.println("Boil a kettle of clean water ...");
		System.out.println("Put " + material + " into the cup ...");
	}
	
	public void brew() {
		System.out.println("Pour boiling water into the cup ...");
		System.out.println("and wait for five minutes ...");
	}
	
	public void addCondiments(ArrayList<String> condiments) {
		if (condiments.size() > 0) {
			for (int i = 0; i < condiments.size(); i++) {
				System.out.println("Put " + condiments.get(i) + " into the tea ...");
			}
		}
		
		System.out.println("Ready to server and enjoy!");
		System.out.println("**********");
	}

}
