/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import freelaning.Account;
import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author moroclash
 */
public class Data {

	public static Account ExistAcc ;
	private static int type ;
	private static Hashtable<String, String> DataButton;

	public void setExistAcc(Account ExistAcc) {
		this.ExistAcc = ExistAcc;
	}

	public static Account getExistAcc() {
		return ExistAcc;
	}

	public void setType(int type) {
		this.type = type;
	}

	public static int getType() {
		return type;
	}
	
	public Data() {
		this.DataButton = new Hashtable<>();
	}

	private static void addButtonName(String buttonname, String action) {
		DataButton.put(buttonname, action);
	}

	public static Hashtable<String, String> getDataButton() {
		return DataButton;
	}

	/*
        type numbers :
        root = 1,
        admin = 2,
        freelancer = 3,
        employeer = 4
	 */
	public static void loadButton(int type) {
		switch (type) {
			//root
			case 1:
				addButtonName("my Profile", "Controllers.testActions");
				addButtonName("Search Admin", "Controllers.ShowAllTasks");
				addButtonName("get Blocked Admin", "Controllers.ShowAllNotification");
				addButtonName("Update Constains", "Controllers.ShowAllNotification");
				addButtonName("Show Statistic", "Controllers.ShowAllNotification");
				addButtonName("Make Report", "Controllers.ShowAllNotification");
				addButtonName("logs", "Controllers.testActions");
				break;
			//admin
			case 2:
				addButtonName("My Profile", "Controllers.testActions");
				//addButtonName("Notifications", "Controllers.ShowAllNotification");
				addButtonName("Show Constrains", "Controllers.testActions");
				addButtonName("System Complains", "Controllers.testActions");
				addButtonName("notify all people", "Controllers.testActions");
				addButtonName("Show Statistic", "Controllers.ShowAllNotification");
				addButtonName("Show Block consumers", "Controllers.testActions");
				addButtonName("Search consumers", "Controllers.testActions");
				addButtonName("Make Report", "Controllers.ShowAllNotification");
				addButtonName("logs", "Controllers.testActions");
				break;
			//freelancer
			case 3:
				addButtonName("Profile", "Controllers.testActions");
//				addButtonName("Notifications", "Controllers.ShowAllNotification");
				addButtonName("new Taskes", "Controllers.testActions");
				addButtonName("my offers", "Controllers.testActions");
				addButtonName("Show System Constrain", "Controllers.testActions");
				addButtonName("Search Profile", "Controllers.testActions");
				addButtonName("Search task", "Controllers.testActions");
				break;
			//employeer
			case 4:
				addButtonName("Profile", "Controllers.testActions");
//				addButtonName("Notifications", "Controllers.ShowAllNotification");
				addButtonName("my Tasks", "Controllers.testActions");
				addButtonName("make new Tasks", "Controllers.testActions");
				addButtonName("search profile", "Controllers.testActions");
				break;
		}
		Data.type =type;
	}

	public Boolean AddMenuButton(File file) {
		return true;
	}
}
