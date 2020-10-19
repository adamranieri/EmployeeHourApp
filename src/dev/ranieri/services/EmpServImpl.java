package dev.ranieri.services;

import dev.ranieri.entities.Employee;
import dev.ranieri.persistence.EmpPersistMap;
import dev.ranieri.persistence.EmployeePersistence;

public class EmpServImpl implements EmployeeService {

	private static EmployeePersistence persistor = new EmpPersistMap();
	@Override
	public Employee enrollEmployee(String username) {		
		Employee emp = new Employee(username,0,0);
		return persistor.saveEmployee(emp);
	}

	@Override
	public Employee login(String username) {			
		return persistor.getEmployeeByName(username);
	}

	@Override
	public boolean addHoursWorked(Employee emp, double hours) {
		emp.setTotalHours(emp.getTotalHours() + hours);
		emp.setPto(emp.getPto() + (hours*.10));
		persistor.saveEmployee(emp);
		return true;
	}

	@Override
	public boolean takePto(Employee emp, double hours) {
		emp.setPto(emp.getPto() - hours);
		persistor.saveEmployee(emp);
		return true;
	}

}
