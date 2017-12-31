/*
6.30 (Pattern recognition: consecutive four equal numbers) Write the following
method that tests whether the array has four consecutive numbers with the same
value.
public static boolean isConsecutiveFour(int[] values)
Write a test program that prompts the user to enter a series of integers and displays
true if the series contains four consecutive numbers with the same value. Other-
wise, display false. Your program should first prompt the user to enter the input
size—i.e., the number of values in the series.
 */

public class JP0630 {
    public static void main (String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int size = input.nextInt();

        int[] values = new int[size];

        System.out.print("Enter the values: ");
        for (int i = 0; i < values.length; i++)
            values[i] = input.nextInt();

        if (isConsecutiveFour(values))
            System.out.println("The series has consecutive fours");
        else
            System.out.println("The series has no consecutive fours");
    }

    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 0; i < values.length - 3; i++) {
            boolean isEqual = true;
            for (int j = i; j < i + 3; j++) {
                if (values[j] != values[j + 1]) {
                    isEqual = false;
                    break;
                }
            }

            if (isEqual) return true;
        }

        return false;
    }
}
