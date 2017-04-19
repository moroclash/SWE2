/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swgui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author moroclash
 */
public class SWGUI extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
<<<<<<< HEAD
        Parent root = FXMLLoader.load(getClass().getResource("ShowLogs.fxml"));
||||||| merged common ancestors
        Parent root = FXMLLoader.load(getClass().getResource("mainStage1.fxml"));
=======
        Parent root = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
>>>>>>> d5f0c5d11de85ca37ff2ae38dad24bbc5fbbe85c
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
