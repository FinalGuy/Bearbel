package de.tfojuth.projects.teamworker.blgexport.view.swing.table.column

import javax.swing.table.TableCellRenderer
import javax.swing.table.TableColumn
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class AssignmentColumn extends TableColumn {

    @Autowired
    AssignmentCellRenderer assignmentCellRenderer

    @Override
    TableCellRenderer getCellRenderer() {
        return assignmentCellRenderer
    }

    @Override
    int getModelIndex() {
        return 1
    }



    @Override
    Object getHeaderValue() {
        return "Einsatz"
    }
}
