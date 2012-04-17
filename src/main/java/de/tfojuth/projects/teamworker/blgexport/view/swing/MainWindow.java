package de.tfojuth.projects.teamworker.blgexport.view.swing;

import de.tfojuth.projects.teamworker.blgexport.view.swing.pagination.PaginationBar;
import de.tfojuth.projects.teamworker.blgexport.view.swing.table.ShiftTableController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

import static java.awt.BorderLayout.*;

@Component
public class MainWindow extends JFrame {

    @Autowired
    private ShiftTableController shiftTableController;

    @Autowired
    private JMenuBar menuBar;

    @Autowired
    private PaginationBar paginationBar;


    public MainWindow() throws HeadlessException {
        super("Bärbel (BLG export tool) v0.1");
        setPreferredSize(new Dimension(800, 500));
        setLocation(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @PostConstruct
    public void addContent() {
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
        tabbedPane.add("LOGM3 (7655)", new JScrollPane(shiftTableController.getShiftTable()));
        tabbedPane.add("LOGCL203 (7656)", new JScrollPane(shiftTableController.getShiftTable()));
        tabbedPane.add("LOGVWG34 (7751)", new JScrollPane(shiftTableController.getShiftTable()));
        tabbedPane.add("LOGPBPCH (7656)", new JScrollPane(shiftTableController.getShiftTable()));
        this.getContentPane().add(tabbedPane, CENTER);
        this.getContentPane().add(paginationBar, NORTH);
        this.getContentPane().add(new JButton("Konvertieren"), SOUTH);
        this.setJMenuBar(menuBar);
    }

}
