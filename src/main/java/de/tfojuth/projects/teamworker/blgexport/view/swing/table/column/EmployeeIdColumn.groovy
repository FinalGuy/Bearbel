package de.tfojuth.projects.teamworker.blgexport.view.swing.table.column

import javax.swing.table.TableColumn
import javax.swing.table.TableCellRenderer
import javax.swing.table.DefaultTableCellRenderer


class EmployeeIdColumn extends TableColumn{

    @Override
    TableCellRenderer getCellRenderer() {
        return new DefaultTableCellRenderer();
    }

    @Override
    Object getHeaderValue() {
        return "Personalnummer"
    }
}
