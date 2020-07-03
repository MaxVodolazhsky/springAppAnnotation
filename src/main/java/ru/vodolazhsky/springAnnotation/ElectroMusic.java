package ru.vodolazhsky.springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class ElectroMusic implements Music {
    @Override
    public List<String> getSong() {
        List<String> list = new ArrayList<>();
        return list;
    }
}
