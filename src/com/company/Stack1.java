package com.company;

import java.util.Arrays;

public class Stack1 {

    Object[] arr = new Object[10];
    int index;

    Stack1(){index = -1;}

    void push(int item){
        if (index == arr.length-1){
            System.out.println("Stack overflow" +  ": " + arr.length);
            resize();
        } else {
            arr[++index] = item;
        }
        }

        public Stack1 pop(int index){
        Object[] temp = new Object[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if (i != index){
                    temp[i] = arr[i];
                }
                else {
                   temp[i] = arr[i];
                }
            }
            arr = temp;
            return this;
        }

        private Object[] resize(){
        Object[] newArr = new Object[(int) Math.round(this.arr.length * 1.5d)];
            for (int i = 0; i < this.arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
            return arr;
        }

        class SpecialNull{
        Object specialNull;
        }


    public String conversionToString(){
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                str = Arrays.toString(arr);
            }
        }
        return str;
    }
}
