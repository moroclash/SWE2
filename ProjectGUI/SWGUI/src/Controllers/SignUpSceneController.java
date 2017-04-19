package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class SignUpSceneController {

	@FXML
	TextField name = new TextField();
	@FXML
	TextField username = new TextField();
	@FXML
	PasswordField passwd = new PasswordField();
	@FXML
	PasswordField confirmationPasswd = new PasswordField();


	@FXML
	RadioButton workRadioButton = new RadioButton();
	@FXML
	RadioButton hireRadioButton = new RadioButton();

	
} 