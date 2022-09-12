package ru.avtukhov.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,@Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


    public void playMusic(MusicGenre genre) {
         String result = null;
        switch (genre) {
            case ROCK:
                result =  "Playing: " + music1.getSong();
                break;
            case CLASSICAL:
                result = "Playing: " + music2.getSong();
                break;
        }
        System.out.println("Playing: " + result);
    }

}

