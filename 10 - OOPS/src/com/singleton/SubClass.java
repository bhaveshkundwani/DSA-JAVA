package com.singleton;

import com.access.A;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
//        A obj = new A(20, "Bhavesh Kundwani");
        SubClass obj = new SubClass(20, "Bhavesh Kundwani");
//        int n = obj.num;

        System.out.println(obj instanceof Object);
    }
}

class SubSubclass extends SubClass {

    public SubSubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(20, "Bhavesh Kundwani");
//        int n = obj.num;
    }
}

class SubClass2 extends A {

    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(20, "Bhavesh Kundwani");
//        int n = obj.num;
    }
}