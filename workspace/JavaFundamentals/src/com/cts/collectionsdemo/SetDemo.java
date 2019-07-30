package com.cts.collectionsdemo;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
//		Set<Employee> employees = new HashSet<>();
		// Unordered & Unsorted
		
//		Set<Employee> employees = new LinkedHashSet<>();
		// Ordered - Insertion order & Unsorted
		
		Set<Employee> employees = new TreeSet<>(new SalaryComparator());
		// UnOrdered order & Sorted
		
		Employee emp1 = new Employee(21, "Ravi", 40000.0);
		Employee emp2 = new Employee(3, "Priya", 30000.0);
		Employee emp3 = new Employee(5, "Satyam", 60000.0);
		Employee emp4 = new Employee(5, "Satyam", 60000.0);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
		System.out.println(employees);
		
		System.out.println(employees.contains(new Employee(3, "Priya", 30000.0)));
		

	}

}
