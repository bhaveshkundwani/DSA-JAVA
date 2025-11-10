package com;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.insertFirst(29);
        list.insertFirst(47);
        list.insertFirst(93);
        list.display();

        list.insertLast(19);
        list.insertLast(57);
        list.display();

        list.insert(30, 3);
        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(2));
        list.display();

        System.out.println(list.find(90));
        list.display();
    }
}
