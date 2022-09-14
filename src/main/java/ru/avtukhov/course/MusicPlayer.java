package ru.avtukhov.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {

    private List<Music> listMusic;


    public MusicPlayer(List<Music> listMusic) {
        this.listMusic = listMusic;
    }
    //    public String getName() {
//        return name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }

    public void playMusic() {
        Random random = new Random();
        int randomItem = random.nextInt(listMusic.size());
        System.out.println(listMusic.get(randomItem).getSong());
    }

}

