package com;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertFirst(29);
        list.insertFirst(47);
        list.insertFirst(93);
        list.display();
//
//        list.insertLast(19);
//        list.insertLast(57);
//        list.display();
//
//        list.insert(30, 3);
//        list.display();
//
//        System.out.println(list.deleteFirst());
//        list.display();
//
//        System.out.println(list.deleteLast());
//        list.display();
//
//        System.out.println(list.delete(2));
//        list.display();
//
//        System.out.println(list.find(90));
//        list.display();

        list.insertRec(88, 2);
        list.display();


//        DoublyLinkedList list = new DoublyLinkedList();
//        list.insertFirst(28);
//        list.insertFirst(84);
//        list.insertFirst(67);
//        list.insertFirst(82);
//        list.insertFirst(54);
//        list.display();
//        list.displayReverse();

//        list.insertLast(78);
//        list.insertLast(56);
//        list.display();

//        list.insert(56, 3);
//        list.display();

//        System.out.println(list.deleteFirst());
//        list.display();

//        System.out.println(list.deleteLast());
//        list.display();

//        System.out.println(list.delete(2));
//        list.display();

//        CircularLinkedList list = new CircularLinkedList();
//        list.insert(10);
//        list.insert(20);
//        list.insert(30);
//        list.insert(40);
//        list.display();
//
//        list.delete(10);
//        list.display();
    }
}
