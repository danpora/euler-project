package com.euler;


// The problem:
// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
public class Euler5 {

    public static int smallestMult(int topNum) {
        // Initial factor, 1 is the minimum factor to all integer numbers
        int minFactor = 1;
        // Walk through all prime numbers until 'topNum'
        for (int i = 2 ; i <= topNum; i++) {
            if (EulerUtils.isPrime(i)) {
                // Add multiplication of all occurrences of 'i'
                minFactor *= Math.pow(i,(int)Math.floor(Math.log(topNum)/Math.log(i)));
            }
        }
        return minFactor;
    }


    public static void main(String[] args) {
        // Solution for Euler-5 example
        System.out.println(smallestMult(20));
    }
}
