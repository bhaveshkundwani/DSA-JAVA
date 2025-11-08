package com.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(20);
        son.career();
//
        son.normal();
//
        Parent daughter = new Daughter(28);
        daughter.career();
        Parent.hello();

//        cannot create object of an abstract class
//        Parent mom = new Parent(45);
    }
}
