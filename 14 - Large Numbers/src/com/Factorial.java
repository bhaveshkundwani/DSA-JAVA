package com;

import java.math.BigInteger;

public class Factorial {
    static BigInteger fact(int num) {
        BigInteger ans = new BigInteger("1");

        for (int i = 1; i <= num; i++)   {
            ans = ans.multiply(BigInteger.valueOf(i));
        }

        return ans;
    }
}
