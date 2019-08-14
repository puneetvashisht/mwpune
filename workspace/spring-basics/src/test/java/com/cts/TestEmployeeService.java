package com.cts;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cts.entities.Employee;
import com.cts.services.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestEmployeeService {
	
	@Autowired
	EmployeeService employeeService;
	

//	@Test
	public void testAddEmployee() {
		Employee employee = new Employee(1, "Ravi", 34454.34);
		employeeService.addEmployee(employee);
		
//		Employee emp = employeeService.findEmployee(1);
//		System.out.println(emp);
//		assertEquals("Check if name is Ravi", "Ravi", emp.getName() );
//		
//		Employee e = employeeService.deleteEmployee(1);
//		System.out.println(e);
//		assertEquals("Check if name is Ravi", "Ravi", e.getName() );
		
	}
//	@Test
	public void testDeleteEmployee(){
		employeeService.deleteEmployee(19);
		
	}
	
	@Test 
	public void testFindEmployee(){
		Employee emp = employeeService.findEmployee(21);
		System.out.println(emp);
		assertEquals("Check if name is Ravi Jerome", "Ravi Jerome", emp.getName() );
	}


}
