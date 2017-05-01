package com.euler;
//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//        a2 + b2 = c2
//        For example, 32 + 42 = 9 + 16 = 25 = 52.
//
//        There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//        Find the product abc.
public class Euler9 {

    // For given m > n > 0 we can generate pythagorean triplet a,b,c:
    // a = m*m - n*n, b = 2*m*n, c = m*m + n*n
    // m,n cannot exceed 32 (or any sum square)
    public static int tripletMult(int sum) {
        // Run over all parameter n,m less than sum square and m > n > 0
        for (int n = 1; n < Math.sqrt(sum); n++) {
            for (int m = n+1; m < Math.sqrt(sum); m++) {
                int a = m*m - n*n;
                int b = 2*m*n;
                int c = m*m + n*n;
                if (a + b + c == sum)
                    return a*b*c;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        // Solution for Euler-9 problem
        System.out.println(tripletMult(1000));
    }
}
