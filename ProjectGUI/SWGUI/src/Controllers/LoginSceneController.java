package Controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginSceneController {

	@FXML
	private TextField usernameTextField;
	@FXML
	private PasswordField passwd;


// *	Need to make a function to abstract the operation of
// 	hiding current scene and show the other.
// * 	I think we should a Helper Class, to implement any
//	helper function inside it

    	@FXML
	private void login (ActionEvent event) throws IOException {
        Stage stage = new Stage();
        ((Stage)(((Button)(event.getSource())).getScene().getWindow())).close();
        Parent root = FXMLLoader.load(getClass().getResource("/swgui/mainStage.fxml")); 
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


	@FXML
	public void forgetPasswd() {

	} // end forgetPasswd

    	@FXML
	public void register(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        ((Stage)(((Button)(event.getSource())).getScene().getWindow())).close();
        Parent root = FXMLLoader.load(getClass().getResource("/swgui/SignUpScene.fxml")); 
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
	} // end register

////////
} // END LoginSceneController
////////