package ru.avtukhov.course;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }

    @Bean
    public List<Music> listMusic(){
        List<Music> result = new ArrayList<>();
        result.add(new RockMusic());
        result.add(new ClassicalMusic());
        result.add(new RapMusic());
        return result;
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(listMusic());
    }

//    @Bean
//    public Computer computer() {
//        return new Computer(musicPlayer());
//    }
}