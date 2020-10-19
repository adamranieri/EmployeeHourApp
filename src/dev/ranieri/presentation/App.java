package dev.ranieri.presentation;

import java.util.Scanner;

import dev.ranieri.entities.Employee;
import dev.ranieri.services.EmpServImpl;
import dev.ranieri.services.EmployeeService;

public class App {

	private static EmployeeService empServ = new EmpServImpl();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee emp = null; // I want this employee variable available in entire method
		System.out.println("Welcome to the Employee PTO tracker");

		boolean notLoggedIn = true;
		while (notLoggedIn) {

			System.out.println("login: 1, create account: 2 ");
			int choice = scan.nextInt();

			switch (choice) {

			case 1: {
				System.out.println("Login with your username");
				String username = scan.next();
				emp = empServ.login(username);
				notLoggedIn = false;
				break;
			}
			case 2: {
				System.out.println("Create our account by creating a username");
				String username = scan.next();
				emp = empServ.enrollEmployee(username);
				notLoggedIn = false;
				break;
			}
			}

		}

		System.out.println("Welcome " + emp.getName());
		
		System.out.println("add hours: 1 , take PTO: 2");
		int choice = scan.nextInt();
		
		switch(choice) {
		
		case 1: {
			System.out.println("How many hours did you work this week?");
			double hours = scan.nextDouble();
			empServ.addHoursWorked(emp, hours);
			System.out.println("You hours have been logged");
			System.out.println("Total hours: " +emp.getTotalHours() + " PTO :" + emp.getPto());
			break;
		} 
		case 2: {
			System.out.println("How many hours of PTO are you taking?");
			double hours = scan.nextDouble();
			empServ.takePto(emp, hours);
			System.out.println("Your PTO has been logged");
			System.out.println("Total hours: " +emp.getTotalHours() + " PTO :" + emp.getPto());
			break;
		}
		
		}
		

	}

}
