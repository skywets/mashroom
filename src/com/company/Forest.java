package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Forest {

    public List<Mushroom> mushrooms = new ArrayList<>();

    public Mushroom randomMushroom(){
        Random random = new Random();
        Mushroom mushroom;
        mushroom = mushrooms.get(random.nextInt(mushrooms.size()));
        return  mushroom;
    }
}
