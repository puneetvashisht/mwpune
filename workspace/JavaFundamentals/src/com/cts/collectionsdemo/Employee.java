package com.cts.collectionsdemo;

public class Employee implements Comparable<Employee>{
	
	private Integer id;
	
	private String name;
	
	private double salary;
	
	







	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}



	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}



	@Override
	public int compareTo(Employee o) {
//		if(this.id > o.id)
//			return 1;
//		else if(this.id == o.id)
//			return 0;
//		else return -1;
		return this.id.compareTo(o.id);
	}

	
	

}
