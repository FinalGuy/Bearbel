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

    public MenuBar() {
        super();
        setOpaque(true);
        setPreferredSize(new Dimension(200, 20));
    }

    @PostConstruct
    public void addContent() {
        add(fileMenu);
    }
}
