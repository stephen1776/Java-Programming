/*
2.15 (Geometry: area of a triangle) Write a program that prompts the user to enter
three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
The formula for computing the area of a triangle is
s = (side1 + side2 + side3)/2;
area = 2 * sqrt( s * (s - side1)(s - side2)(s - side3) )
Here is a sample run:
Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4
The area of the triangle is 33.6
 */
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class JP0215 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the sides of the triangle
        System.out.print("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Compute the length of the three sides
        double side1 = sqrt( (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) );
        double side2 = sqrt( ((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3)) );
        double side3 = sqrt( (x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2) );

        // Compute the area
        double s = (side1 + side2 + side3) / 2;
        double area = sqrt( s * (s - side1) * (s - side2) * (s - side3) );

        System.out.println("The area of the triangle is " + area);
    }
}
