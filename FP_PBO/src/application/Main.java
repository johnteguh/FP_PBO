package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/view/resources/loadingScreen.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("LOADING...");
            primaryStage.setScene(scene);
            Main.primaryStage = primaryStage;
            primaryStage.show();

        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        launch(args);
    }
    
}

