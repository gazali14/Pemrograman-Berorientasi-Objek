/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prapertemuan12;

/**
 *
 * @author U53R
 */
import java.util.Date;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Date start = new Date();
 
        int[][] m1 = MatrixGeneratorUtil.generateMatrix(100, 100);
        int[][] m2 = MatrixGeneratorUtil.generateMatrix(100, 100);
        int[][] result = multiply(m1, m2);

        System.out.println("Matrix 1 : ");
        MatrixGeneratorUtil.print(m1);

        System.out.println("\nMatrix 2 : ");
        MatrixGeneratorUtil.print(m2);

        System.out.println("\nOutput Matrix : ");
        MatrixGeneratorUtil.print(result);

        Date end = new Date();
        System.out.println("\n Tanpa Multithreading");
        System.out.println("\nTime taken in milli seconds: " + (end.getTime() - start.getTime()));
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int resultRows = matrix1.length;
        int resultColumns = matrix2[0].length;

        int[][] result = new int[resultRows][resultColumns];

        int columns2 = matrix2[0].length;

        for (int i = 0; i < resultRows; i++) {
            for (int j = 0; j < columns2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < resultColumns; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
    
}
