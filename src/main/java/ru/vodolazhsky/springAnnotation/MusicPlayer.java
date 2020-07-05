package ru.vodolazhsky.springAnnotation;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<Music> list;

    public MusicPlayer(List<Music> list) {
        this.list = list;
    }

    public void playSong() {
        Random random = new Random();
        System.out.println(list.get(random.nextInt(list.size())).getSong());
    }
}
