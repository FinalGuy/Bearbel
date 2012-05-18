package de.tfojuth.projects.teamworker.blgexport

import de.tfojuth.projects.teamworker.blgexport.view.swing.MainWindow
import org.springframework.context.support.ClassPathXmlApplicationContext


applicationContext = new ClassPathXmlApplicationContext("/application-context.xml");
mainWindow = applicationContext.getBean(MainWindow.class)
mainWindow.pack()
mainWindow.show()




