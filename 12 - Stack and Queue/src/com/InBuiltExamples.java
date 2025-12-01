package com;

import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
//        stack.push(45);
//        stack.push(19);
//        stack.push(28);
//        stack.push(38);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
////        System.out.println(stack.pop());


//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(30);
//        queue.add(66);
//        queue.add(58);
//        queue.add(12);
//        queue.add(14);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(78);
        deque.removeFirst();
    }
}
