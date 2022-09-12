package ru.avtukhov.course;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

@Component
public class ClassicalMusic implements Music{
    List<String> classicalMusicList = asList("LALITA", "MORGEN", " КОРЖ");
    Random random = new Random();

    @Override
    public String getSong() {
        int rondomItem = random.nextInt(classicalMusicList.size());
        return classicalMusicList.get(rondomItem);
    }
}
