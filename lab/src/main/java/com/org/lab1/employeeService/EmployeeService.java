package com.org.lab1.employeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.lab1.employee.Employee;
import com.org.lab1.employee.dao.interfac.EmployeeDaoInterface;
import com.org.lab1.employee.service.interfac.EmployeeServiceInterface;

@Component
public class EmployeeService implements EmployeeServiceInterface {
    @Autowired
	EmployeeDaoInterface empdao;
	 public Employee getEmpById(int id)
	 {
	  return empdao.getEmpById(id);
	 }
}
