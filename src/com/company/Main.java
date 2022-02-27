package com.company;
import java.util.*;

import static com.company.Stack.*;
public class Main {

    public static void main(String[] args) {
        // write your code here

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter index of array which you want to remove?:  ");
//        int index = scanner.nextInt();
//
        Stack1 test = new Stack1();
        System.out.println();
        for (int i = 0; i < 25; i++) {
            test.push(i);
        }
        for (int i = 10; i < 16; i++) {
            test.pop(i);
            System.out.println(test.conversionToString());
        }



    }
}
//        int [] arr = {9,7,8,22,5,6,7};
//        int len = remove( 5, arr);
//        for (int i = 0; i < len; i++) {
//            System.out.print(arr[i]+" ");



        // Mushroom mushroom = new Mushroom();
//        MushroomPicker mushroomPicker = new MushroomPicker(2);
//        mushroomPicker.addMushroom(new Forest());
//        mushroomPicker.display();


