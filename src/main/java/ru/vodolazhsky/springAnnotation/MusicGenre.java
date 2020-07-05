package ru.vodolazhsky.springAnnotation;

import java.util.ArrayList;
import java.util.List;

public class MusicGenre {
    public List<String> list = new ArrayList<>();

    public MusicGenre() {
        list.add("Rock");
        list.add("Electronic");
        list.add("Classical");
    }

}
