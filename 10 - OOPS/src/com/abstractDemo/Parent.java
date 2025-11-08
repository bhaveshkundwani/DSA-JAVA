package com.abstractDemo;

public abstract class Parent {
    int age;
    final int VALUE;
//
    public Parent(int age) {
        this.age = age;
        VALUE = 36789;
    }

    static void hello(){
        System.out.println("hey");
    }

    void normal() {
        System.out.println("this is a normal method");
    }

    abstract void career();
}
