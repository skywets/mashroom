package com.company;

public class Mushroom {

    private String name;
    private boolean edible;

    public Mushroom(String name, boolean edible) {
        this.name = name;
        this.edible = edible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEdible() {
        return edible;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }

    @Override
    public String toString() {
        return "Mushroom{" +
                "name='" + name + '\'' +
                ", edible=" + edible +
                '}';
    }
}
