package com.epam.projects;

import java.util.*;

public class SortMatrix {
    public static void sortStrMatrixDecrease(int columns, int[][] matrix) {

        for (int countCol = 0; countCol < columns+1; countCol++) {
            System.out.println (Arrays.toString (Arrays.stream ((matrix[countCol])).boxed ().sorted (Comparator
                .reverseOrder ()).toArray ()));
        }
    }

    public static void sortStrMatrixIncrease(int columns, int[][] matrix) {

        for (int countCol = 0; countCol < columns+1; countCol++) {
            System.out.println (Arrays.toString (Arrays.stream ((matrix[countCol])).sorted ().toArray ()));
        }
    }
    public static void sortColumnMatrixIncrease(int columns, int strings, int[][] matrix) {

        ArrayList<Integer> arrayNumber = new ArrayList<> ();
        for (int countCols = 0; countCols < columns; countCols++) {
            for (int countStrings = 0; countStrings < strings; countStrings++) {
                if (arrayNumber.size () < strings) {
                    arrayNumber.add (matrix[countStrings][countCols]);
                }
                arrayNumber.sort (Comparator.naturalOrder ());
            }
            System.out.println ("\nColumn " + (countCols + 1) + ": ");
            for (int i : arrayNumber) {
                System.out.print (i + " ");
            }
            arrayNumber.clear ();
        }
    }
    public static void sortColumnMatrixDecrease(int columns, int strings, int[][] matrix) {

        ArrayList<Integer> arrayNumber = new ArrayList<> ();
        for (int countCols = 0; countCols < columns; countCols++) {
            for (int countStrings = 0; countStrings < strings; countStrings++) {
                if (arrayNumber.size () < strings) {
                    arrayNumber.add (matrix[countStrings][countCols]);
                }
                arrayNumber.sort (Comparator.reverseOrder ());
            }
            System.out.println ("\nColumn " + (countCols + 1) + ": ");
            for (int i : arrayNumber) {
                System.out.print (i + " ");
            }
            arrayNumber.clear ();
        }
    }
}
