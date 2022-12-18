package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;

public class ButtonGame extends Button {

    private final String FONT_PATH = "src/model/resources/pixelmix_bold.ttf";
    private final String BUTTON_PRESSED = "-fx-background-color: transparent; -fx-background-image: url('/model/resources/retro_button.png');";
    private final String BUTTON_FREE = "-fx-background-color: transparent; -fx-background-image: url('/model/resources/retro_button.png');";
    
    public ButtonGame(String text){
        setText(text);
        setButtonFont();
        setPrefWidth(190);
        setPrefHeight(49);
        setStyle(BUTTON_FREE);
        initializeButtonListeners();
        
    }

    private void setButtonFont(){
        try{
            setFont(Font.loadFont(new FileInputStream(FONT_PATH),23));
            
        } catch (FileNotFoundException e){
            setFont(Font.font("Impact",23));
        }
    }

    private void setButtonPressed(){
        setStyle(BUTTON_PRESSED);
        setPrefHeight(45);
        setLayoutY(getLayoutY() + 4);
    }

    private void setButtonFree(){
        setStyle(BUTTON_FREE);
        setPrefHeight(49);
        setLayoutY(getLayoutY() - 4);

    }

    private void initializeButtonListeners(){

        setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(event.getButton().equals(MouseButton.PRIMARY)){
                    setButtonPressed();
                }
            }
        });

        setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event){
                if(event.getButton().equals(MouseButton.PRIMARY)){
                    setButtonFree();
                }
            }
        });

        setOnMouseEntered(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
                setEffect(new DropShadow());
            }
        });

        setOnMouseExited(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
                setEffect(null);
            }
        });
    }

}
