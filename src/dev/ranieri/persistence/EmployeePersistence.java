package dev.ranieri.persistence;

import dev.ranieri.entities.Employee;

public interface EmployeePersistence {
	
	Employee saveEmployee(Employee emp);
	
	Employee getEmployeeByName(String name);
}
