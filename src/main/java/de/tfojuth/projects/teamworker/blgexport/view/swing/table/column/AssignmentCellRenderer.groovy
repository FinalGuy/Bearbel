package de.tfojuth.projects.teamworker.blgexport.view.swing.table.column

import javax.swing.JTable
import javax.swing.table.TableCellRenderer
import org.springframework.stereotype.Component
import javax.swing.JTextField
import de.tfojuth.projects.teamworker.blgexport.model.Assignment

@Component
class AssignmentCellRenderer implements TableCellRenderer {

    @Override
    java.awt.Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Assignment assignment = value;
        JTextField textField = new JTextField()
        textField.editable = false
        textField.text = "als " + assignment.qualification + " [Kostenträger = " + assignment.costCenter + "]"
        return textField
    }
}
