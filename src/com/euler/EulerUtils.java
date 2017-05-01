package com.euler;
/**
 Common static functions for Euler Problems
 */
public final class EulerUtils {

    public static boolean isPrime(long num) {
        // Special case - 2 is prime
        if (num == 2)
            return true;

        // If num is multiple of 2 - it is not prime
        if (num % 2 == 0) return false;

        // Otherwise, check the odd numbers
        for (long i = 3; i * i <= num ; i += 2) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}
