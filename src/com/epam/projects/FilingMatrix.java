package com.epam.projects;

public class FilingMatrix {

    public static InputStreamReader filingMatrixInt(int columns, int strings, int[][] matrix) {

        InputStreamReader reader = new InputStreamReader (System.in);
        for (int columnsInd = 0; columnsInd < columns; columnsInd++) {
            for (int stringsInd = 0; stringsInd < strings; stringsInd++) {
                matrix[columnsInd][stringsInd] = ParseNumber.getInt (reader);
            }
        }
        return reader;
    }

    public static InputStreamReader filingMatrixPositiveInt(int columns, int strings, int[][] matrix) throws Exception {

        InputStreamReader reader = new InputStreamReader (System.in);
        for (int columnsInd = 0; columnsInd < columns; columnsInd++) {
            for (int stringsInd = 0; stringsInd < strings; stringsInd++) {
                matrix[columnsInd][stringsInd] = ParseNumber.getPositiveInt (reader);
            }
        }
        return reader;
    }

    public static void fillingMatrixRandomInt(int columns, int strings, int[][] matrix) {

        for (int columnsInd = 0; columnsInd < columns; columnsInd++) {
            for (int stringsInd = 0; stringsInd < strings; stringsInd++) {
                matrix[columnsInd][stringsInd] = (int) (Math.random () * 16);
            }
        }
    }

    public static void CreateArrOneToN(int matrix[][]) {

        int count = 1;
        for (int stringInd = 0; stringInd < matrix.length; stringInd++) {
            for (int columnInd = 0; columnInd < matrix.length; columnInd++) {
                matrix[stringInd][columnInd] = count;
                count++;
            }
        }
    }
}

