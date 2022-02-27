package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Test {

    int[] arr = new int[10];
    int index;

    Test(){
        index=-1;
    }

    void push(int item){
        if (index == arr.length-1){
            System.out.println("Stack overflow" +  ": " + arr.length);
            resize();
        } else {
            arr[++index] = item;
        }
    }

    @Override
    public String toString() {
        return "Test{" +
                "arr=" + Arrays.toString(arr) +
                ", index=" + index +
                '}';
    }

    public Test pop(int index){
        List<Integer> integerList = new ArrayList<>();
        for (int item: arr) {
            integerList.add(item);
        }
        integerList.remove(index);
        int[] temp = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            temp[i] = integerList.get(i);
        }
        arr = temp;
        for (int i:arr) {
           // System.out.print(i+" ");
        }
       // System.out.println();
        return this;
    }

//    public Test pop(int index){
//        if (this.arr == null || index < 0 || index >= this.arr.length){
//            System.out.println("ArrayOfBoundsException");
//            return this;
//        }
//        int k = 0;
//        int[] temp = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            if (i != index && arr[i]!= index){
//                temp[k++] = arr[i];
//
//            }
//        }
//        int len = temp.length;
//        arr = temp;
//        len = arr.length;
//      //  System.arraycopy(temp,0,arr,0, temp.length);
//
//        for (int i = 0; i < temp.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        return this;
//    }

    private int [] resize(){
        int[] newArr = new int[(int) Math.round(this.arr.length * 1.5d)];
        for (int i = 0; i < this.arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        return arr;
    }

}
