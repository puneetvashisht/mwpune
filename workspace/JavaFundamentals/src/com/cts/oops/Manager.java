package com.cts.oops;

public class Manager extends Employee{
	
	int numberOfEmployees;

	public Manager(int id, String name, double salary, int numberOfEmployees) {
		super(id, name, salary);
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public String toString() {
		return "Manager [numberOfEmployees=" + numberOfEmployees + ", getAddress()=" + getAddress() + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getSalary()=" + getSalary() + "]";
	}

//	@Override
//	public String toString() {
//		return "Manager [numberOfEmployees=" + numberOfEmployees + ", getId()=" + getId() + ", getName()=" + getName()
//				+ ", getSalary()=" + getSalary() + "]";
//	}
//
//	
	

}
