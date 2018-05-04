package main.java.com.matritellabs.utama;


import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;

public class Shot {


    public static void play() {
        try {
            // open the sound file as a Java input stream
            InputStream gongFile =  new FileInputStream("src/ShotGun.wav");

            // create an audiostream from the inputstream
            AudioStream audioStream = new AudioStream(gongFile);

            // play the audio clip with the audioplayer class
            AudioPlayer.player.start(audioStream);
        }catch (  IOException e) {
            System.err.println("Something wrong");
        }
    }
}

