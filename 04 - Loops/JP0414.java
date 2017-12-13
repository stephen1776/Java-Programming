/*
0414 (Compute the greatest common divisor)
Write a program that prompts the user to enter two positive integers and displays the gcd.

 */


public class JP0414 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Enter n1
        System.out.print(
                "Enter the first number: ");
        int n1 = input.nextInt();

        // Enter n2
        System.out.print(
                "Enter the second number: ");
        int n2 = input.nextInt();

        int d = (n1 < n2) ? n1 : n2;
        for (; d >= 1; d--) {
            if ((n1 % d == 0) && (n2 % d == 0)) {
                break;
            }
        }

        System.out.println("The GCD of " + n1 + " and " + n2 + " is "
                + d);
    }
}
