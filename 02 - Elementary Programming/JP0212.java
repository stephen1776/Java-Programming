/*
2.12 (Physics: finding runway length) Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula: length = v^2 / (2a)
Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s2), and displays the minimum runway
length. Here is a sample run:
Enter speed 60
Enter acceleration: 3.5
The minimum runway length for this airplane is 514.2857
 */
import java.util.Scanner;

public class JP0212 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed v: ");
        double v = input.nextDouble();
        System.out.print("Enter acceleration a: ");
        double a = input.nextDouble();

        double length = v * v / (2 * a);

        System.out.println("The minimum runway length for this airplane is " +
                length + " meters");
    }
}
