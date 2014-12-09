package org.designpatterns.factory;

import java.util.ArrayList;

public abstract class Tea {
	
	String name;
	String material;
	ArrayList<String> condiments = new ArrayList<String>();
	
	void prepare() {
		System.out.println("Boil a kettle of clean water ...");
		System.out.println("Put " + material + " into a cup ...");
	}
	
	void brew() {
		System.out.println("Pour boiling water into the cup ...");
		System.out.println("and wait for five minutes ...");
	}
	
	void addCondiments(ArrayList<String> condiments) {
		
		if (condiments.size() > 0) {
			for (int i=0; i < condiments.size(); i++) {
				System.out.println("Put " + condiments.get(i) + " into the cup");
			}
		}
		
		System.out.println("Ready to serve ...");
		System.out.println("**********");
	}
	
	public String getName() {
		return name;
	}

}
