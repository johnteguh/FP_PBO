package view;

import java.util.ArrayList;
import java.util.List;

import gamenya.GameInvernya;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.stage.Stage;
import model.ButtonGame;
import model.GameSubScene;
import model.KelompokSubScene;

public class ViewManager{

    private static final int HEIGHT = 768;
    private static final int WIDTH = 1024;
    private AnchorPane mainPane;
    private Scene mainScene;
    private Stage mainStage;

    private final static int MENU_BUTTONS_START_X = 100;
    private final static int MENU_BUTTONS_START_Y = 265;

    List<ButtonGame> menuButtons;

    private GameSubScene aboutSubScene;
    private KelompokSubScene kelompokSubScene;
    private GameSubScene startSubScene;
    // private GameSubScene cobaSubScene;
    

    private GameSubScene sceneToHide;
    private KelompokSubScene sceneToHide1;

    public ViewManager(){
        menuButtons = new ArrayList<>();
        mainPane = new AnchorPane();
        mainScene = new Scene(mainPane,WIDTH,HEIGHT);
        mainStage = new Stage();
        mainStage.setScene(mainScene);
        createSubScenes();
        createButtons();
        createBackground();
        createLogo();

        
    }

    private void showSubScene(GameSubScene subScene){
        if(sceneToHide != null){
            sceneToHide.moveSubScene();
        }if(sceneToHide1 != null){
            sceneToHide1.moveSubScene();
            sceneToHide1 = null;
        }
        subScene.moveSubScene();
        sceneToHide = subScene;
        
    }

    private void kelSubScene(KelompokSubScene subScene1){
        if(sceneToHide1 != null){
            sceneToHide1.moveSubScene();
        }if(sceneToHide != null){
            sceneToHide.moveSubScene();
            sceneToHide = null;
        }
        subScene1.moveSubScene();
        sceneToHide1 = subScene1;
        
    }

    private void createSubScenes(){
        aboutSubScene = new GameSubScene();
        mainPane.getChildren().add(aboutSubScene);

        kelompokSubScene = new KelompokSubScene();
        mainPane.getChildren().add(kelompokSubScene);

        startSubScene = new GameSubScene();
        mainPane.getChildren().add(startSubScene);

    }


    public Stage getMainStage() {
        return mainStage;
    }

    private void addMenuButton(ButtonGame button){
        button.setLayoutX(MENU_BUTTONS_START_X);
        button.setLayoutY(MENU_BUTTONS_START_Y+menuButtons.size()*100);
        menuButtons.add(button);
        mainPane.getChildren().add(button);
    }

    private void createButtons(){
        createStartButton();
        createKelompokButton();
        createAboutButton();
        createExitButton();
    }

    private void createStartButton(){
        ButtonGame startButton = new ButtonGame("PLAY");
        addMenuButton(startButton);

        startButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){

                Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                GameInvernya game = new GameInvernya();
                stage.setScene(new Scene(game.createContent()));
                stage.show();
                MusicMenu.stopMusic();
                MusicMenu.playMusic("src/view/resources/lagu/ingame.wav");
               
            }
        });
    }

    private void createKelompokButton(){
        ButtonGame kelompokButton = new ButtonGame("Kelompok");
        addMenuButton(kelompokButton);

        kelompokButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                kelSubScene(kelompokSubScene);
            }
        });

    }

    private void createAboutButton(){
        ButtonGame aboutButton = new ButtonGame("ABOUT");
        addMenuButton(aboutButton);

        aboutButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showSubScene(aboutSubScene);
            }
            
        });
    }

    private void createExitButton(){
        ButtonGame exitButton = new ButtonGame("EXIT");
        addMenuButton(exitButton);

        exitButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                mainStage.close();
            }
        });
    }

    private void createBackground(){
        Image backgroundImage = new Image("view/resources/background1.png",HEIGHT,WIDTH,false,true);
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.CENTER, null);
        mainPane.setBackground(new Background(background));
    }

    private void createLogo(){
        ImageView logo = new ImageView("view/resources/InverseGridText.png");
        logo.setLayoutY(40);
        logo.setLayoutX(175);

        logo.setOnMouseEntered(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
                logo.setEffect(new DropShadow());
            }
        });

        logo.setOnMouseExited(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
                logo.setEffect(null);
            }
        });

        mainPane.getChildren().add(logo);
    }
}