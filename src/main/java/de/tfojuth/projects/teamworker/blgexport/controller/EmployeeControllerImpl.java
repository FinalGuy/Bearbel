package de.tfojuth.projects.teamworker.blgexport.controller;

import de.tfojuth.projects.teamworker.blgexport.view.swing.dialog.EmployeeOverview;
import de.tfojuth.projects.teamworker.blgexport.view.swing.menu.file.EditEmployeesItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class EmployeeControllerImpl implements EmployeeController, ActionListener {

    @Autowired
    private EditEmployeesItem editEmployeesItem;

    @Autowired
    private EmployeeOverview employeeOverview;


    @PostConstruct
    public void registerAsListener() {
        editEmployeesItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == editEmployeesItem) {
            employeeOverview.setVisible(true);
        }
    }
}
