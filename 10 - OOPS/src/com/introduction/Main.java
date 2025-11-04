package com.introduction;

// create a class
// for every single student
class Student {
    int rollNo;
    String name;
    float marks = 90.5f;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object

//    Student () {
//        this.rollNo = 20;
//        this.name = "Bhavesh Kundwani";
//        this.marks = 92.4f;
//    }

    // Student raj = new Student(17, "Raj", 89.7f);
    // here, this will be replaced with raj
    Student (int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other) {
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;
    }

    Student() {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        // store 5 roll numbers
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

//        Student bhavesh;  // just declaring
//        bhavesh = new Student();

        Student bhavesh = new Student();
        Student raj = new Student(12, "Raj", 89.4f);

//        bhavesh.rollNo = 13;
//        bhavesh.name = "Bhavesh Kundwani";
//        bhavesh.marks = 88.5f;


//        bhavesh.changeName("Jatin");
//        bhavesh.greeting();

//        System.out.println(bhavesh.rollNo);
//        System.out.println(bhavesh.name);
//        System.out.println(bhavesh.marks);

        System.out.println(raj.rollNo);
        System.out.println(raj.name);
        System.out.println(raj.marks);

        Student random = new Student(raj);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.rollNo);

        Student one = new Student();
        Student two = one;

        one.name = "Palash";
        System.out.println(two.name);
    }
}
