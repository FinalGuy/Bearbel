package de.tfojuth.projects.teamworker.blgexport.view.swing.table.column

import de.tfojuth.projects.teamworker.blgexport.model.Employee
import javax.swing.JTable
import javax.swing.JTextField
import javax.swing.table.TableCellRenderer
import org.springframework.stereotype.Component

@Component
class EmployeeCellRenderer implements TableCellRenderer {

    @Override
    java.awt.Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Employee employee = value;
        JTextField textField = new JTextField()
        textField.text = employee.lastName + ", " + employee.firstName + " [" + employee.employeeId + ']'
        textField.editable = false
        return textField
    }
}
