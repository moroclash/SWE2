package Controllers;

import Controllers.Data;
import freelaning.AdminAccount;
import freelaning.Employer;
import freelaning.Freelancer;
import java.io.IOException;
import java.net.URL;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moroclash
 */
public class mainStageController implements Initializable {

	@FXML
	private VBox list;
	@FXML
	private AnchorPane changePane;
	@FXML
	private Label myname;
	@FXML
	private AnchorPane profileimage;
	@FXML
	private Button notification;
	@FXML
	private Button massage;
	@FXML
	private Button logout;

//    @FXML
//    public void buttonAction(ActionEvent event) throws IOException {
//            AnchorPane pp = FXMLLoader.load(getClass().getResource("pan.fxml"));
//            changePane.getChildren().add(pp);
//    }
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		int type = Data.getType();
		//root
		if (type == 0) {
			myname.setText("Root");
		} else if (type == 1) {
			AdminAccount acc = (AdminAccount) Data.ExistAcc;
			myname.setText(acc.getUserName());
		} else if (type == 2) {
			Freelancer acc = (Freelancer) Data.ExistAcc;
			myname.setText(acc.getUserName());
		} else {
			Employer acc = (Employer) Data.ExistAcc;
			myname.setText(acc.getUserName());
		}
		statics.changePane = changePane;
		Data.loadButton(type);
		//get button name and his OnAcction in hashmap
		Hashtable<String, String> buttons = Data.getDataButton();
		for (Map.Entry<String, String> buttonInfo : buttons.entrySet()) {
			Button button = new Button(buttonInfo.getKey());
			//set button id
			button.setId("listbutton");
			try {
				Controllers.buttonableInter test = (buttonableInter) Class.forName(buttonInfo.getValue()).newInstance();
				button.setOnAction(test::buttonAction);
				// add button to list
				list.getChildren().add(button);
			} catch (Exception ex) {
				System.out.println("Exiptions");
			}
		}

		try {
			Controllers.buttonableInter test = (buttonableInter) Class.forName("logoutControle").newInstance();
			logout.setOnAction(test::buttonAction);
			test = (buttonableInter) Class.forName("ComplainControll").newInstance();
			massage.setOnAction(test::buttonAction);
			if (type == 0 || type == 1) {
				test = (buttonableInter) Class.forName("dsadsaddsad").newInstance();
				notification.setOnAction(test::buttonAction);
			} else {
				test = (buttonableInter) Class.forName("ShowAllNotification").newInstance();
				notification.setOnAction(test::buttonAction);
			}

		} catch (Exception ex) {
			try {
				AnchorPane pp = FXMLLoader.load(getClass().getResource("/swgui/ErrorPage.fxml"));
				statics.changePane.getChildren().setAll(pp);
			} catch (IOException ex1) {
				Logger.getLogger(mainStageController.class.getName()).log(Level.SEVERE, null, ex1);
			}
		}

	}
}
