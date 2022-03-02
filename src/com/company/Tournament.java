package com.company;
import java.util.*;
import java.util.stream.Collectors;
public class Tournament {
    MushroomPicker mushroomPicker;
    MushroomPicker mushroomPicker1;
    MushroomPicker mushroomPicker2;
    Forest forest;

    public Tournament(MushroomPicker mushroomPicker, MushroomPicker mushroomPicker1, MushroomPicker mushroomPicker2,Forest forest ) {
        this.mushroomPicker = mushroomPicker;
        this.mushroomPicker1 = mushroomPicker1;
        this.mushroomPicker2 = mushroomPicker2;
        this.forest = forest;
    }

    public void compete() {
        List<MushroomPicker> pickers = new ArrayList<>();
        pickers.add(mushroomPicker);
        pickers.add(mushroomPicker1);
        pickers.add(mushroomPicker2);
        List<MushroomPicker> sortedMushrooms = pickers.stream()
                .sorted((x, y) -> Integer.compare(y.getBasket().size(), x.getBasket().size())).toList();
        System.out.println(sortedMushrooms);

    }
}
