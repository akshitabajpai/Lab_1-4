package com.org.lab1.employee.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.org.lab1.collection.Collection;
import com.org.lab1.employee.Employee;
import com.org.lab1.employee.dao.interfac.EmployeeDaoInterface;

@Component
public class EmployeeDao implements EmployeeDaoInterface{
ApplicationContext me =new AnnotationConfigApplicationContext(Collection.class);

public Employee getEmpById(int id)
{
List<Employee> emp_list= (List<Employee>) me.getBean("getEmpList");
for(Employee emp:emp_list)
{
	if (emp.getId()==id)
	{
		return emp;
	}
}
return null;

}
}
