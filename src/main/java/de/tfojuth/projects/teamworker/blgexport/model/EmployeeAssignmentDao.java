package de.tfojuth.projects.teamworker.blgexport.model;

import java.util.Date;
import java.util.List;

public interface EmployeeAssignmentDao {

    EmployeeAssignment create();

    List<EmployeeAssignment> findByDate(Date date);

    EmployeeAssignment update(EmployeeAssignment employeeAssignment);

    EmployeeAssignment delete(EmployeeAssignment employeeAssignment);

}
