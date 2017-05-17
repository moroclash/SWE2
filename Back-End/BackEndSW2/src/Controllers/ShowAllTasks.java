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
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author moroclash
 */
public class ShowAllTasks implements buttonableInter{

    @Override
    public void buttonAction(ActionEvent event) {
         try {
            AnchorPane pp = FXMLLoader.load(getClass().getResource("/swgui/ShowAllTasks.fxml"));
            statics.changePane.getChildren().setAll(pp);
        } catch (Exception ex) {
             try {
                 AnchorPane pp = FXMLLoader.load(getClass().getResource("/swgui/ErrorPage.fxml"));
                 statics.changePane.getChildren().setAll(pp);
             } catch (IOException ex1) {
                 Logger.getLogger(ShowAllTasks.class.getName()).log(Level.SEVERE, null, ex1);
             }
        }
    }
    
}
