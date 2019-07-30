package com.cts.collectionsdemo;

public class Employee implements Comparable<Employee>{
	
	private Integer id;
	
	private String name;
	
	private Double salary;
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
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
