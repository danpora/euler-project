package com.euler;

//A palindromic number reads the same both ways.
//The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.
public class Euler4 {

   /*  Complicated version
   public static boolean isPalindrome(int target) {
        String strTarget = Integer.toString(target);
        // Case number contains even number of integers
        if (strTarget.length() % 2 == 0) {
            String start = strTarget.substring(0, strTarget.length()/2);
            String end = strTarget.substring(strTarget.length()/2, strTarget.length());
            String endReverse = new StringBuilder(end).reverse().toString();
            return start.equals(endReverse);
        }
        // Case number contains even number of integers
        else {
            String start = strTarget.substring(0, strTarget.length()/2);
            String end = strTarget.substring(strTarget.length()/2 + 1, strTarget.length());
            String endReverse = new StringBuilder(end).reverse().toString();
            return start.equals(endReverse);
        }
    }*/

   public static int mult3Permutation(int digits) {
       int maxPalindrome = -1;
       for (int i = (int)Math.pow(10, digits) - 1; i > 1; i--) {
           for (int j = i; j > 1 ; j--) {
               if (isPalindrome(i*j) && maxPalindrome < i*j)  {
                   maxPalindrome = i*j;
                   break;
               }
           }
       }
       return maxPalindrome;
   }

    // More elegant palindrome check
    public static boolean isPalindrome(int target) {
        String reverseStr = "";
        String targetStr = Integer.toString(target);
        for (int i = targetStr.length() -1 ; i >= 0; i--) {
            reverseStr = reverseStr + targetStr.charAt(i);
        }
        return reverseStr.equals(targetStr);
    }

    public static void main(String[] args) {
        System.out.println(mult3Permutation(3));
    }
}
