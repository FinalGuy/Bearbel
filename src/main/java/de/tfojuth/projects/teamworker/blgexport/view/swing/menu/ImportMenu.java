package de.tfojuth.projects.teamworker.blgexport.view.swing.menu;

import org.springframework.stereotype.Component;

import javax.swing.*;

/**
 * Created by IntelliJ IDEA.
 * User: tfojuth
 * Date: 20.02.12
 * Time: 21:03
 * To change this template use File | Settings | File Templates.
 */
@Component
public class ImportMenu extends JMenu {

    public ImportMenu() {
        super("Import");
        add(new JMenuItem("Stammdaten"));

    }
}
