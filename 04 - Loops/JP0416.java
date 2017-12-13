/*
0416 (Find the factors of an integer)
Write a program that reads an integer and displays all its smallest factors, also known as prime factors.

 */
public class JP0416 {
    public static void main(String args[]) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print(
                "Enter a positive integer: ");
        int number = input.nextInt();

        // Find all the smallest factors of the integer
        System.out.println("The factors for " + number + " are:");
        int factor = 2;
        while (factor <= number) {
            if (number % factor == 0) {
                number = number / factor;
                System.out.println(factor);
            }
            else {
                factor++;
            }
        }
    }
}
