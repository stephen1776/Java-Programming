/*
6.6 (Revise Listing 4.14, PrimeNumber.java) Listing 4.14 determines whether a num-
ber n is prime by checking whether 2 , 3 , 4 , 5 , 6 , ..., n/2 is a divisor. If a divisor is
found, n is not prime. A more efficient approach is to check whether any of the
prime numbers less than or equal to 2n can divide n evenly. If not, n is prime.
Rewrite Listing 4.14 to display the first 50 prime numbers using this approach.
You need to use an array to store the prime numbers and later use them to check
whether they are possible divisors for n.
 */

public class JP0606 {
    /** Main method */
    public static void main(String[] args) {
        final int NUM_OF_PRIMES = 50;
        // Store prime numbers
        int[] primeNumbers = new int[NUM_OF_PRIMES];
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness
        boolean isPrime = true; // Is the current number prime?

        System.out.println("The first 50 prime numbers are \n");

        // Repeatedly find prime numbers
        while (count < NUM_OF_PRIMES) {
            // Assume the number is prime
            isPrime = true;

            // Exercise03_21 if number is prime
            for (int i = 0; i < count &&
                    primeNumbers[i] <= Math.sqrt(number); i++) {
                //If true, the number is not prime
                if (number % primeNumbers[i] == 0) {
                    // Set isPrime to false, if the number is not prime
                    isPrime = false;
                    break; // Exit the for loop
                }
            }

            // Print the prime number and increase the count
            if (isPrime) {
                primeNumbers[count] = number;
                count++; // Increase the count

                if (count % 10 == 0) {
                    // Print the number and advance to the new line
                    System.out.println(number);
                }
                else
                    System.out.print(number + "\t");
            }

            // Check if the next number is prime
            number++;
        }
    }
}
