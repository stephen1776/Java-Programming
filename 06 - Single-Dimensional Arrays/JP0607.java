/*
(Count single digits) Write a program that generates 100 random integers between 0
and 9 and displays the count for each number.
 */

public class JP0607 {
    /** Main Method */
    public static void main(String[] args) {
        int[] counts = new int[10]; // Array of ten integers

        // Store the counts of 100 random numbers
        for (int i = 1; i <= 100; i++) {
            counts[(int)(Math.random() * 10)]++;
        }

        // Display the results
        System.out.println("Count for each number between 0 and 9:");
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + "s: " + counts[i]);
        }
    }
}
