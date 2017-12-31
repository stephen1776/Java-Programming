/*
6.12 (Reverse an array)
The reverse method in Section 6.7 reverses an array by
copying it to a new array. Rewrite the method that reverses the array passed in the
argument and returns this array. Write a test program that prompts the user to
enter ten numbers, invokes the method to reverse the numbers, and displays the
numbers.
 */
import java.util.Scanner;
public class JP0612 {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);	// Create a Scanner
        int[] numbers = new int[10];	// Create an array of length ten

        // Prompt the user to enter ten numbers
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        // Invoke the method to reverse the numbers
        reverse(numbers);

        // Display the numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static int[] reverse(int[] list) {
        for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }

        return list;
    }
}
