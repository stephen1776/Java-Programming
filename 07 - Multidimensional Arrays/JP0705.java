/*
7.5 (Algebra: add two matrices) 
Write a method to add two matrices. The header of the method is as follows:  
public static double[][] addMatrix(double[][] a, double[][] b)  
In order to be added, the two matrices must have the same dimensions and the
same or compatible types of elements. Let c be the resulting matrix. Each element
c<sub>ij</sub> is a<sub>ij</sub> + b<sub>ij</sub>.  
Write a test program that prompts the user to enter two 3 * 3 matrices and dis-
plays their sum.
*/
import java.util.Scanner;

public class JP0705 {
  /** Main method */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    final int N = 3;
    
    // Enter matrix1
    System.out.print("Enter matrix1: ");
    double[][] matrix1 = new double[N][N];
    for (int i = 0; i < matrix1.length; i++)
      for (int j = 0; j < matrix1[i].length; j++) {
        matrix1[i][j] = input.nextDouble();
      }
    
    // Enter matrix2
    System.out.print("Enter matrix2: ");
    double[][] matrix2 = new double[N][N];
    for (int i = 0; i < matrix1.length; i++)
      for (int j = 0; j < matrix1[i].length; j++) {
        matrix2[i][j] = input.nextDouble();
      }

    // Add two matrices and print the result
    double[][] resultMatrix = addMatrix(matrix1, matrix2);
    System.out.println("\nThe addition of the two matrices is: ");
    printResult(matrix1, matrix2, resultMatrix, '+');
  }

 /** addMatrix adds two matrices and returns the result */
 public static double[][] addMatrix(double[][] a, double[][] b) {
    double[][] c = new double[a.length][a.length];

    for (int i = 0; i < c.length; i++) {
        for (int j = 0; j < c[i].length; j++) {
            c[i][j] = a[i][j] + b[i][j];
        }
    }
    return c;
}


  /** Print result */
  public static void printResult(
      double[][] m1, double[][] m2, double[][] m3, char op) {
    for (int i = 0; i < m1.length; i++) {
      for (int j = 0; j < m1[0].length; j++)
        System.out.print(" " + m1[i][j]);

      if (i == m1.length / 2)
        System.out.print( "  " + op + "  " );
      else
        System.out.print( "     " );

      for (int j = 0; j < m2[0].length; j++)
        System.out.print(" " + m2[i][j]);

      if (i == m1.length / 2)
        System.out.print( "  =  " );
      else
        System.out.print( "     " );

      for (int j = 0; j < m3[0].length; j++)
        System.out.print(" " + m3[i][j]);

      System.out.println();
    }
  }
}
