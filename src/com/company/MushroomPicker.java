package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MushroomPicker {

    private String name;
    private double skill;
    private int age;
    private List<Mushroom> basket;

    public MushroomPicker(String name, int age) {
        this.age = age;
        this.name = name;
        this.skill = Math.random()*5;
        this.basket = new ArrayList<>();
    }

    public void collectMushroom(Forest forest) {
        Mushroom mushroom = forest.randomMushroom();
        basket.add(mushroom);
    }

    public void remove() {
        for (int i = 0; i < basket.size(); i++) {
            if (this.skill > 1 && !basket.get(i).isEdible()){
                basket.remove(i);
                i--;
            }
        }
    }

    public void display() {
        System.out.println(basket);
    }

    public List<Mushroom> getBasket() {
        return basket;
    }

    public void setBasket(List<Mushroom> basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "MushroomPicker{" +
                "name='" + name + '\'' +
                ", skill=" + skill +
                ", age=" + age +
                ", size=" + basket.size() +
                ", basket=" + basket +
                "}\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSkill() {
        return skill;
    }

    public void setSkill(double skill) {
        this.skill = skill;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
