package ru.avtukhov.course;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;


public class RockMusic implements Music{

    @Override
    public String getSong() {
        return "Венгерская рапсодия";
    }
}
