package de.tfojuth.projects.teamworker.blgexport.view.swing.menu;

import de.tfojuth.projects.teamworker.blgexport.view.swing.menu.file.FileMenu;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.swing.*;
import java.awt.*;

@Component
public class MenuBar extends JMenuBar {

    @Resource
    private FileMenu fileMenu;

    @Resource
    private ExportMenu exportMenu;

    @Resource
    private ImportMenu importMenu;

    public MenuBar() {
        super();
        setOpaque(true);
        //setBackground(new Color(154, 165, 127));
        setPreferredSize(new Dimension(200, 20));
    }

    @PostConstruct
    public void addContent() {
        add(fileMenu);
        add(exportMenu);
        add(importMenu);
    }
}
