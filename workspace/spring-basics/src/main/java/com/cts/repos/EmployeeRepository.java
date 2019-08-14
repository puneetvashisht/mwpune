package com.cts.repos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.entities.Employee;

@Repository
public class EmployeeRepository {
	
//	Map<Integer, Employee> employees = new HashMap<>();
	
	//JDBC code 
	
	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	public EmployeeRepository(){
		
	}
	@PostConstruct
	public void init(){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addEmployee(Employee employee){
		
		String sql = "INSERT INTO Employee (id, name, EMP_SALARY) VALUES (?, ?, ?)";
		
		int count = jdbcTemplate.update(
				sql,
			    employee.getId(), employee.getName(), employee.getSalary()
			);
		System.out.println(count);
	}

	public Employee findEmployee(int id) {
//		return employees.get(id);
		String sql = "select * from Employee where id=?";

		Object args[] = {id};
		
		Employee emp =jdbcTemplate.queryForObject(sql, args, new RowMapper<Employee>(){
			@Override
			public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				return emp;
			}
			
		});
		
	
		return emp;
	}

	public Employee deleteEmployee(int id) {

		String sql = "DELETE FROM Employee WHERE id=?";
		int count = jdbcTemplate.update(sql, id);
		System.out.println(count);
		return null;
		
	}
	public List<Employee> findAllEmployees() {
		
		String sql = "select * from Employee";
		List<Employee> employees = this.jdbcTemplate.query(sql, new RowMapper<Employee>(){
			@Override
			public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				return emp;
			}
			
		});
		return employees;
	}


}
