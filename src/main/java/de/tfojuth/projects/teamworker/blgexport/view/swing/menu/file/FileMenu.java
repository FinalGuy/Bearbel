package de.tfojuth.projects.teamworker.blgexport.view.swing.menu.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

@Component
public class FileMenu extends JMenu {

    @Autowired
    private EditEmployeesItem editEmployeesItem;

    public FileMenu() {
        super("Datei");
    }

    @PostConstruct
    public void addMenuItems() {
        add(editEmployeesItem);
    }
}
