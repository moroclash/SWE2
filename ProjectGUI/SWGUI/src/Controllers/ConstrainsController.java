/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ConstrainsController implements Initializable {
   
   @FXML
   private TextField fr_timeoutPenalty;

    @FXML
    private TextField fr_cancelingTaskPenalty;
    @FXML
    private TextField fr_overtimePenalty;

    @FXML
    private TextField em_rejectFinishedTaskPenalty;

    @FXML
    private TextField em_cancelRunningTaskPenalty ;
      
    @FXML 
    private TextField em_cancelRunningTaskBudgetPenalty;

    @FXML
    private TextField em_rejectFinishedTaskBudgetPenalty;
    @FXML
    private TextField ourProfit;
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }  
    @FXML
    public void editConstraints(ActionEvent ActionEvent)
    {
        
    }
    
}
