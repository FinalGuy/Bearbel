package de.tfojuth.projects.teamworker.blgexport.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: tfojuth
 * Date: 19.02.12
 * Time: 19:01
 * To change this template use File | Settings | File Templates.
 */
public class ShiftSchedule {

    private List<EmployeeSchedule> employeeSchedules = new ArrayList<EmployeeSchedule>();

    public void addEmployeeSchedule(EmployeeSchedule employeeSchedule) {
        employeeSchedules.add(employeeSchedule);
    }

    public List<EmployeeSchedule> getEmployeeSchedules() {
        return employeeSchedules;
    }

    public void setEmployeeSchedules(List<EmployeeSchedule> employeeSchedules) {
        this.employeeSchedules = employeeSchedules;
    }


}
