package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import view.MusicMenu;
import view.ViewManager;

public class loadingScreenController implements Initializable{

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        new loadingAwal().start();
    }

    class loadingAwal extends Thread {
        @Override
        public void run()
        {
            try {
                Thread.sleep(1000);
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                    ViewManager manager = new ViewManager();
                    Stage primaryStage = (Stage)(manager.getMainStage()).getScene().getWindow();
                    primaryStage.show();
                    MusicMenu.playMusic("src/view/resources/lagu/menumusic.wav");
                    Main.primaryStage.close();
                    }
                });
            } catch (InterruptedException ex) {
                System.out.println("tidak bisa memuat halaman");
            }
        }
    }
}
