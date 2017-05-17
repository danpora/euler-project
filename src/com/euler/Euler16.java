package com.euler;

import java.math.BigInteger;

//215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
//
//        What is the sum of the digits of the number 21000?
public class Euler16 {
    // Get the sum of a given BigInteger digits
    public static long sumOfDigits(BigInteger bi) {
        String str = bi.toString();
        long digitCount = 0;
        for (int i = 0; i < str.length(); i++) {
            digitCount += Character.getNumericValue(str.charAt(i));
        }
        return digitCount;
    }
    public static void main(String[] args) {
        // Solution for Euler-16 problem
        BigInteger bi = new BigInteger("2");
        bi = bi.pow(1000);
        System.out.println(sumOfDigits(bi));
    }
}
