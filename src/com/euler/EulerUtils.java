package com.euler;

import java.math.BigInteger;

/**
 * Common static functions for Euler Problems
 */
public final class EulerUtils {

    // Check if a given number is a prime number
    public static boolean isPrime(long num) {
        // Special case - 2 is prime
        if (num == 2)
            return true;

        // If num is multiple of 2 - it is not prime
        if (num % 2 == 0) return false;

        // Otherwise, check the odd numbers
        for (long i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    // Get number of divisors
    public static long divsorCounter(long num) {
        long divsorCount = 1;
        long currDivider = 2;
        while (num != 1) {
            int maxPrimePower = 0;
            while (num % currDivider == 0 && EulerUtils.isPrime(currDivider)) {
                num = num / currDivider;
                maxPrimePower++;
            }
            divsorCount *= maxPrimePower + 1;
            currDivider++;
        }
        return divsorCount;
    }

    // Factorial calculations
    public static long factorial(long n) {
        long factorial = 1;
        for (long i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Big integers factorial calculations
    public static BigInteger bigFactorial(long n) {
        BigInteger factorial = new BigInteger("1");
        for (long i = 1; i <= n; i++) {
            factorial = factorial.multiply(new BigInteger(Long.toString(i)));
        }
        return factorial;
    }
}
