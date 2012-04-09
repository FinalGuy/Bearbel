package de.tfojuth.projects.teamworker.blgexport.view.swing.dialog;

import org.springframework.stereotype.*;

import javax.swing.*;
import java.awt.*;

@org.springframework.stereotype.Component
public class EmployeeOverview extends JDialog {

    public EmployeeOverview() {
        setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        setPreferredSize(new Dimension(200, 400));
        setLocation(200,200);
        pack();
    }
}

