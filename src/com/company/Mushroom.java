package com.company;

import java.util.ArrayList;
import java.util.List;

public class Mushroom {
    private boolean edible;
    public String name;

    public Mushroom(String name, boolean edible) {
        this.name = name;
        this.edible = edible;
    }

    @Override
    public String toString() {
        return "Mushroom{" +
                "edible=" + edible +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean isEdible(){
        return edible;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
}
