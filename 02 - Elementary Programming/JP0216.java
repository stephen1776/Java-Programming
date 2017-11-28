/*
2.16 (Geometry: area of a hexagon) Write a program that prompts the user to enter the
side of a hexagon and displays its area. The formula for computing the area of a
hexagon is
Area = (3 * sqrt(3) / 2) * s^2,
where s is the length of a side.
Here is a sample run:
Enter the side: 5.5
The area of the hexagon is 78.5895
 */
import java.util.Scanner;
public class JP0216 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the side of the hexagon
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Compute the area
        double area = 3 * 1.732 * side * side / 2;

        System.out.println("The area of the hexagon is " + area);
    }
}
