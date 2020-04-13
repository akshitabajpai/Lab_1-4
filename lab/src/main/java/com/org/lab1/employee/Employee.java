package com.org.lab1.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
 private int id;
 private String name;
 private double salary;
 
 @Autowired
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
 public Employee(int id, String name, double salary)
{
	 super();
	this.id=id;
	this.name=name;
	this.salary=salary;
}
public int getId() {
	return id;
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
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
 
}