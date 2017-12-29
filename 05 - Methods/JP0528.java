/*
0528 (Mersenne prime)
A prime number is called a Mersenne prime if it can be written
in the form for some positive integer p. Write a program that finds all
Mersenne primes with p <= 19 and displays the output as follows:
p 2^p - 1
2 3
3 7
5 31
...
 */

public class JP0528 {

    public static void main(String[] args) {

        long beginTime = System.currentTimeMillis();

        for (int p = 2; p <= 31; p++) {
            int i = (int) (Math.pow(2, p) - 1);

            // Display each number in five positions
            if (isPrime(i)) {
                System.out.println(p + "\t" + i);
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time spent is " + (endTime - beginTime)
                + " milliseconds");
    }

    public static boolean isPrime(int num) {
        if ((num == 1) || (num == 2)) {
            return true;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    static int reversal(int num) {
        int result = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            result = result * 10 + lastDigit;
            num = num / 10;
        }

        return result;
    }

    static boolean isPalindrome(int num) {
        return num == reversal(num);
    }
}
