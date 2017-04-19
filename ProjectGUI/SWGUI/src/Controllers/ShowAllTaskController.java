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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import swgui.TestInfoTasks;

/**
 *
 * @author moroclash
 */
public class ShowAllTaskController implements Initializable{

    @FXML
    private ScrollPane scrolTasks;
    
    
    ArrayList<TestInfoTasks> test = new ArrayList<>();
    
    
    public void initialize(URL location, ResourceBundle resources) {
        /*objects for test*/
        test.add(new TestInfoTasks(1, "FreeLance", "omar mohamed", "web Des", "Still", "200 H", "20/6/2017"));
        test.add(new TestInfoTasks(1, "FreeLance", "omar mohamed", "web Des", "Still", "200 H", "20/6/2017"));
        test.add(new TestInfoTasks(1, "FreeLance", "omar mohamed", "web Des", "Still", "200 H", "20/6/2017"));
        test.add(new TestInfoTasks(1, "FreeLance", "omar mohamed", "web Des", "Still", "200 H", "20/6/2017"));
        test.add(new TestInfoTasks(1, "FreeLance", "omar mohamed", "web Des", "Still", "200 H", "20/6/2017"));
        
        /*****************/
        
        
        VBox taskPane= new VBox();
        for(TestInfoTasks obj : test)
        {
            GridPane tPane= new GridPane();
            tPane.setId("labletask");
            tPane.setHgap(60);
            tPane.setVgap(10);
            
            Label TaskName = new Label("Task Name :");
            TaskName.setId("TaskInfo");
            tPane.add(TaskName, 0, 0);
            Label TaskNameInfo = new Label(obj.getName());
            TaskNameInfo.setId("Info");
            tPane.add(TaskNameInfo, 1, 0 );
            
            
            Label State = new Label("State :");
            State.setId("TaskInfo");
            tPane.add(State, 2, 0 );
            Label StateInfo = new Label(obj.getState());
            StateInfo.setId("Info");
            tPane.add(StateInfo, 3, 0 );
            
            
            Label ID = new Label("ID:");
            ID.setId("TaskInfo");
            tPane.add(ID, 4, 0);
            Label IDInfo = new Label(Integer.toString(obj.getId()));
            IDInfo.setId("Info");
            tPane.add(IDInfo, 5, 0);
            
            
            
            Label Employeer = new Label("Employeer :");
            Employeer.setId("TaskInfo");
            tPane.add(Employeer, 0, 1);
            Label EmployeerInfo = new Label(obj.getEmpname());
            EmployeerInfo.setId("Info");
            tPane.add(EmployeerInfo, 1, 1);
            
            
            Label RequireTime = new Label("RequireTime :");
            RequireTime.setId("TaskInfo");
            tPane.add(RequireTime, 2, 1);
            Label RequireTimeInfo = new Label(obj.getTimeReqire());
            RequireTimeInfo.setId("Info");
            tPane.add(RequireTimeInfo, 3, 1);
            
            
            Label Category = new Label("Category :");
            Category.setId("TaskInfo");
            tPane.add(Category, 0, 2);
            Label CategoryInfo = new Label(obj.getCategory());
            CategoryInfo.setId("Info");
            tPane.add(CategoryInfo, 1, 2);

            
            Label Date = new Label("Date:");
            Date.setId("TaskInfo");
            tPane.add(Date, 2, 2);
            Label DateInfo = new Label(obj.getDate());
            DateInfo.setId("Info");
            tPane.add(DateInfo, 3, 2);
            
            
            Button Show = new Button("Show");
            Show.setId("showbutton");
            tPane.add(Show, 5, 2 ,1,1);
            
            
            taskPane.getChildren().add(tPane);
        }
        scrolTasks.setContent(taskPane);
    }
}
