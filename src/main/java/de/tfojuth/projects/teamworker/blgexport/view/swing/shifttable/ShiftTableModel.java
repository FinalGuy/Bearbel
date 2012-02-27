package de.tfojuth.projects.teamworker.blgexport.view.swing.shifttable;

import de.tfojuth.projects.teamworker.blgexport.model.Employee;
import de.tfojuth.projects.teamworker.blgexport.model.EmployeeSchedule;
import de.tfojuth.projects.teamworker.blgexport.model.ShiftSchedule;
import org.springframework.util.Assert;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: tfojuth
 * Date: 19.02.12
 * Time: 19:09
 * To change this template use File | Settings | File Templates.
 */
public class ShiftTableModel implements TableModel {

    private List<EmployeeSchedule> employeeSchedules;
    private List<TableModelListener> modelListeners = new ArrayList<TableModelListener>();

    private final String[] COLUMN_LABELS = {"Vorname", "Nachname", "Personal#", "Karten#", "Qualifikation", "Schichtmodus", "Kostenstelle", "Programm"};
    private final Class[] COLUMN_CLASSES = {String.class, String.class, Long.TYPE, Long.TYPE, String.class, String.class, String.class, String.class};

    public ShiftTableModel(ShiftSchedule shiftSchedule) {
        this.employeeSchedules = shiftSchedule.getEmployeeSchedules();
    }

    @Override
    public int getRowCount() {
        return employeeSchedules.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_LABELS.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        Assert.isTrue(columnIndex < COLUMN_LABELS.length);
        return COLUMN_LABELS[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return COLUMN_CLASSES[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EmployeeSchedule employeeSchedule = employeeSchedules.get(rowIndex);
        Employee employee = employeeSchedule.getEmployee();
        switch (columnIndex) {
            case 0:
                return employee.getFirstName();
            case 1:
                return employee.getLastName();
            case 2:
                return employee.getEmployeeId();
            case 3:
                return employeeSchedule.getShiftMode();
            default:
                //throw new IllegalArgumentException("Invalid column index");
                return "<unknown>";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        EmployeeSchedule employeeSchedule = employeeSchedules.get(rowIndex);
        Employee employee = employeeSchedule.getEmployee();
        switch (columnIndex) {
            case 0:
                employee.setFirstName((String) aValue);
                break;
            case 1:
                employee.setLastName((String) aValue);
                break;
            case 2:
                employee.setEmployeeId((Long) aValue);
                break;
            case 3:
                employeeSchedule.setShiftMode((String) aValue);
                break;
            default:
                throw new IllegalArgumentException("Invalid column index " + columnIndex);
        }
        for (TableModelListener listener : modelListeners) {
            listener.tableChanged(new TableModelEvent(this));
        }
    }

    @Override
    public void addTableModelListener(TableModelListener listener) {
        modelListeners.add(listener);
    }

    @Override
    public void removeTableModelListener(TableModelListener listener) {
        modelListeners.remove(listener);
    }
}
