/*
0529 (Twin primes)
Twin primes are a pair of prime numbers that differ by 2. For example,
3 and 5, 5 and 7, and 11 and 13 are twin primes. Write a program to find all
twin primes less than 1,000. Display the output as follows:
(3, 5)
(5, 7)
...
 */

public class JP0529 {
        /** Main Method */
	public static void main(String[] args) {
		// Find  and display all twin primes less than 1,000
		System.out.println();
		for (int p = 2; p < 1000; p++) {
			if (isTwinprime(p))
				System.out.println("(" + p + ", " + (p + 2) + ")");
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

	/** Method isTwinprime returns true if num and num + 2 are primes */
	public static boolean isTwinprime(int num) {
		return isPrime(num) && isPrime(num + 2);
	}
        
    
}
