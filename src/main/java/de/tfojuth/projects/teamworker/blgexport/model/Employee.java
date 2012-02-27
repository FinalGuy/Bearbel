package de.tfojuth.projects.teamworker.blgexport.model;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: tfojuth
 * Date: 19.02.12
 * Time: 18:59
 * To change this template use File | Settings | File Templates.
 */
public class Employee {

    private String firstName;
    private String lastName;
    private long employeeId;
    private long timeCardId;
    private Date dateOfJoining;

    public Employee(String firstName, String lastNAme, long employeeId) {
        this.firstName = firstName;
        this.lastName = lastNAme;
        this.employeeId = employeeId;
    }

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
