/*
7.1 (Sum elements column by column) Write a method that returns the sum of all the
elements in a specified column in a matrix using the following header:
public static double sumColumn(double[][] m, int columnIndex)
Write a test program that reads a 3-by-4 matrix and displays the sum of each col-
umn.
*/

import java.util.Scanner;

public class JP0701 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a 3 by 4 matrix row by row: ");
    double[][] m = new double[3][4];
    
    for (int i = 0; i < 3; i++)
      for (int j = 0; j < 4; j++)
        m[i][j] = input.nextDouble();


    // Print the sum for all the columns
    for (int j = 0; j < 4; j++) {
        System.out.println("Sum of the elements at column " + j + " is " + 
        sumColumn(m, j));
    }
  }
  
  public static double sumColumn(double[][] m, int columnIndex) {
    double sum = 0;

    for (int rowIndex = 0; rowIndex < m.length; rowIndex++)
        sum += m[rowIndex][columnIndex];

    return sum;
  }  
}