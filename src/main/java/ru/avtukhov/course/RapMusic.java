package ru.avtukhov.course;
import org.springframework.stereotype.Component;


public class RapMusic implements Music {
        @Override
        public String getSong() {
            return "Новый мерен";
    }
}
