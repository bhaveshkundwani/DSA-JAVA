package com;

public class DoublyLinkedList {

    private Node head;

    public int deleteFirst() {
        if (head == null) {
            return -1;
        }
        int value = head.val;
        head = head.next;
        head.prev = null;
        return value;
    }

    public int deleteLast() {
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        int value = secondLast.next.val;
        secondLast.next = null;
        return value;
    }

    public int delete(int index) {
        if (index == 0) {
            int val = head.val;
            head = head.next;
            head.prev = null;
            return val;
        }

        Node temp =  head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        int val = -1;
        if (temp.next.next != null) {
            val = temp.next.val;
            temp.next = temp.next.next;
            temp.next.prev = temp;
        } else {
            val = temp.next.val;
            temp.next = null;
        }
        return val;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) { // if you do not check this condition
            head.prev = node;  // then this line will give NullPointerException if head is already null
        }
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void insert(int after, int val) {
        Node p = find(after);

        if(p == null) {
            System.out.println("Does not exists");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public Node find(int val) {
        Node node = head;
        while (node != null){
            if (node.val == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public void displayReverse() {
        Node node = head;
        Node last = null;
        while (node != null) {
            last = node;
            node = node.next;
        }

        System.out.println("Print in reverse : ");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
