package com.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human bhavesh = new Human(20, "Bhavesh", 40000, false);
//        Human akshay = new Human(28, "Akshay", 70000, true);
//        Human virat = new Human(37, "Virat", 100000000, true);
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);

        Main funn = new Main();
        funn.fun2();

        fun();
    }

    // this is not dependent on objects
    static void fun() {
//        greeting(); // you cannot use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access non-static stuff without referencing their instances in a static context
        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting() {
//        fun();
        System.out.println("Hello world");
    }
}
