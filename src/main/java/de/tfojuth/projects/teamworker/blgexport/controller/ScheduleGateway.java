package de.tfojuth.projects.teamworker.blgexport.controller;

import de.tfojuth.projects.teamworker.blgexport.model.ShiftSchedule;

/**
 * Created by IntelliJ IDEA.
 * User: tfojuth
 * Date: 19.02.12
 * Time: 11:20
 * To change this template use File | Settings | File Templates.
 */
public interface ScheduleGateway {

    ShiftSchedule getActualShiftScheduleForCalendarWeek();

}
