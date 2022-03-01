package com.company;

public class Tournament {
    MushroomPicker mushroomPicker = new MushroomPicker("Petya", 35);
    MushroomPicker mushroomPicker1 = new MushroomPicker("Petya", 35);
    MushroomPicker mushroomPicker2 = new MushroomPicker("Petya", 35);
    public Tournament() {
        for (int i = 0; i < 10; i++) {
            mushroomPicker.collectMushroom(new Forest());
            mushroomPicker1.collectMushroom(new Forest());
            mushroomPicker2.collectMushroom(new Forest());
        }
        mushroomPicker.remove();
        mushroomPicker1.remove();
        mushroomPicker2.remove();
    }

    public void point() {
        for (Object item: mushroomPicker.getBasket()) {
            int point=0;
            point++;
        }
    }

}
