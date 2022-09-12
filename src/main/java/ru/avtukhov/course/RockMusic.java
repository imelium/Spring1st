package ru.avtukhov.course;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

@Component
public class RockMusic implements Music{
    List<String> rockMusicList = asList("MGK", "MORGENSTERN", "МАКС КОРЖ");
    Random random = new Random();

    @Override
    public String getSong() {
        int rondomItem = random.nextInt(rockMusicList.size());
        return rockMusicList.get(rondomItem);
    }
}
