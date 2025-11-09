package com.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            int c = a / b;
//            divide(a, b);
            // mimicking
            String name = "Bhavesh";
            if (name.equals("Bhavesh")) {
                throw new MyException("Name is Bhavesh");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Normal exception");
        } finally {
            System.out.println("This will always execute");
        }

    }

    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("Do not divide by zero");
        }
        return  a / b;
    }
}
