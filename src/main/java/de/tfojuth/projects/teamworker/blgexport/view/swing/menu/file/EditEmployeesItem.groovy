package de.tfojuth.projects.teamworker.blgexport.view.swing.menu.file

import javax.swing.JMenuItem
import org.springframework.stereotype.Component
import de.tfojuth.projects.teamworker.blgexport.controller.EmployeeController
import org.springframework.beans.factory.annotation.Autowired

@Component
class EditEmployeesItem extends JMenuItem {

    EditEmployeesItem() {
        super("Mitarbeiter verwalten");
    }

}
