package com.company.examples;

public class Arrays {

    public static void main(String[] args) {

        int[] myArray = { 2, 3, 4 };
        int[] myArray2 = new int[3];
        double[] myArray3 = new double[3];

        System.out.println(java.util.Arrays.toString(myArray));
        System.out.println(java.util.Arrays.toString(myArray2));
        System.out.println(java.util.Arrays.toString(myArray3));

        int[][] matrix = new int[3][3];
        int[][] matrix2 = {{1, 0, 3}, {0, 0, 0}, {0, 0, 0}};

        System.out.println(java.util.Arrays.deepToString(matrix));

    }
}
