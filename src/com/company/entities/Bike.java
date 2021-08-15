package com.company.entities;

public class Bike implements Movable{

    @Override
    public void move() {
        System.out.println("bike move");
    }
}
