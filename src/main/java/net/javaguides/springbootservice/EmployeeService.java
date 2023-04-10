package net.javaguides.springbootservice;

import java.util.List;

import net.javaguides.springboot.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee getEmployeeById(long id);
	Employee updateEmployee(Employee employee, long id);
	void deleteEmployee(long id);
	
	
	
	
	
	
	

	
	

}
