package com.interfaces.extendDemo;

public class Main implements B{
    @Override
    public void fun() {
        System.out.println("Fun");
    }

    @Override
    public void greet() {
        System.out.println("Hello");
    }
}
