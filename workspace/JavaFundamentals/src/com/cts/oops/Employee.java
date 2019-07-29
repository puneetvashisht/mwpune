package com.cts.oops;

public class Employee {
	
	private int id;
	
	private String name;
	
	private double salary;

	private Address address;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	

	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public int getId() {
		if(this.id>0){
			return id;
		}
		return 0;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary>0){
			this.salary = salary;
		}
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

	
	

}
