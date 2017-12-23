/*
0510 (Use the isPrime Function)
Listing 5.7, PrimeNumberFunction.py, provides the isPrime(number) function for testing whether a number is prime. Use this
function to find the number of prime numbers less than 10,000.
 */

public class JP0510 {
    public static void main(String[] args) {
        int count = 0;
        int N = 10000;
        for (int number = 2; number < N; number++)
            if (isPrime(number))
                count++;

        System.out.println("The number of prime numbers < 10000 is "
                + count + ".");
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
}
