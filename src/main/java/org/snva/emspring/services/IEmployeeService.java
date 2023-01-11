package org.snva.emspring.services;


import org.snva.emspring.bean.Employee;
import org.snva.emspring.services.exception.EmployeeServiceException;

import java.util.List;

/**
 * IEmployeeService is an interface which defines various abstract functions
 * for the service layer.
 */
public interface IEmployeeService
{
	public void addNewEmployee(Employee employee);
	public void removeEmployeeByName(List<Employee> employeelist);
	public List<Employee> showAllEmployeeInformation() throws EmployeeServiceException;
	
}
