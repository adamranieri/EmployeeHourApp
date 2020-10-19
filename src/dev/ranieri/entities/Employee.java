package dev.ranieri.entities;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private String name;
	private double pto;
	private double totalHours;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, double pto, double totalHours) {
		super();
		this.name = name;
		this.pto = pto;
		this.totalHours = totalHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPto() {
		return pto;
	}

	public void setPto(double pto) {
		this.pto = pto;
	}

	public double getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(double totalHours) {
		this.totalHours = totalHours;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", pto=" + pto + ", totalHours=" + totalHours + "]";
	}
	
	

}
