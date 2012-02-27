package de.tfojuth.projects.teamworker.blgexport.controller;

import de.tfojuth.projects.teamworker.blgexport.model.Employee;
import de.tfojuth.projects.teamworker.blgexport.model.EmployeeSchedule;
import de.tfojuth.projects.teamworker.blgexport.model.ShiftSchedule;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: tfojuth
 * Date: 19.02.12
 * Time: 19:00
 * To change this template use File | Settings | File Templates.
 */
@Component("scheduleGateway")
public class ScheduleGatewayImpl implements ScheduleGateway {

    @Override
    public ShiftSchedule getActualShiftScheduleForCalendarWeek() {
        ShiftSchedule shiftSchedule = new ShiftSchedule();
        EmployeeSchedule employeeSchedule = new EmployeeSchedule();
        employeeSchedule.setEmployee(new Employee("Hans-Peter", "Schmidt", 007));
        employeeSchedule.setShiftMode("Nachtschicht");
        shiftSchedule.addEmployeeSchedule(employeeSchedule);
        EmployeeSchedule employeeSchedule1 = new EmployeeSchedule();
        employeeSchedule1.setEmployee(new Employee("Karola", "Krauss", 014));
        employeeSchedule1.setShiftMode("Frühschicht");
        shiftSchedule.addEmployeeSchedule(employeeSchedule1);
        return shiftSchedule;
    }
}
