/*
0514 (Estimate pi)
Pi can be computed using the following series:
pi = 4(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + (-1)<sup>(i+1)</sup> / (2i - 1)
Write a function that returns m(i) for a given i and write a test program that displays a table.

 */

public class JP0514 {

    public static void main(String[] args) {
        System.out.printf("%-20s%-20s\n", "i", "m(i)");
        for (int i = 1; i <= 1000; i += 100)
            System.out.printf("%-20d%-20.4f\n", i, m(i));
    }

    public static double m(int i) {
        double pi = 0;
        double sign = 1;

        for (int k = 1; k <= i; k++) {
            pi += sign / (2 * k - 1.0);
            sign = -1 * sign; //(-1)^(i+k)
        }

        return 4 * pi;
    }
}
