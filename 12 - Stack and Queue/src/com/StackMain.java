package com;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new DynamicStack(5);

        stack.push(38);
        stack.push(47);
        stack.push(20);
        stack.push(18);
        stack.push(55);
//        stack.push(89);

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }
}
