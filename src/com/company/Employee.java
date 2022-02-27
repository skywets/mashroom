package com.company;

public class Employee extends Person{

    String company;
    public Employee(String name, String company){
        super(name);
        this.company = company;
    }

    public void work(){
        System.out.printf("%s works in %s \n", getName(), company);
    }

    @Override
    public void display() {
        //super.display();
        System.out.printf("Employee %s Works in %s \n", super.getName(), company);
    }
}
