/*
0527 (Emirp)
An emirp (prime spelled backward) is a nonpalindromic prime number
whose reversal is also a prime. For example, both 17 and 71 are prime numbers, so
17 and 71 are emirps. Write a program that displays the first 100 emirps. Display
10 numbers per line.
 */

public class JP0527 {
    public static void main(String[] args) {
        /** Main Method */
		final int NUMBER_OF_EMIRPS = 100; // Displays the first 100 emirps
		final int EMIRPS_PER_LINE = 10; // Display 10 numbers per line

		int count = 0; // Counts the number of emirps
		int n = 2; // Possible emirps

		// Displays the first 100 emirps. Display 10 numbers per line, 
		// separated by exactly one space
		while (count < NUMBER_OF_EMIRPS) {
			if (isEmirp(n)) {
				count++; // Increment count
				System.out.print(count % EMIRPS_PER_LINE == 0 ? n + "\n" : n + " ");
			}
			n++; // Increment n
		}
	}
    /** Check whether number is prime */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // number is not a prime
            }
        }
        return true; // number is prime
    }

  // Method isPalindrome returns true if number is a palindrome
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static int reverse(int number) {
        String reverse = "";    // Holds reversed number
        String n = number + ""; // Convert number to string
        // Reverse string
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        return Integer.parseInt(reverse); // Return reversed integer
    }
	/** Method isEmirp returns true is number is an emirp. False otherwise */
	public static boolean isEmirp(int num) {
		return isPrime(num) && !isPalindrome(num) && isPrime(reverse(num));
    }
}
