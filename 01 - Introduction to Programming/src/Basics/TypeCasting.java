package Basics;

public class TypeCasting {
    public static void main(String[] args) {
//        1. Implicit Type Casting
        int i = 10;

        // Widening TypeCasting (Automatic/Implicit Casting) from int to long
        long l = i;

        // Widening TypeCasting (Automatic/Implicit Casting) from int to double
        double d = i;

        System.out.println("Integer: " + i);
        System.out.println("Long: " + l);
        System.out.println("Double: " + d);
        System.out.println();

//        2. Explicit Type casting
        double n = 100.245;

        // Narrowing Type Casting
        short j = (short)n;
        int k = (int)n;

        System.out.println("Original Value before Casting " + n);
        System.out.println("After Type Casting to short " + j);
        System.out.println("After Type Casting to int " + k);
    }
}
