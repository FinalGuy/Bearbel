package de.tfojuth.projects.teamworker.blgexport.view.swing.table.column

import javax.swing.table.TableCellRenderer
import javax.swing.table.TableColumn
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class EmployeeColumn extends TableColumn {

    @Autowired
    EmployeeCellRenderer employeeCellRenderer;

    @Override
    TableCellRenderer getCellRenderer() {
        return employeeCellRenderer
    }

    @Override
    Object getHeaderValue() {
        return "Mitarbeiter"
    }


}
