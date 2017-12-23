/*
5.4 (Display an integer reversed) Write a method with the following header to display
an integer in reverse order:
public static void reverse(int number)
For example, reverse(3456) displays 6543. Write a test program that prompts
the user to enter an integer and displays its reversal.
 */

public class JP0504 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int number = input.nextInt();
        reverse(number);
    }

    public static void reverse(int number) {
        while (number != 0) {
            int remainder = number % 10;
            System.out.print(remainder);
            number = number / 10;
        }

        System.out.println();
    }
}
