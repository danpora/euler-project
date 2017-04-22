package com.euler;

import java.util.*;
//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?
public class Euler3 {

    public static long biggestPrime(long target) {
        long currTarget = target;
        long maxFactor = 2;
        while(maxFactor <= currTarget) {
            if (currTarget % maxFactor == 0) {
                do {
                    currTarget = currTarget / maxFactor;
                } while (currTarget % maxFactor == 0);
            } else {
                maxFactor++;
            }
        }
        return maxFactor;
    }

    public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter number: ");
		long target = reader.nextLong();
        System.out.println(biggestPrime(target));
    }

}
