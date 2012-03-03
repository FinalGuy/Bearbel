package de.tfojuth.projects.teamworker.blgexport.view.swing.table;

import de.tfojuth.projects.teamworker.blgexport.model.Employee;
import de.tfojuth.projects.teamworker.blgexport.model.EmployeeAssignment;
import org.springframework.util.Assert;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;

public class ShiftTableModel implements TableModel {


    private List<EmployeeAssignment> employeeAssignments;
    private List<TableModelListener> modelListeners = new ArrayList<TableModelListener>();


    private final String[] COLUMN_LABELS = {
            "Vorname", "Nachname",
            "Personal#", "Karten#",
            "Qualifikation", "Schichtmodus",
            "Kostenstelle", "Programm"};

    public ShiftTableModel(List<EmployeeAssignment> employeeAssignments) {
        this.employeeAssignments = employeeAssignments;
    }

    @Override
    public int getRowCount() {
        return employeeAssignments.size();
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
        return getValueAt(0, columnIndex).getClass();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EmployeeAssignment EmployeeAssignment = employeeAssignments.get(rowIndex);
        Employee employee = EmployeeAssignment.getEmployee();
        switch (columnIndex) {
            case 0:
                return employee.getFirstName();
            case 1:
                return employee.getLastName();
            case 2:
                return employee.getEmployeeId();
            case 3:
                return EmployeeAssignment.getAssignment().getDepartment();
            default:
                //throw new IllegalArgumentException("Invalid column index");
                return "<unknown>";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        EmployeeAssignment EmployeeAssignment = employeeAssignments.get(rowIndex);
        Employee employee = EmployeeAssignment.getEmployee();
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
                EmployeeAssignment.getAssignment().setDepartment((String)aValue);
                break;
            default:
                throw new IllegalArgumentException("Invalid column index " + columnIndex);
        }
        for (TableModelListener listener : modelListeners) {
            listener.tableChanged(new TableModelEvent(this, rowIndex, rowIndex, columnIndex));
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
