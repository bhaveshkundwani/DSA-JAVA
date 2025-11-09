package com.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human bhavesh = new Human(20, "Bhavesh Kundwani");
//        Human twin = new Human(Bhavesh);

        Human twin = (Human)bhavesh.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 82;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(bhavesh.arr));
    }
}
