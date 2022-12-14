package view;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicMenu {

    private static Clip clip;

    public static void playMusic(String musicLoc){

        try{

            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(musicLoc));
            clip = AudioSystem.getClip();
            clip.open(inputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
    
        } 

        catch (UnsupportedAudioFileException e){
            e.printStackTrace();
        }

        catch (IOException e) {
            e.printStackTrace();
        }

        catch (LineUnavailableException e){
            e.printStackTrace();
        }

    }

    public static void stopMusic(){

        clip.close();

    }
    
}

