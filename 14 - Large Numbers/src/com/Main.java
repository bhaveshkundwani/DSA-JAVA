package com;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
//        bigInteger();
        bigDecimal();
//        System.out.println(Factorial.fact(50));
    }

    static void bigDecimal() {
        double x = 0.03;
        double y = 0.04;
        // double ans = y-x;
        // System.out.println(ans);

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal ans = Y.subtract(X);
        System.out.println(ans);

        BigDecimal a = new BigDecimal("456576345675.4546376");
        BigDecimal b = new BigDecimal("547634565352.986785764");

        // constants
        BigDecimal con = BigDecimal.ONE;

        // operations
        System.out.println(b.add(a));
        System.out.println(b.subtract(a));
        System.out.println(b.multiply(a));
        System.out.println(b.pow(2));
        System.out.println(b.negate());
    }

    static void bigInteger() {
        int a = 30;
        int b = 67;

        BigInteger B = BigInteger.valueOf(6); // convert int/long to BigInteger
        int c = B.intValue(); // convert BigInteger to int
        BigInteger V = BigInteger.valueOf(1898823992);
        BigInteger C = new BigInteger("2345678654325678976543256789");
        BigInteger X = new BigInteger("4536789765432");

        // constants
        BigInteger D = BigInteger.TEN;

        // operations
        BigInteger s = C.add(X);
        BigInteger sub = C.subtract(X);
        BigInteger m = C.multiply(X);
        BigInteger d = C.divide(X);
        BigInteger rem = C.remainder(X);

        if (X.compareTo(C) < 0) {
            System.out.println("Yes");
        }
    }
}
