package org.designpatterns.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class TestAdapter {

	public static void main(String[] args) {
		
		String[] array = {"one", "two", "three", "four", "five"};
		
		System.out.println("Test Iterator to Enumeration Adapter");	
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
		Enumeration enumeration = new IteratorEnumerationAdapter(list.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println((String)enumeration.nextElement());
		}
		
		System.out.println("Test Enumeration to Iterator Adapter");
		
		Vector<String> vector = new Vector<String>(Arrays.asList(array));
		Iterator iterator = new EnumerationIteratorAdapter(vector.elements());
		while (iterator.hasNext()) {
			System.out.println((String)iterator.next());
		}

	}

}
