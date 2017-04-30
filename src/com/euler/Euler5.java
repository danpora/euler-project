package com.euler;

/**
 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Euler5 {

    public static boolean isPrime(int num) {
        // Special case - 2 is prime
        if (num == 2)
            return true;

        // If num is multiple of 2 - it is not prime
        if (num % 2 == 0) return false;

        // Otherwise, check the odd numbers
        for (int i = 3; i * i <= num ; i += 2) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static int smallestMult(int topNum) {
        int minFactor = 1;
        for (int i = 2 ; i <= topNum; i++) {
            if (isPrime(i)) {
                minFactor *= Math.pow(i,(int)Math.floor(Math.log(topNum)/Math.log(i)));
            }
        }
        return minFactor;
    }


    public static void main(String[] args) {
        System.out.println(smallestMult(20));
    }
}
