/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swgui;

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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author moroclash
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private AnchorPane b;
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        ((Stage)(((Button)(event.getSource())).getScene().getWindow())).close();
        Parent root = FXMLLoader.load(getClass().getResource("mainStage.fxml"));        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {        
//        Button bb = new Button("loooolo");
//        try {
//            Controllers.buttonableInter test = (Controllers.buttonableInter) Class.forName("Controllers.testActions").newInstance();
//            bb.setOnAction(test::buttonAction);
//            b.getChildren().add(bb);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
    }    
    
    @FXML
    private AnchorPane pp;
    @FXML
    private void testhandellar(ActionEvent event) throws IOException
    {
        AnchorPane pan = FXMLLoader.load(getClass().getResource("trst2.fxml"));
        pp.getChildren().setAll(pan);
    }

    
    
}
