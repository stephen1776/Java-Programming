/*
3.1 (Algebra: solve quadratic equations)
Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0, display one root. Otherwise, display 'The equation
has no real roots.'
 */
import java.util.Scanner;

public class JP0301 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b,2) - 4*a*c;

        if (discriminant > 0) {
            double root_1 = ( -b + Math.pow(discriminant,0.5) )/(2 * a);
            double root_2 = ( -b - Math.pow(discriminant,0.5) )/(2 * a);
            System.out.println("The roots are " + root_1 + " and " + root_2);
        }
        else if (discriminant == 0) {
            double root_1 = ( -b + Math.pow(discriminant,0.5) ) / (2 * a);
            System.out.println("The root is " + root_1);
        }
        else {
            System.out.println("The equation has no real roots.");
        }

    }
}




