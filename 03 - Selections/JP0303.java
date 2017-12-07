/*
3.3 (Algebra: solve linear equations)
You can use Cramer’s rule to solve the
following system of linear equation:
Write a program that prompts the user to enter a, b, c, d, e, and f and display the
result. If ad – bc is 0, report that The equation has no solution.
 */
import java.util.Scanner;

public class JP0303 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double denominator = a*d - b*c;

        if (denominator == 0) {
            System.out.println("The equation has no solution.");
        }
        else {
            double x = (e*d - b*f) / (a*d - b*c);
            double y = (a*f - e*c) / (a*d - b*c);
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}




