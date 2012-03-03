package de.tfojuth.projects.teamworker.blgexport.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component("employeeAssignmentDao")
public class EmployeeAssignmentDaoDummy implements EmployeeAssignmentDao {
    @Override
    public EmployeeAssignment create() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<EmployeeAssignment> findByDate(Date date) {
        EmployeeAssignment employeeAssignment1 = new EmployeeAssignment();
        employeeAssignment1.setAssignment(new AssignmentDaoDummy().findAll().get(0));
        employeeAssignment1.setDate(new Date());
        employeeAssignment1.setEmployee(new EmployeeDaoDummy().getEmployees().get(0));
        EmployeeAssignment employeeAssignment2 = new EmployeeAssignment();
        employeeAssignment2.setAssignment(new AssignmentDaoDummy().findAll().get(0));
        employeeAssignment2.setDate(new Date());
        employeeAssignment2.setEmployee(new EmployeeDaoDummy().getEmployees().get(1));

        List<EmployeeAssignment> employeeAssignments = new ArrayList<EmployeeAssignment>();
        employeeAssignments.add(employeeAssignment1);
        employeeAssignments.add(employeeAssignment2);
        return employeeAssignments;
    }

    @Override
    public EmployeeAssignment update(EmployeeAssignment employeeAssignment) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public EmployeeAssignment delete(EmployeeAssignment employeeAssignment) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
