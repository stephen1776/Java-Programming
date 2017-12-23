/*
0513 (Sum series)
Write a function to compute the following series:
m(i) = 1/2 + 2/3 + ... + i/(i + 1)
Write a test program that displays a table.
 */

public class JP0513 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n", "i", "m(i)");
        for (int i = 1; i <= 20; i++)
            System.out.printf("%-10d%-10.4f\n", i, m(i));
    }

    public static double m(int i) {
        double sum = 0;
        for (int k = 1; k <= i; k++) {
            sum += k / (k + 1.0);
        }

        return sum;
    }

}

