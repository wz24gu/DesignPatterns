package org.designpatterns.factory;

public class TestFactory {

	public static void main(String[] args) {
		TeaFactory chineseTeaHouse = new ChineseStyleTeaFactory();
		TeaFactory americanTeaHouse = new AmericanStyleTeaFactory();
		
		chineseTeaHouse.makeTea();
		americanTeaHouse.makeTea();

	}

}
