package Controllers;


import Controllers.Data;
import com.sun.javaws.exceptions.ExitException;
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
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moroclash
 */
public class mainStageController implements Initializable{
    
    @FXML
    private VBox list;
    @FXML
    private AnchorPane changePane;
    
//    @FXML
//    public void buttonAction(ActionEvent event) throws IOException {
//            AnchorPane pp = FXMLLoader.load(getClass().getResource("pan.fxml"));
//            changePane.getChildren().add(pp);
//    }

    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        //to get buttons
        Data myData = new Data();
        //load button
        myData.loadButton(1);
        statics.changePane=changePane;
        //get button name and his OnAcction in hashmap
        Hashtable<String,String> buttons = myData.getDataButton();       
        for(Map.Entry<String ,String> buttonInfo : buttons.entrySet())
        {
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
    }

}
