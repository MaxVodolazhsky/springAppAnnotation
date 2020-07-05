package ru.vodolazhsky.springAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class SpringConf {

    @Bean
    public ClassicalMusic musicBean() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic musicBean1() {
        return new RockMusic();
    }

    @Bean
    public ElectronicMusic musicBean2() {
        return new ElectronicMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(musicBean(), musicBean1(), musicBean2());
    }
}
