/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
/**
 *
 * @author moroclash
 */
public class ShowLogsController implements Initializable{

    @FXML
    private ChoiceBox filterList;
    
    @FXML
    private ScrollPane LogScrolPan;
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /*************Data For test********/
            ArrayList<String> chioses = new ArrayList<>();
            chioses.add("All");
            chioses.add("moro");
            chioses.add("taha");
            chioses.add("yasser");
            
            ArrayList<String> logs = new ArrayList<>();
            logs.add("12212 login to system 20:44-12-6-2017");
            logs.add("12212 login to system 20:44-12-6-2017");
            logs.add("12212 login to system 20:44-12-6-2017");
            logs.add("12212 login to system 20:44-12-6-2017");
            logs.add("12212 login to system 20:44-12-6-2017");
            logs.add("12212 login to system 20:44-12-6-2017");
            logs.add("12212 login to system 20:44-12-6-2017");
            logs.add("12212 login to system 20:44-12-6-2017");
        /**********************************/
        filterList.setItems(FXCollections.observableArrayList(chioses));
        
        VBox logPan = new VBox();
        for(String log:logs)
        {
            Label loglable = new Label(log);
            loglable.setId("lableLog");
            logPan.getChildren().add(loglable);
        }
        LogScrolPan.setContent(logPan);
    }
    
}
