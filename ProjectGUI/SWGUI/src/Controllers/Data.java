/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author moroclash
 */
public class Data {
    private Hashtable<String,String> DataButton ;
    
    public Data()
    {
       this.DataButton = new Hashtable<>();
    }

    private void addButtonName(String buttonname , String action) {
        DataButton.put(buttonname, action);
    }

    public Hashtable<String,String> getDataButton() {
        return DataButton;
    }
    /*
        type numbers :
        root = 1,
        admin = 2,
        freelancer = 3,
        employeer = 4
    */
    public void loadButton(int type)
    {
        switch(type)
        {
            //root
            case 1:
                addButtonName("Home", "Controllers.testActions");
                addButtonName("ShowAllTasks", "Controllers.ShowAllTasks");
                addButtonName("logs", "Controllers.testActions");
                addButtonName("Booda", "Controllers.testActions");
                addButtonName("yasser", "Controllers.testActions");
                break;
            //admin
            case 2:
                addButtonName("Home", "Controllers.testActions");
                addButtonName("myFiles", "Controllers.testActions");
                addButtonName("logs", "Controllers.testActions");                
                break;
            //freelancer
            case 3:
                addButtonName("Home", "Controllers.testActions");
                addButtonName("myFiles", "Controllers.testActions");
                addButtonName("logs", "Controllers.testActions");                
                break;
            //employeer
            case 4:
                addButtonName("Home", "Controllers.testActions");
                addButtonName("myFiles", "Controllers.testActions");
                addButtonName("logs", "Controllers.testActions");                
                break;
        }
    }
    
    public Boolean AddMenuButton(File file)
    {
      return true;
    }
}
