package com.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student bhavesh = new Student(12, 89.76f);
        Student virat = new Student(5, 99.52f);
        Student raj = new Student(2, 95.52f);
        Student jatin = new Student(13, 77.52f);
        Student rahul = new Student(9, 96.52f);

        Student[] list = {bhavesh, virat, raj, jatin, rahul};

        System.out.println(Arrays.toString(list));
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int)(o1.marks - o2.marks); // here - represent sort in descending order,  if I remove - then ascending order
//            }
//        });

        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));

//        if (bhavesh.compareTo(rahul) < 0) {
//            System.out.println(bhavesh.compareTo(rahul));
//            System.out.println("Rahul has more marks");
//        }
    }
}
