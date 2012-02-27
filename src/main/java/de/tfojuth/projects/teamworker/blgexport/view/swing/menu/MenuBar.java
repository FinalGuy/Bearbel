package de.tfojuth.projects.teamworker.blgexport.view.swing.menu;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: tfojuth
 * Date: 20.02.12
 * Time: 20:47
 * To change this template use File | Settings | File Templates.
 */
@Component
public class MenuBar extends JMenuBar {

    @Resource
    private DateiMenu dateiMenu;

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
        add(dateiMenu);
        add(exportMenu);
        add(importMenu);
    }
}
