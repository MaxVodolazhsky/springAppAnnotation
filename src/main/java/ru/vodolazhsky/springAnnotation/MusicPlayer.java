package ru.vodolazhsky.springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
@Scope("singleton")
public class MusicPlayer {
    private Music music;
    private Music music1;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    @PostConstruct
    public void initMethod() {
        System.out.println("Init");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("Destroy");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music, @Qualifier("classicalMusic") Music music1) {
        this.music = music;
        this.music1 = music1;
    }

    public void playSong(MusicGenre musicGenre) {
        Random random = new Random();
        String song = null;
        if (musicGenre.equals(MusicGenre.ROCK)) {
            song = music.getSong().get(random.nextInt(3));
            System.out.println(song);
        }
        if (musicGenre.equals(MusicGenre.CLASSICAL)) {
            song = music1.getSong().get(random.nextInt(3));
            System.out.println(song);
        }
    }
}
