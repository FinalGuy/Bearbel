package de.tfojuth.projects.teamworker.blgexport.model;


import java.util.List;

public interface EmployeeDao {

    Employee createEmployee();

    List<Employee> getEmployees();

    Employee findById(long employeeId);

    Employee updateEmployee(Employee employee);

    Employee deleteEmployee(Employee employee);


}
