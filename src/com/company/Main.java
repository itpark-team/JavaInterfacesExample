package com.company;

import com.company.entities.Bike;
import com.company.entities.Car;
import com.company.entities.Movable;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*int action = -1;
        Scanner input = new Scanner(System.in);

        Movable movable = new Car();

        while (true) {
            System.out.print("car - 1, bike - 2, print - 3: ");
            action = input.nextInt();

            switch (action){
                case 1:
                    movable = new Car();
                    break;
                case 2:
                    movable = new Bike();
                    break;
                case 3:
                    movable.move();
                    break;
            }
        }*/


        ArrayList<Movable> movables = new ArrayList<>();
        movables.add(new Bike());
        movables.add(new Car());
        movables.add(new Bike());
        movables.add(new Bike());

        for (int i = 0; i < movables.size(); i++) {
            movables.get(i).move();
        }

    }
}
