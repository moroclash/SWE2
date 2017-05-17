/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author moroclash
 */
public class logoutControle implements buttonableInter {

	@Override
	public void buttonAction(ActionEvent event) {
		try {
			((Stage)(((Button)(event.getSource())).getScene().getWindow())).close();
			Data.ExistAcc.updateProfile();
			Data.ExistAcc=null;
			AnchorPane pp = FXMLLoader.load(getClass().getResource("/swgui/LoginScene.fxml"));
			statics.changePane.getChildren().setAll(pp);
		} catch (IOException ex) {
			Logger.getLogger(testActions.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
