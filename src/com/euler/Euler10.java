package com.euler;

/**
 * Created by danporat on 02/05/17.
 */
public class Euler10 {
    public static long sumOfPrimes(int limit) {
        if (limit == 2) return 2;
        long primeCount = 2;
        for (long i = 3; i < limit; i +=2) {
            if (EulerUtils.isPrime(i)) primeCount += i;
        }
        return primeCount;
    }
    public static void main(String[] args) {
        System.out.println(sumOfPrimes(2000000));
    }
}
