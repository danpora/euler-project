package com.euler;

//Each new term in the Fibonacci sequence is generated by adding the previous two terms.
//By starting with 1 and 2, the first 10 terms will be:
//
//		1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
//By considering the terms in the Fibonacci sequence whose values do not exceed four million,
//find the sum of the even-valued terms.

public class Euler2 {
	
	public static int fib(int n) {
		if (n == 1 || n == 2)
			return 1;
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	public static int fibEvenSum(int topLimit) {
		boolean isValidVal = true;
		int i = 1;
		int evenCounter = 0;
		while (isValidVal) {
			int currFib = fib(i);
			if (currFib <= topLimit) {
				if (currFib % 2 == 0)
					evenCounter += currFib;
			} else {
				isValidVal = false;
			}
			i++;
		}
		return evenCounter;
	}
	
	public static void main(String args[]) {
		System.out.println(fibEvenSum(4000000));
	}
}
