/*
4.23 (Obtain more accurate results)
In computing the following series, you will obtain more accurate results by computing
from right to left rather than from left to right:
1 + 1/2 + 1/3 + ... + 1/n
Write a program that compares the results of the summation of the preceding
series, computing both from left to right and from right to left with n = 50000.
 */

public class JP0423 {
    public static void main(String[] args) {
        int n = 50000;
        // Compute from left to right
        double sumLR = 0;
        for (int i = 1; i <= n; i += 1)
            sumLR += 1.0 / i;
        System.out.println("The sum from left to right is: " + sumLR);
        // Compute from right to left
        double sumRL = 0;
        for (int i = 0; i <= n - 1; i += 1)
            sumRL += 1.0 / (n - i);
        System.out.println("The sum from right to left is: " + sumRL);


    }
}

