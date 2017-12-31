/*
6.28 (Math: combinations) Write a program that prompts the user to enter 10 integers
and displays all combinations of picking two numbers from the 10.
 */
import java.util.Scanner;
public class JP0628 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        final int N = 10;
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++)
            numbers[i] = input.nextInt();

        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                System.out.println(numbers[i] + " " + numbers[j]);
    }

}
