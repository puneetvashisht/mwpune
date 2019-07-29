package test.cts;

import com.cts.oops.Address;
import com.cts.oops.Employee;
import com.cts.oops.Increment;
import com.cts.oops.Manager;

public class TestEmployee {
	
	public static void main(String[] args) {
		Address address1 = new Address(23, "Hinjawadi", "Pune");
				
		
		
		Employee emp = new Employee(2, "Ravi", 30000.0);
		emp.setAddress(address1);
		System.out.println(emp);
		
		Increment.incrementSalary(emp);
		
		System.out.println(emp);
		
		
		Manager manager = new Manager(3, "Priya", 40000.0, 3);
		manager.setAddress(address1);
		System.out.println(manager);
		
		Increment.incrementSalary(manager);
		
		System.out.println(manager);
		
	}

}
