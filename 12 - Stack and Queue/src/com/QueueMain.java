package com;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(28);
        queue.insert(94);
        queue.insert(55);
        queue.insert(10);
        queue.insert(98);

        queue.display();

        System.out.println(queue.remove());
        queue.insert(23);
        queue.display();

        System.out.println(queue.remove());
        queue.insert(67);
        queue.display();

    }
}
