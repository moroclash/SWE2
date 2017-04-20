/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swgui;

import javafx.concurrent.Task;

/**
 *
 * @author moroclash
 */
public class TestInfoTasks {
    private int id;
    private String  name;
    private String  empname;
    private String  category;
    private String  state;
    private String  timeReqire;
    private String  Date;
    
    public TestInfoTasks(int id,String name,String empname,String category, String state,String timeReqire, String Date)
    {
        this.id =id;
        this.name =name;
        this.Date= Date;
        this.category = category;
        this.empname=empname;
        this.name=name;
        this.state=state;
        this.timeReqire=timeReqire;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmpname() {
        return empname;
    }

    public String getCategory() {
        return category;
    }

    public String getState() {
        return state;
    }

    public String getTimeReqire() {
        return timeReqire;
    }

    public String getDate() {
        return Date;
    }
    
    
    
}
