package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Forest {
    
    Random random = new Random();
    List<Mushroom> mushrooms = mushrooms = new ArrayList<>();

    public Forest() {
        mushrooms.add(new Mushroom("Champignon", true));
        mushrooms.add(new Mushroom("Cep", false));
        mushrooms.add(new Mushroom("Agaric", true));
        mushrooms.add(new Mushroom("Boletus", true));
        mushrooms.add(new Mushroom("Russula", false));
        mushrooms.add(new Mushroom("Oyster", true));
    }

    public Mushroom randomMushroom(){
        return mushrooms.get(random.nextInt(mushrooms.size()));
    }

    @Override
    public String toString() {
        return "Forest{" +
                "mushrooms=" + mushrooms +
                '}';
    }
}
