/*
6.25 (Algebra: solve quadratic equations) Write a method for solving a quadratic equation
 using the following header:
public static int solveQuadratic(double[] eqn, double[] roots)
The coefficients of a quadratic equation ax 2 + bx + c = 0 are passed to the array
eqn and the noncomplex roots are stored in roots. The method returns the number
of roots. See Programming Exercise 3.1 on how to solve a quadratic equation.
Write a program that prompts the user to enter values for a, b, and c and displays
the number of roots and all noncomplex roots.
 */
import java.util.Scanner;
public class JP0625 {
    public static void main(String[] args) {
        double[] eqn = new double[3];
        double[] roots = new double[3];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");

        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }

        int numRoots = solveQuadratic(eqn, roots);

        if (numRoots == 0) {
            System.out.print("No real roots.\n");
        }
        else {
            for (int i = 0; i < numRoots; i++) {
                System.out.println("Root " + (i + 1) + " = " + roots[i]);
            }
        }
    }

    // Method solveQuadratic
    public static int solveQuadratic(double[] eqn, double[] roots){
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        double discriminant = Math.pow(b,2) - 4*a*c;

        if (discriminant > 0.0) {
            roots[0] = ( -b + Math.pow(discriminant,0.5) )/(2 * a);
            roots[1] = ( -b - Math.pow(discriminant,0.5) )/(2 * a);
            return 2;
        }
        else if (discriminant == 0.0) {
            roots[0] = ( -b  ) / (2 * a);
            return 1;
        }
        else {
            return 0; // no real roots
        }
    }
}
