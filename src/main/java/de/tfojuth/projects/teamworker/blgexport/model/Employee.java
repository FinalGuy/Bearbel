package de.tfojuth.projects.teamworker.blgexport.model;

import java.util.Date;

public class Employee {

    private String firstName;
    private String lastName;
    private long employeeId;
    private long timeCardId;
    private Date dateOfJoining;

    public long getTimeCardId() {
        return timeCardId;
    }

    public void setTimeCardId(long timeCardId) {
        this.timeCardId = timeCardId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeId=" + employeeId +
                ", timeCardId=" + timeCardId +
                ", dateOfJoining=" + dateOfJoining +
                '}';
    }
}
