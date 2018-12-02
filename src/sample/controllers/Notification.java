package sample.controllers;

import java.awt.*;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.net.MalformedURLException;


public class Notification {
    private String hospitalName;
    public void setHospital(String hospital){
        hospitalName=hospital;
    }
    public void displayTray() throws AWTException, MalformedURLException {
        //Obtain only one instance of the SystemTray object
        SystemTray tray = SystemTray.getSystemTray();

        //If the icon is a file
        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
        //Alternative (if the icon is on the classpath):
        //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
        //Let the system resize the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);

        trayIcon.displayMessage("!!Someone is ASKING FOR BLOOD!!", "Click Here to Donate", MessageType.INFO);


            //ActionListener listener = arg0 -> System.out.println("click detected");//doesn't work on JDK 1.8

        //trayIcon.addActionListener(listener);





    }
}
/**
 After Here, the Mouse Listener will be implemented
 and rest of the code will run according to the logic

 **/
    /*
     try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../views/InfoOfDonor"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.DECORATED);
            stage.setTitle("ABC");
            stage.setScene(new Scene(root1));
            stage.show();
            Stage hideIntro = (Stage) signIn.getScene().getWindow();
            hideIntro.hide();
        } catch(Exception e) {
            //e.printStackTrace();
        }
     */
/* public void displayTray() throws AWTException, MalformedURLException {
        //Obtain only one instance of the SystemTray object
        SystemTray tray = SystemTray.getSystemTray();

        //If the icon is a file
        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
        //Alternative (if the icon is on the classpath):
        //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
        //Let the system resize the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);

        trayIcon.displayMessage("Hello, RESPECTED DONOR", "PLEASE DONATE BLOOD", MessageType.INFO);


        trayIcon.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseAdapter e) {
                if (e.getClickCount() == 1) {
                    System.out.println("HELLO NIBBA");
                }
            }
        });
	        /*trayIcon.setToolTip("System tray icon demo");
	        trayIcon.addActionListener(listener);
	        tray.add(trayIcon);
	        trayIcon.displayMessage("Hello, World", "notification demo", MessageType.INFO);
	         */


   // }


