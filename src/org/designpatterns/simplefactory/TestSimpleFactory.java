package org.designpatterns.simplefactory;

public class TestSimpleFactory {

	public static void main(String[] args) {
		
		SimpleTeaFactory teaFactory = new SimpleTeaFactory();
		TeaHouse teaHouse = new TeaHouse(teaFactory);
		
		teaHouse.makeTea("Chinese");
		teaHouse.makeTea("American");

	}

}
