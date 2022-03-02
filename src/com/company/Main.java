package com.company;

import java.lang.management.MemoryUsage;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code her

        MushroomPicker mushroomPicker = new MushroomPicker("Petya", 35);
        MushroomPicker mushroomPicker1 = new MushroomPicker("Petya1", 35);
        MushroomPicker mushroomPicker2 = new MushroomPicker("Petya2", 35);
        for (int i = 0; i < 10; i++) {
            mushroomPicker.collectMushroom(new Forest());
            mushroomPicker1.collectMushroom(new Forest());
            mushroomPicker2.collectMushroom(new Forest());
        }
        mushroomPicker.remove();
        mushroomPicker1.remove();
        mushroomPicker2.remove();

        Tournament tournament =new Tournament(mushroomPicker, mushroomPicker1, mushroomPicker2, new Forest());
        tournament.compete();

    }
}
