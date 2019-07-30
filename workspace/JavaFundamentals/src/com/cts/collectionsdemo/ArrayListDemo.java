package com.cts.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Grapes");
//		fruits.add(1);
		
//		fruits.addAll(c)
		
		System.out.println(fruits.contains("Mango"));
		
		Collections.sort(fruits);
		
		
		for(String fruit: fruits){
			System.out.println(fruit);
//			String f = (String) fruit;
			System.out.println(fruit.charAt(0));
		}
		System.out.println(fruits);

	}

}
