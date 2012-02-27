package de.tfojuth.projects.teamworker.blgexport.view.swing;

import de.tfojuth.projects.teamworker.blgexport.view.swing.pagination.PaginationBar;
import de.tfojuth.projects.teamworker.blgexport.view.swing.shifttable.ShiftTableController;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: tfojuth
 * Date: 17.02.12
 * Time: 10:56
 * To change this template use File | Settings | File Templates.
 */
@Component
public class MainWindow extends JFrame {

    @Resource
    private ShiftTableController shiftTableController;

    @Resource
    private JMenuBar menuBar;

    @Resource
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
        this.getContentPane().add(paginationBar,BorderLayout.NORTH);
        this.setJMenuBar(menuBar);
    }

}
