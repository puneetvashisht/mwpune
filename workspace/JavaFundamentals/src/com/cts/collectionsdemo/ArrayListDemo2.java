package com.cts.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		
		ArrayList<Employee> employees = new ArrayList<>();
		
		Employee emp1 = new Employee(21, "Ravi", 30000.0);
		Employee emp2 = new Employee(3, "Priya", 30000.0);
		Employee emp3 = new Employee(5, "Satyam", 60000.0);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		Collections.sort(employees);

		
		System.out.println(employees.contains(new Employee(5, "Satyam", 60000.0)));
		
		
	
		System.out.println(employees);

	}

}
