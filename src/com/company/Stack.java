package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Stack {
    int[] arr = new int[10];// сделать на object
    Object[] objects = new Object[10];
    int index;

    Stack(){
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

    public Stack pop(int index){
        List<Integer> integerList = new ArrayList<>();
        for (int item: arr) {
            integerList.add(item);
        }
        //переписать на массив, внедрить системный переменый который позволит отличат удалённый от не удалённого
        // реализовать это необходимо на внутренном классе
        integerList.remove(index);
        int[] temp = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            temp[i] = integerList.get(i);
        }
        arr = temp;
        this.index = arr.length;
        return this;
    }

    private int [] resize(){
        int[] newArr = new int[(int) Math.round(this.arr.length * 1.5d)];
        for (int i = 0; i < this.arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        return arr;
    }


    @Override
    public String toString() {
        return "Stack{" +
                "arr=" + Arrays.toString(arr) +
                ", index=" + index +
                '}';
    }
}
