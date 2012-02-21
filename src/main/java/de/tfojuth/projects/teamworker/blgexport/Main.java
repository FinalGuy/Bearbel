package de.tfojuth.projects.teamworker.blgexport;

import de.tfojuth.projects.teamworker.blgexport.ui.swing.MainWindow;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: tfojuth
 * Date: 17.02.12
 * Time: 10:41
 * To change this template use File | Settings | File Templates.
 */
public class Main {


    public static void main(String[] arguments) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/application-context.xml");
        MainWindow mainWindow = applicationContext.getBean(MainWindow.class);
        mainWindow.pack();
        mainWindow.setVisible(true);
    }

}
