package dev.ranieri.services;
import dev.ranieri.entities.Employee;

public interface EmployeeService {
	
	public Employee enrollEmployee(String username);
	
	public Employee login(String username);
	
	public boolean addHoursWorked(Employee emp, double hours);
	
	public boolean takePto(Employee emp, double hours);

}
