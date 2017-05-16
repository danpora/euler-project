package com.euler;

import java.math.BigInteger;

/**
 * Created by danporat on 16/05/17.
 */
public class Euler15 {

    // Returns number of available routes in an n X m grid
    public static BigInteger gridMoves(long n, long m) {
        // Using Java's BigInteger class for big numbers calculations
        BigInteger nBig = new BigInteger(Long.toString(n));
        BigInteger mBig = new BigInteger(Long.toString(m));
        return (EulerUtils.bigFactorial(n+m).divide(EulerUtils.bigFactorial(n).multiply(EulerUtils.bigFactorial(m))));
    }

    public static void main(String[] args) {
        // Solution for Euler-15 problem
        System.out.println(gridMoves(20,20));
    }
}
