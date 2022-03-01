package com.company;

import java.util.*;
import java.util.stream.Collectors;

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
        List<Integer> point = new ArrayList<>();
        point.add(mushroomPicker.getBasket().size());
        point.add(mushroomPicker1.getBasket().size());
        point.add(mushroomPicker2.getBasket().size());
        List<Integer> sortedPoint = point.stream()
                        .sorted(Collections.reverseOrder())
                                .collect(Collectors.toList());
        System.out.println(sortedPoint);
    }


}
