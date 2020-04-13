package com.org.lab1.collection;

import java.util.ArrayList;
import java.util.List;
import com.org.lab1.employee.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Collection {

	private List<Employee> emp_list= new ArrayList<Employee>();
	
	@Bean
	public List<Employee> getEmpList()
	{
		emp_list.add(new Employee(111, "ajay",90000.0));
		emp_list.add(new Employee(112,"vijay",75000.0));
		emp_list.add(new Employee(112,"jiya", 40000.0));
		emp_list.add(new Employee(113,"aditi",62000.0));
		
		return emp_list;
	}
}
