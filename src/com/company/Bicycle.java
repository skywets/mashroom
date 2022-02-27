package com.company;

import javax.swing.*;
import java.awt.font.TextHitInfo;

public class Bicycle {

    private String name;
    private int weight;
    private int seatPostDiameter;
    public Bicycle(String name, int weight, int seatPostDiameter){
        this.name = name;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter;
    }

    public void start(){
        System.out.println("поехали!");
    }

    public class HandlaBar{

        public void right(){
            System.out.println("Руль вправо");
        }

        public void left(){
            System.out.println("руль влево");
        }
    }

    class Seat{

        public void up(){
            System.out.println("Сиденье поднято выше");
        }

        public void down(){
            System.out.println("сиденье опущено ниже");
        }

        public void getSeatParam(){
            System.out.println("Параметр сиденья: диаметр подседельного штыря =" +  Bicycle.this.seatPostDiameter);
        }
    }
}
