package com.euler;

import java.util.*;

// Problem 1:
// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
// The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.
public class Euler1 {
	public static double sumCalc(int a1, int N, int d) {
		return (((double) N / 2) * (2*a1 + d * (N - 1)));
	}
	
	public static int sumOf3_5(int inputNum) {
		int numOf5 = (inputNum-1)/5;
		int numOf3 = (inputNum-1)/3;
		int numOf15 = (inputNum-1)/15;
		double sumOf5 = sumCalc(5, numOf5, 5);
		double sumOf3 = sumCalc(3, numOf3, 3);
		double sumOf15 = sumCalc(15, numOf15, 15);
		return (int) (sumOf5 + sumOf3 - sumOf15);		
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter number :");
		int inputNum = reader.nextInt();
		System.out.println(sumOf3_5(inputNum));		
	}

}
