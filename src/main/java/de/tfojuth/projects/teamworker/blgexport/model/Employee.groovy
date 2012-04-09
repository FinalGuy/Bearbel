package de.tfojuth.projects.teamworker.blgexport.model;


public class Employee {

    String firstName
    String lastName
    long employeeId
    long timeCardId
    Date dateOfJoining

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
