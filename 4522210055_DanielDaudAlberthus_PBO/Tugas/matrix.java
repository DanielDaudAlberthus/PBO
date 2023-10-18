package Tugas;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double matrix1[][] = new double[2][2];
        double matrix2[][] = new double[2][2];

        System.out.println("Masukkan nilai matriks A:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matrix1[i][j] = input.nextDouble();
            }
        }

        System.out.println("MATRIX A :");
        printMatrix(matrix1);

        System.out.println("Pilih operasi: ");
        System.out.println("1. Penjumlahan Matriks A dan B");
        System.out.println("2. Pengurangan Matriks A dan B");
        System.out.println("3. Transpose Matriks A");
        System.out.println("4. Invers Matriks A");
        System.out.println("5. Dot Matriks A dan B");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Masukkan nilai matriks B:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print("Elemen [" + i + "][" + j + "]: ");
                        matrix2[i][j] = input.nextDouble();
                    }
                }
                System.out.println("Matrix A + Matrix B :");
                double[][] additionResult = addMatrices(matrix1, matrix2);
                printMatrix(additionResult);
                break;
            case 2:
                System.out.println("Masukkan nilai matriks B:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print("Elemen [" + i + "][" + j + "]: ");
                        matrix2[i][j] = input.nextDouble();
                    }
                }
                System.out.println("Matrix A - Matrix B :");
                double[][] subtractionResult = subtractMatrices(matrix1, matrix2);
                printMatrix(subtractionResult);
                break;
            case 3:
                System.out.println("Transpose Matrix A :");
                double[][] transposedMatrix = transposeMatrix(matrix1);
                printMatrix(transposedMatrix);
                break;
            case 4:
                System.out.println("Inverse Matrix A :");
                double[][] inverseMatrix = inverseMatrix(matrix1);
                printMatrix(inverseMatrix);
                break;
            case 5:
                System.out.println("Masukkan nilai matriks B:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print("Elemen [" + i + "][" + j + "]: ");
                        matrix2[i][j] = input.nextDouble();
                    }
                }
                System.out.println("Dot Matrix A * B :");
                double dotProduct = dotMatrix(matrix1, matrix2);
                System.out.println(dotProduct);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] addMatrices(double[][] matrix1, double[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static double[][] subtractMatrices(double[][] matrix1, double[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposedMatrix = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    public static double[][] inverseMatrix(double[][] matrix) {
        // Implement your matrix inversion logic here
        return matrix; // Placeholder, implement the actual inversion
    }

    public static double dotMatrix(double[][] matrix1, double[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double dotProduct = 0.0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dotProduct += matrix1[i][j] * matrix2[i][j];
            }
        }
        return dotProduct;
    }
}
