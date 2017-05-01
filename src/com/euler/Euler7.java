package com.euler;

//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10,001st prime number?
public class Euler7 {

    // Get the n'th prime number
    public static int nthPrime(int n) {
        int primeCount = 1;
        int candidate = 3;
        int index = 3;
        if (n == 1) return 2;
        // Walk through all odd numbers
        while (primeCount < n) {
            if (EulerUtils.isPrime(index)) {
                candidate = index;
                primeCount++;
            }
            index += 2;
        }
        return candidate;
    }

    public static void main(String[] args) {
        // Solution to Euler-7 problem
        System.out.println(nthPrime(10001));
    }
}
