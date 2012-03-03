package de.tfojuth.projects.teamworker.blgexport.model;

import java.util.Date;

public class EmployeeAssignment {

    private Employee employee;
    private Assignment assignment;
    private Date date;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
