package de.tfojuth.projects.teamworker.blgexport.view.swing;

import de.tfojuth.projects.teamworker.blgexport.view.swing.pagination.PaginationBar;
import de.tfojuth.projects.teamworker.blgexport.view.swing.table.ShiftTableController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

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
        JTable table = shiftTableController.getShiftTable();
        JScrollPane scrollPane = new JScrollPane(table);
        this.getContentPane().add(scrollPane, BorderLayout.CENTER);
        this.getContentPane().add(paginationBar, BorderLayout.NORTH);
        this.setJMenuBar(menuBar);
    }

}
