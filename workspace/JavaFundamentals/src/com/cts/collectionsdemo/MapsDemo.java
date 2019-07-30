package com.cts.collectionsdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.SynchronousQueue;
import java.util.Set;

public class MapsDemo {

	public static void main(String[] args) {
		Map<Long, Employee> employeeMap = new HashMap<>();
		
		Employee emp1 = new Employee(21, "Ravi", 40000.0);
		Employee emp2 = new Employee(3, "Priya", 30000.0);
		Employee emp3 = new Employee(5, "Satyam", 60000.0);
		
		employeeMap.put(9999888777l, emp1);
		employeeMap.put(9999888666l, emp2);
		employeeMap.put(9999888555l, emp3);
		
		Set<Long> keys = employeeMap.keySet();
		for(Long key : keys){
			System.out.println(employeeMap.get(key));
		}
		System.out.println(keys);
		
		Set<Map.Entry<Long,Employee>> entries = employeeMap.entrySet();
		for(Object entry: entries){
			System.out.println(entry);
		}
		System.out.println(entries);
		
	System.out.println(employeeMap);
		
		System.out.println(employeeMap.get(9999888666l));

	}

}
