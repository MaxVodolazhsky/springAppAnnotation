package ru.vodolazhsky.springAnnotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    @Override
    public List<String> getSong() {
        List<String> list = new ArrayList<>();
        list.add("Sonic Syndicate - Jailbreak");
        list.add("Sonic Syndicate - Turn it Up");
        list.add("AC/DC - Welcome to Hell");
        return list;
    }
}
