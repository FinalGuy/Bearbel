package de.tfojuth.projects.teamworker.blgexport.model;

import groovy.ui.SystemOutputInterceptor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeDaoDummy implements EmployeeDao {

    @Override
    public Employee createEmployee() {
        System.out.println("Dummy Employee DAO called (CREATE)");
        return new Employee();
    }

    @Override
    public List<Employee> getEmployees() {
        System.out.println("Dummy Employee DAO called (GET ALL)");
        Employee employee1 = new Employee();
        employee1.setEmployeeId(1l);
        employee1.setFirstName("Hannes");
        employee1.setLastName("Wader");
        employee1.setTimeCardId(23l);
        employee1.setDateOfJoining(new Date());
        Employee employee2 = new Employee();
        employee2.setEmployeeId(2l);
        employee2.setFirstName("Reinhard");
        employee2.setLastName("Mey");
        employee2.setTimeCardId(42l);
        employee2.setDateOfJoining(new Date());
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        return employees;
    }

    @Override
    public Employee findById(long employeeId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        System.out.println("Dummy Employee DAO called (UPDATE)");
        return employee;
    }

    @Override
    public Employee deleteEmployee(Employee employee) {
        System.out.println("Dummy Employee DAO called (DELETE)");
        return employee;
    }
}
