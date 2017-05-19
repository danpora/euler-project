package com.euler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

//By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.
//
//        3
//        7 4
//        2 4 6
//        8 5 9 3
//
//        That is, 3 + 7 + 4 + 9 = 23.
//
//        Find the maximum total from top to bottom of the triangle below:
public class Euler18 {
    public static final String TRIANGLE =
                                    "75\n" +
                                    "95 64\n" +
                                    "17 47 82\n" +
                                    "18 35 87 10\n" +
                                    "20 04 82 47 65\n" +
                                    "19 01 23 75 03 34\n" +
                                    "88 02 77 73 07 63 67\n" +
                                    "99 65 04 28 06 16 70 92\n" +
                                    "41 41 26 56 83 40 80 70 33\n" +
                                    "41 48 72 33 47 32 37 16 94 29\n" +
                                    "53 71 44 65 25 43 91 52 97 51 14\n" +
                                    "70 11 33 28 77 73 17 78 39 68 17 57\n" +
                                    "91 71 52 38 17 14 91 43 58 50 27 29 48\n" +
                                    "63 66 04 68 89 53 67 30 73 16 69 87 40 31\n" +
                                    "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";

    // Transformation of a String triangle to a 2D int List array
    public static List<List<Integer>> triangleToIntArr(String triangle) {
        BufferedReader bufReader = new BufferedReader(new StringReader(triangle));
        List<List<Integer>> intTriangle = new ArrayList<>();
        String currRow;
        try {
            // For each row in triangle, add it as an integer array to a 2D integer array ('intTriangle')
            while ((currRow = bufReader.readLine()) != null) {
                String[] rowAsChar = currRow.split(" ");
                List<Integer> row = new ArrayList<>();
                for (int i = 0; i < rowAsChar.length; i++) {
                    row.add(Integer.parseInt(rowAsChar[i]));
                }
                intTriangle.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return intTriangle;
    }

    // Generate a 2D max path map out of a given integer triangle
    public static List<List<Integer>> generateMaxRouteMap(List<List<Integer>> triangle) {
        List<List<Integer>> maxRouteMap = new ArrayList<>();
        maxRouteMap.add(triangle.get(0)) ;
        // Iterate over all rows of the triangle tree
        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> row = new ArrayList<>();
            // Iterate over all values in a row, update each entry according to the max of the entry parents
            for (int j = 0; j < triangle.get(i).size(); j++) {
                // Case entry has two parents
                if ( j != 0 && j != triangle.get(i).size()-1)
                    row.add(Math.max(maxRouteMap.get(i-1).get(j), maxRouteMap.get(i-1).get(j-1)) + triangle.get(i).get(j));
                // Case entry has one right parent
                else if ( j == 0)
                    row.add(maxRouteMap.get(i-1).get(j) + triangle.get(i).get(j));
                // Case entry has one left parent
                else
                    row.add(maxRouteMap.get(i-1).get(j-1) + triangle.get(i).get(j));
            }
            maxRouteMap.add(row);
        }
        return maxRouteMap;
    }

    // Get the max route out of the max route map
    public static int getMaxTriangleRouteWeight(List<List<Integer>> maxRouteMap) {
        int maxRoute = 0;
        if (maxRouteMap.isEmpty()) return 0;
        // Iterate over all leaves of max route map, check for max
        for (Integer route : maxRouteMap.get(maxRouteMap.size()-1)) {
            if (route > maxRoute)
                maxRoute = route;
        }
        return maxRoute;
    }

    public static void main(String[] args) {
        // Solution for Euler-18 problem
        List<List<Integer>> maxMap = generateMaxRouteMap(triangleToIntArr(TRIANGLE));
        System.out.println(getMaxTriangleRouteWeight(maxMap));
    }
}