package com.euler;

//What is the value of the first triangle number to have over five hundred divisors?
public class Euler12 {

    // Get the first triangle number with more than a given number of divisors
    public static long triangleDivisors(int divisorCount) {
        long currTriangle = 1;
        // In order to find a triangle number we have to add 2 to the addition sum every iteration
        long nextAddition = 2;
        // Loop until a triangle with more than 'divisorCount' found
        while (EulerUtils.divsorCounter(currTriangle) < divisorCount) {
            currTriangle += nextAddition;
            nextAddition++;
        }
        return currTriangle;
    }

    public static void main(String[] args) {
        // Solution for Euler-12 problem
        System.out.println(triangleDivisors(500));
    }
}
