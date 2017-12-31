/*
(Statistics: compute deviation) Programming Exercise 5.37 computes the standard
deviation of numbers. This exercise uses a different but equivalent formula to
compute the standard deviation of n numbers.
To compute the standard deviation with this formula, you have to store the indi-
vidual numbers using an array, so that they can be used after the mean is obtained.
Your program should contain the following methods:
Compute the deviation of double values
public static double deviation(double[] x)
Compute the mean of an array of double values
public static double mean(double[] x)
Write a test program that prompts the user to enter ten numbers and displays the
mean and standard deviation,
 */
import java.util.Scanner;
public class JP0611 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner
        double[] numbers = new double[10]; // Create an array of lentgh 10

        // Prompt the user to enter ten numbers
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();

        // Display the mean and standard deviation
        System.out.printf("The mean is %.2f\n", mean(numbers));
        // System.out.println("The mean is " + mean(numbers));

        System.out.printf("The standard deviation is %.5f", deviation(numbers));
        // System.out.println("The standard deviation is " + deviation(numbers));
    }

    /** Compute the deviation of double values */
    public static double deviation(double[] x) {
        double deviation = 0;
        double mean = mean(x);
        for (double e: x) {
            deviation += Math.pow(e - mean, 2);
        }
        return Math.sqrt(deviation / (x.length - 1));
    }

    /** Compute the mean of an array of double values */
    public static double mean(double[] x) {
        double mean = 0;
        for (double e: x) {
            mean += e;
        }
        return mean / x.length;
    }
}
