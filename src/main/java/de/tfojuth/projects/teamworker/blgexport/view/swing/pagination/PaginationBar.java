package de.tfojuth.projects.teamworker.blgexport.view.swing.pagination;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: tfojuth
 * Date: 20.02.12
 * Time: 21:05
 * To change this template use File | Settings | File Templates.
 */
@Component
public class PaginationBar extends JPanel {

    public PaginationBar() {
        super(true);
        this.setLayout(new BorderLayout());

        JButton buttonNextWeek = new JButton("Nächste Woche");
        JButton buttinLastWeek = new JButton("Vorige Woche");


        add(new JLabel(new Date().toString()));
    }
}
