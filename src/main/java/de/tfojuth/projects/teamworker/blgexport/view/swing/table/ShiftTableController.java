package de.tfojuth.projects.teamworker.blgexport.view.swing.table;

import de.tfojuth.projects.teamworker.blgexport.controller.ScheduleGateway;
import de.tfojuth.projects.teamworker.blgexport.model.ShiftSchedule;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 * Created by IntelliJ IDEA.
 * User: tfojuth
 * Date: 19.02.12
 * Time: 19:49
 * To change this template use File | Settings | File Templates.
 */
@Component
public class ShiftTableController implements TableModelListener {

    @Resource
    private ScheduleGateway scheduleGateway;

    public JTable getShiftTable() {
        ShiftSchedule shiftSchedule = scheduleGateway.getActualShiftScheduleForCalendarWeek();
        ShiftTableModel shiftTableModel = new ShiftTableModel(shiftSchedule);
        shiftTableModel.addTableModelListener(this);
        return new JTable(shiftTableModel);
    }

    @Override
    public void tableChanged(TableModelEvent e) {
        System.out.println(e.getType());
        System.out.println(e.getSource());
        System.out.println(e.getColumn());
    }
}
