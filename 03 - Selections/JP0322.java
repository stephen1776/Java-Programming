/*
(Geometry: point in a circle?) Write a program that prompts the user to enter a
point (x, y) and checks whether the point is within the circle centered at (0, 0) with
radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the circle,
 */

import java.util.Scanner;

public class JP0322 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Enter a point with two double values
    System.out.print("Enter a point with two coordinates: ");
    double x = input.nextDouble();
    double y = input.nextDouble();

    // Compute the distance
    double distance = Math.pow(x * x +  y * y, 0.5);
    
    if (distance <= 10)
      System.out.println("Point (" + x + ", " + y + 
        ") is in the circle");
    else
      System.out.println("Point (" + x + ", " + y + 
        ") is not in the circle");
  }
}
