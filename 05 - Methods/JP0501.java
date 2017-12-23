/*
5.1 (Math: pentagonal numbers) A pentagonal number is defined as n(3n–1)/2 for
n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . .
Write a method with the following header that returns a pentagonal number:
public static int getPentagonalNumber(int n)
Write a test program that uses this method to display the first 100 pentagonal
numbers with 10 numbers on each line
 */

public class JP0501 {
    public static void main(String[] args) {
        // Constants
        // Display 10 number per line
        final int NUMBER_PER_LINE = 10;
        // Display the first 100 pentagonals
        final int NUMBER_OF_PENTAGONALS = 100;

        System.out.println("The first 100 pentagonal numbers are: ");
        for (int i = 1; i <= NUMBER_OF_PENTAGONALS; i++) {
            // Print ten numbers per line
            if (i % NUMBER_PER_LINE == 0)
                System.out.printf("%6d\n", getPentagonalNumber(i));
            else
                System.out.printf("%6d", getPentagonalNumber(i));
        }
    }

    // Return pentagonal number
    public static int getPentagonalNumber(int n) {
        return (n * (3 * n - 1)) / 2;
    }
}
