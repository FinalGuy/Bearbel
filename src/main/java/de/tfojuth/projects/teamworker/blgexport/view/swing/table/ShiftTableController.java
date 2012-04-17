package de.tfojuth.projects.teamworker.blgexport.view.swing.table;

import de.tfojuth.projects.teamworker.blgexport.model.EmployeeAssignmentDao;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

@Component
public class ShiftTableController implements TableModelListener {

    @Resource
    private EmployeeAssignmentDao employeeAssignmentDao;

    @Resource
    private ShiftTableColumnModel shiftTableColumnModel;

    public JTable getShiftTable() {
        ShiftTableModel shiftTableModel = new ShiftTableModel();
        shiftTableModel.addTableModelListener(this);
        return new JTable(shiftTableModel);
    }

    @Override
    public void tableChanged(TableModelEvent e) {
        System.out.println(e.getFirstRow());
        System.out.println(e.getSource());
        System.out.println(e.getColumn());
    }
}
