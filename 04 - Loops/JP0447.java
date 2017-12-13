/*
0447 (Statistics: compute mean and standard deviation)
In business applications, you are often asked to compute the mean and standard deviation of data. The mean is
simply the average of the numbers. The standard deviation is a statistic that tells
you how tightly all the various data are clustered around the mean in a set of data.
Write a program that prompts the user to enter ten numbers, and displays the mean and standard deviations
of these numbers.
 */

import java.util.Scanner;

public class JP0447 {
    public static void main(String[] args) {
        double COUNT = 10; // Total numbers
        double sum = 0; //Store the sum of the numbers
        double squareSum = 0; //Store the sum of the squares

        // Create numbers, find its sum, and its square sum
        for (int i = 0; i < COUNT; i++) {
            // Get a new number
            System.out.print("Enter a number: ");
            Scanner input = new Scanner(System.in);
            double num = input.nextDouble();

            // Add the number to sum
            sum += num;

            // Add the square of the number to squareSum
            squareSum += Math.pow(num,2); //# Same as num*num;
        }
        // Find mean
        double mean = sum / COUNT;

        // Find standard deviation
        double sd = Math.sqrt((squareSum - sum * sum / COUNT) / (COUNT - 1));

        // Display result
        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + sd);
    }
}




