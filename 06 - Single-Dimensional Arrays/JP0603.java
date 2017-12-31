/*
6.3 (Count occurrence of numbers) Write a program that reads the integers between 1
and 100 and counts the occurrences of each. Assume the input ends with 0 .
 */
import java.util.Scanner;
public class JP0603 {
    final static int MAX = 100;

    public static void main(String[] args) {
        int[] counts = new int[MAX];
        int numbers; // hold user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integers between 1 and " + MAX + ": ");
        numbers = input.nextInt();
        while (numbers != 0) {
            counts[numbers - 1]++;
            numbers = input.nextInt();
        }

        for (int i = 0; i < 100; i++) {
            if (counts[i] == 1)
                System.out.println(i + 1 + " occurs 1 time");
            else if (counts[i] > 1)
                System.out.println(i + 1 + " occurs " + counts[i]
                        + " times");
        }
    }

}
