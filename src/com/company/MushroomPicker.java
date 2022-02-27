package com.company;
import java.util.ArrayList;
import java.util.List;
public class MushroomPicker {
    private String name;
    private int age;
    private int skill;
    private List<Mushroom> basket;
    public void addMushroom(Forest forest){
        Mushroom mushroom = forest.randomMushroom();
        if (skill > 1 || mushroom.isEdible())
            basket.add(mushroom);
    }
    public MushroomPicker(int skill){
        this.skill = skill;
        this.basket = new ArrayList<>();
    }
    public void display(){
        System.out.println(basket);
    }

//    public MushroomPicker(String name, int age) {
//        this.name=name;
//        this.age=age;
//        this.basket = new ArrayList<Mushroom>();
//    }
    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Mushroom> getBasket() {
        return basket;
    }

    public void setBasket(List<Mushroom> basket) {
        this.basket = basket;
    }

}
