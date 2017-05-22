package com.euler;

import java.math.BigInteger;

//n! means n × (n − 1) × ... × 3 × 2 × 1
//
//        For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
//        and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
//
//        Find the sum of the digits in the number 100!

public class Euler20 {
    // Sum all digits of the given number factorial
    public static long factorialSumDigit(int factorial) {
        BigInteger disZeroFactorial = EulerUtils.bigFactorial(factorial);
        long digitSum = 0;
        // Divide factorial by 10 until 0 is reached
        while (!disZeroFactorial.toString().equals("0")) {
            digitSum += Integer.parseInt(disZeroFactorial.mod(new BigInteger("10")).toString());
            disZeroFactorial = disZeroFactorial.divide(new BigInteger("10"));
        }
        return digitSum;
    }

    public static void main(String[] args) {
        // Solution for Euler-20 problem
        System.out.println(factorialSumDigit(100));
    }

}
