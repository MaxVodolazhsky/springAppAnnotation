package ru.vodolazhsky.springAnnotation;

import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    @Override
    public List<String> getSong() {

        List<String> list = new ArrayList<>();

        list.add("Johann Sebastian Bach - Suite No.2 in B minor, BWV 1067 Badinerie");
        list.add("The Blue Danube - Waltz");
        list.add("Symphony No.40 in G minor, K.550. Allegro molto.");

        return list;
    }

}

