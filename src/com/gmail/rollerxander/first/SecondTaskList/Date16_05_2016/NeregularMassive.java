package com.gmail.rollerxander.first.SecondTaskList.Date16_05_2016;

/**
 * Created by USER on 16.05.2016.
 */
public class NeregularMassive {
    public static void main(String... args) {
        int[][] matrix = new int[5][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i]= new int[i+1];

            for (int t = 0; t < matrix[i].length; t++) {
                System.out.print(matrix[i][t] + "; ");

            }
            System.out.println();
        }
    }
}
