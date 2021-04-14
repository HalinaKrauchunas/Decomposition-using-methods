package com.epam.projects;

import java.util.*;

public class PrintMatrix {

    public static void printMatrixInt(int[][] matrix) {

        for (int[] arr : matrix) {
            System.out.println (Arrays.toString (arr));
        }
    }
    public static void printMatrixDouble(double[][] matrix) {

        for (double[] arr : matrix) {
            System.out.println (Arrays.toString (arr));
        }
    }
}
