package de.tfojuth.projects.teamworker.blgexport.view.swing.table

import de.tfojuth.projects.teamworker.blgexport.view.swing.table.column.AssignmentColumn
import de.tfojuth.projects.teamworker.blgexport.view.swing.table.column.EmployeeColumn
import javax.annotation.PostConstruct
import javax.swing.table.DefaultTableColumnModel
import javax.swing.table.TableColumn
import javax.swing.table.TableColumnModel
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ShiftTableColumnModel extends DefaultTableColumnModel implements TableColumnModel {

    @Autowired
    EmployeeColumn employeeColumn

    @Autowired
    AssignmentColumn assignmentColumn

    @PostConstruct
    void initializeColumns() {
        addColumn(new EmployeeColumn())
    }

}
