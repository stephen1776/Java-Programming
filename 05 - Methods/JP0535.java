/*
5.35
(Geometry: area of a pentagon) The area of a pentagon can be computed using the
following formula:
Area = (5 * s^2) / (4 * tan(pi / 5) )5
Write a program that prompts the user to enter the side of a pentagon and displays the area. 
Here is a sample run:
Enter the side: 5.5
The area of the pentagon is 52.04444136781625

*/
import java.util.Scanner;

public class JP0535 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Number of sides of a pentagon
    int n = 5;

    // Get Side length
    System.out.print("Enter the side length: ");
    double side = input.nextDouble();
    
    System.out.println("The area of the pentagon is " + 
      area(n, side));
  }
  
  // compute the area
  public static double area(int n, double side) {
    return (n * Math.pow(side,2) )/ ( 4 * Math.tan(Math.PI / n) );
  }
}