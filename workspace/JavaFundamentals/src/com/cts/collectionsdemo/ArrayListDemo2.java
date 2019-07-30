package com.cts.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		
		List<Employee> employees = new LinkedList<>();
		
		
		
		Employee emp1 = new Employee(21, "Ravi", 40000.0);
		Employee emp2 = new Employee(3, "Priya", 30000.0);
		Employee emp3 = new Employee(5, "Satyam", 60000.0);
		Employee emp4 = new Employee(5, "Satyam", 60000.0);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(0,emp4);
		
		
//		Collections.sort(employees, new Comparator<Employee>(){
//			@Override
//			public int compare(Employee o1, Employee o2) {		
//				return o1.getSalary().compareTo(o2.getSalary());
//			}
//			
//		});

		
		System.out.println(employees.contains(new Employee(5, "Satyam", 60000.0)));
		
		
	
		System.out.println(employees.get(0));
		
		for(Employee e: employees){
			System.out.println(e);
		}

	}

}
