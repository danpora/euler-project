package com.euler;

import java.util.HashMap;

//The following iterative sequence is defined for the set of positive integers:
//
//        n → n/2 (n is even)
//        n → 3n + 1 (n is odd)
//
//        Using the rule above and starting with 13, we generate the following sequence:
//
//        13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
//        It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
//
//        Which starting number, under one million, produces the longest chain?
public class Euler14 {

    // Return the biggest number under 'maxStart' number which produces the largest Collatz chain
    public static long maxCollatzChain(long maxStart) {
        HashMap<Long, Long> savedCollatzMap = new HashMap<>();

        long maxStarter = 1;
        long maxChain = 1;

        // Iterate over all numbers up to 'maxStart'
        for (long i = 2; i <= maxStart; i++) {
            long currStarter = i;
            long currChain = 1;
            // Break down current number into Collatz chain
            while(currStarter != 1) {
                // Check if current number is signed in Map already
                if (savedCollatzMap.containsKey(currStarter)) {
                    currChain += savedCollatzMap.get(currStarter);
                    break;
                }
                // Get next Collatz number
                else {
                    currStarter = getNextCollatz(currStarter);
                    currChain++;
                }
            }

            // Sign number and it's chain length in Map
            savedCollatzMap.put(i, currChain);

            // Update maxChain candidate if necessary
            if (currChain > maxChain) {
                maxChain = currChain;
                maxStarter = i;
            }
        }
        return maxStarter;
    }

    // Method to get produce Collatz next value
    public static long getNextCollatz(long num) {
        return num % 2 == 0 ? num/2 : num*3 + 1;
    }

    public static void main(String[] args) {
        // Solution for Euler-14 problem
        System.out.println(maxCollatzChain(1000000));
    }
}
