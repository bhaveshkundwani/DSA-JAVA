package com.principles.inheritance;

import java.util.ArrayList;

public class BoxWeight extends Box {
    double weight;

//    @Override   // we can not override static methods
//    static void greeting() {
//        System.out.println("Hey, I am in BoxWeight class. Greetings!");
//    }

    BoxWeight () {
        this.weight = -1;
    }

    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    BoxWeight (double length, double height, double width, double weight) {
        // used to initialise values present in parent class
        super(length, height, width);  // what is this? call the parent class constructor
//        System.out.println(super.weight);
        this.weight = weight;
    }
}
