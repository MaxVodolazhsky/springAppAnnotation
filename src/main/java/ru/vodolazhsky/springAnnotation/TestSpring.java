package ru.vodolazhsky.springAnnotation;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer MusicPlayer = context.getBean("MusicPlayer", MusicPlayer.class);
        System.out.println("123");
        MusicPlayer.playMusic();
        context.close();
    }
}
