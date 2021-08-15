package com.company.entities;

public class Car implements Movable{

    @Override
    public void move() {
        System.out.println("car move");
    }
}
