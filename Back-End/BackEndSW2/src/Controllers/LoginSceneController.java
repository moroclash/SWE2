package Controllers;

import freelaning.Account;
import freelaning.AdminAccount;
import freelaning.Employer;
import freelaning.Freelancer;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import system.OurSystem;

public class LoginSceneController {

	@FXML
	private TextField usernameTextField;
	@FXML
	private PasswordField passwd;


// *	Need to make a function to abstract the operation of
// 	hiding current scene and show the other.
// * 	I think we should a Helper Class, to implement any
//	helper function inside it


	private Boolean validatingEmptyFields () {

		if (	usernameTextField.getText().isEmpty() ||
			usernameTextField.getText().equals("Username or Phone Number") ||
			passwd.getText().isEmpty() ||
			passwd.getText().equals("Password")
		   )
		{
			Alert alert = new Alert(Alert.AlertType.WARNING);
			alert.setTitle("Empty Fields");
			alert.setContentText("Do not leave Username or Password empty");
			alert.showAndWait();
			return false;
		} // endif

		
	return true;
	} // end validatingEmptyFields

	

    	@FXML
	private void login (ActionEvent event) throws IOException {

	if ( validatingEmptyFields() ) {
	system.OurSystem ourSys = OurSystem.getInstance();
	//log in functions
	if(usernameTextField.getText().compareTo("root")==0&&passwd.getText().compareTo("root")==0)
	{
		Data.loadButton(0);
		System.out.println("sdadjkasdkashdjkhask");
	}
	else
	{
		Account acc = (Account) ourSys.getAccess(usernameTextField.getText(), passwd.getText());
		Data.ExistAcc = acc;
		if(acc instanceof AdminAccount)
		{
			Data.ExistAcc = (AdminAccount) acc;
			Data.loadButton(1);
		}
		else if(acc instanceof freelaning.Freelancer)
		{
			Data.ExistAcc = (Freelancer) acc;
			Data.loadButton(2);
		}
		else
		{
			//employeer
			Data.ExistAcc = (Employer) acc;
			Data.loadButton(3);
		}
	}
	Stage stage = new Stage();
        ((Stage)(((Button)(event.getSource())).getScene().getWindow())).close();
        Parent root = FXMLLoader.load(getClass().getResource("/swgui/mainStage.fxml")); 
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
	}
    } // end login


	@FXML
	public void forgetPasswd() {

	} // end forgetPasswd

    	@FXML
	public void register(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        ((Stage)(((Button)(event.getSource())).getScene().getWindow())).close();
        Parent root = FXMLLoader.load(getClass().getResource("/swgui/mainStage.fxml")); 
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
	} // end register

////////
} // END LoginSceneController
////////