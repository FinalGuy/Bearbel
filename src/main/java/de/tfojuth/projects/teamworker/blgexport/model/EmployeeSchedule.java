package de.tfojuth.projects.teamworker.blgexport.model;

/**
 * Created by IntelliJ IDEA.
 * User: tfojuth
 * Date: 19.02.12
 * Time: 18:58
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeSchedule {

    private Employee employee;
    private String shiftMode;


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getShiftMode() {
        return shiftMode;
    }

    public void setShiftMode(String shiftMode) {
        this.shiftMode = shiftMode;
    }

    @Override
    public String toString() {
        return "EmployeeSchedule{" +
                "employee=" + employee +
                ", shiftMode='" + shiftMode + '\'' +
                '}';
    }
}
