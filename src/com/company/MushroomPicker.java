package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MushroomPicker {

    private String name;
    private double skill;
    private int age;
    private List<Mushroom> basket;

    public MushroomPicker(String name, int age) {
        this.age = age;
        this.name = name;
        this.skill = skill = Math.random()*5;
        this.basket = new ArrayList<>();
    }

    public void collectMushroom(Forest forest) {
        Mushroom mushroom = forest.randomMushroom();
        if (skill > 1 && mushroom.isEdible()) {
            basket.add(mushroom);
        }
    }

    public void display() {
        System.out.println(basket);
    }

}
