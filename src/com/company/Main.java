package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code her



        MushroomPicker mushroomPicker = new MushroomPicker("Petya", 35);
        mushroomPicker.collectMushroom(new Forest());
        mushroomPicker.display();

    }
}
