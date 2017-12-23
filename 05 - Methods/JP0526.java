/*
0526 (Palindromic prime)
A palindromic prime is a prime number that is also palindromic.
For example, 131 is a prime and also a palindromic prime, as are 313 and
757. Write a program that displays the first 100 palindromic prime numbers. Display
10 numbers per line.
 */

public class JP0526 {
    public static void main(String[] args) {
        int count = 1;

        for (int i = 2; true; i++) {
            // Display each number in five positions
            if (isPrime(i) && isPalindrome(i)) {
                System.out.print(i + " ");

                if (count % 10 == 0) {
                    System.out.println();
                }

                if (count == 100) {
                    break;
                }

                count++; // Increase count
            }
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    /** Return the reversal of number */
    static int reversal(int number) {
        int result = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            result = result * 10 + lastDigit;
            number = number / 10;
        }

        return result;
    }

    /** Return true if number is palindromic */
    static boolean isPalindrome(int number) {

        return number == reversal(number);
    }
}
