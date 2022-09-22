package com.java.asml.assignment;

public class MatrixAssignment {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};

        int endRowIndex = matrix.length;
        int endColumnIndex = matrix[0].length;

        int i;
        int startRowIndex = 0, startColumnIndex = 0;

        while (startRowIndex < endRowIndex && startColumnIndex < endColumnIndex) {
            // this will the first row from the remaining rows
            for (i = startColumnIndex; i < endColumnIndex; ++i) {
                System.out.print(matrix[startRowIndex][i] + " ");
            }
            startRowIndex++;

            // this will print the last column of the remaining columns
            for (i = startRowIndex; i < endRowIndex; ++i) {
                System.out.print(matrix[i][endColumnIndex - 1] + " ");
            }
            endColumnIndex--;

            // this will print the last row of the remaining rows
            if (startRowIndex < endRowIndex) {
                for (i = endColumnIndex - 1; i >= startColumnIndex; --i) {
                    System.out.print(matrix[endRowIndex - 1][i] + " ");
                }
                endRowIndex--;
            }

            // this will print the first column of the remaining columns
            if (startColumnIndex < endColumnIndex) {
                for (i = endRowIndex - 1; i >= startRowIndex; --i) {
                    System.out.print(matrix[i][startColumnIndex] + " ");
                }
                startColumnIndex++;
            }
        }
    }
}
