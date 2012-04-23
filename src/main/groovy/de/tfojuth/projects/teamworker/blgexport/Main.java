package de.tfojuth.projects.teamworker.blgexport;

import de.tfojuth.projects.teamworker.blgexport.view.swing.MainWindow;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] arguments) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/application-context.xml");
        MainWindow mainWindow = applicationContext.getBean(MainWindow.class);
        mainWindow.pack();
        mainWindow.setVisible(true);
    }

}
