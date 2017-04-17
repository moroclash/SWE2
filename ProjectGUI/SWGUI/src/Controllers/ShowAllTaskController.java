/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 *
 * @author moroclash
 */
public class ShowAllTaskController implements Initializable{

    @FXML
    private ScrollPane scrolTasks;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("lllllllllllllllllllll");
        Pane taskPane= new Pane();
        ArrayList<Label> a = new ArrayList<>();
        for(int i=0 ; i<=40;i++)
        {
            Label ll = new Label("test");
            ll.setId("labletask");
//            p.getChildren().add(ll);
        }
//        scrolTasks.setContent(p);
    }
    
}
