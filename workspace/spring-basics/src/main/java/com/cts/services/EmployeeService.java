package com.cts.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entities.Employee;
import com.cts.repos.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public void addEmployee(Employee employee){
		employeeRepository.addEmployee(employee);
	}

	public Employee findEmployee(int id) {
		if(id<0){
			throw new RuntimeException("Id's are only postive value");
		}
		return employeeRepository.findEmployee(id);
	}

	public Employee deleteEmployee(int id) {
		return employeeRepository.deleteEmployee(id);
		
	}

	public List<Employee> findAllEmployees() {
		return employeeRepository.findAllEmployees();
	}

}
