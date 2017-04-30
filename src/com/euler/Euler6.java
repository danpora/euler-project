package com.euler;
//The sum of the squares of the first ten natural numbers is,
//
//        12 + 22 + ... + 102 = 385
//        The square of the sum of the first ten natural numbers is,
//
//        (1 + 2 + ... + 10)2 = 552 = 3025
//        Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//
//        Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
public class Euler6 {
    // Calculate sum of squares from 'start' to 'end
    public static int sumOfSquares(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) sum += i * i;
        return sum;
    }

    // Calculate square of sum from 'start' to 'end
    public static int squareOfSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) sum += i;
        return sum*sum;
    }

    public static int sumSquareDiff(int start, int end) {
        return squareOfSum(start, end) - sumOfSquares(start, end);
    }

    public static void main(String[] args) {
        // Solution for Euler-6 problem
        System.out.println(sumSquareDiff(1, 100));
    }
}
