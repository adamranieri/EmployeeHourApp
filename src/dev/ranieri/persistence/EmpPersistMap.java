package dev.ranieri.persistence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import dev.ranieri.entities.Employee;

public class EmpPersistMap implements EmployeePersistence {

	
	@Override
	public Employee saveEmployee(Employee emp) {
		try {

			FileOutputStream file = new FileOutputStream(emp.getName() + ".txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(emp);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return emp;
	}

	@Override
	public Employee getEmployeeByName(String name) {
      
		try {
			FileInputStream file = new FileInputStream(name+".txt");
			ObjectInputStream in = new ObjectInputStream(file); 
		    Employee emp =  (Employee) in.readObject(); 
		    in.close();
		    return emp;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
       
		return null;
          
       
	}

}
