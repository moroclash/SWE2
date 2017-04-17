/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.awt.Robot;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author moroclash
 */
public class testActions implements buttonableInter{
    

    
    @FXML
    public void buttonAction(ActionEvent event) {
        try {
            AnchorPane pp = FXMLLoader.load(getClass().getResource("/swgui/pan.fxml"));
            statics.changePane.getChildren().setAll(pp);
        } catch (IOException ex) {
            Logger.getLogger(testActions.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
}
