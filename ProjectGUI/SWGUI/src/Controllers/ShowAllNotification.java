/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author taha
 */
public class ShowAllNotification implements Initializable, buttonableInter {
	
	@FXML
	private VBox listVBox = new VBox();
	@FXML
	private Label notificationState = new Label();



	

	@Override
	public void initialize(URL url, ResourceBundle rb) {



		// NEED some Abstruction in here,
		// Some helper functions.
		// To clean this duplication

	for (int i = 0; i < 5; i++){
		AnchorPane pane = new AnchorPane();
		pane.setPrefHeight(80);
		pane.setId("notificationPane");
		pane.setId("notific");
		

		Label notificationFromName1 = new Label("notificationFromName1");
		notificationFromName1.setId("notificationFromName");
		notificationFromName1.setLayoutX(116);
		notificationFromName1.setLayoutY(25);
		notificationFromName1.prefWidth(93);
		notificationFromName1.prefHeight(26);
		
		Label notificationMessage1 = new Label("notificationMessage1");
		notificationMessage1.setId("notification_Message_Time");
		notificationMessage1.setLayoutX(116);
		notificationMessage1.setLayoutY(44);
		notificationMessage1.prefWidth(748);
		notificationMessage1.prefHeight(17);

		Label notificationTime1 = new Label("6:09 pm");
		notificationTime1.setId("notification_Message_Time");
		notificationTime1.setLayoutX(920);
		notificationTime1.setLayoutY(15);
		notificationTime1.prefWidth(49);
		notificationTime1.prefHeight(17);

		ImageView imageFromNotification = new ImageView();
		imageFromNotification.setLayoutX(14);
		imageFromNotification.setLayoutY(15);
		imageFromNotification.prefWidth(59);
		imageFromNotification.prefHeight(54);
		imageFromNotification.setFitHeight(54);
		imageFromNotification.setFitWidth(59);
		Image img = new Image("file:/Users/taha/SWE2/customControl/src/customcontrol/pics/pic.png");
		imageFromNotification.setImage(img);
		
		pane.getChildren().add(notificationFromName1);
		pane.getChildren().add(notificationMessage1);
		pane.getChildren().add(notificationTime1);
		pane.getChildren().add(imageFromNotification);





		// Add notification to the pane
		listVBox.getChildren().add(pane);


	} // end 
		
	}	

	@Override
	public void buttonAction(ActionEvent event) {

	try {
            AnchorPane pp = FXMLLoader.load(getClass().getResource("/swgui/ShowAllNotification.fxml"));
            statics.changePane.getChildren().setAll(pp);
        } catch (IOException ex) {
            Logger.getLogger(testActions.class.getName()).log(Level.SEVERE, null, ex);
        }

		
	} // end buttonAction



	
	
////////
} // end ShowAllNotification Class
////////
