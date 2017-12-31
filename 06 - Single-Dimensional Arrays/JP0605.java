/*
6.5 (Print distinct numbers) Write a program that reads in ten numbers and displays
distinct numbers (i.e., if a number appears multiple times, it is displayed only
once).
 */
import java.util.Scanner;
public class JP0605 {
    /** Main Method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] distinctNumbers = new int[10]; // Array of length 10;
        int num; 				// User input
        int count = 0;			// Number of distinct numbers

        // Prompt the user to enter ten numbers
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            num = input.nextInt();

            // Test if num is distinct
            if (isDistinct(distinctNumbers, num)) {
                distinctNumbers[count] = num;
                count++;	// Increment count
            }
        }

        // Displays the results
        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are");
        for (int i = 0; i < distinctNumbers.length; i++) {
            if (distinctNumbers[i] > 0)
                System.out.print(" " + distinctNumbers[i]);
        }
        System.out.println();
    }

    // Returns true if number is not in array false otherwise */
    public static boolean isDistinct(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i])
                return false;
        }
        return true;
    }
}
