/*
0425 (Compute pi)
You can approximate by using the following series:
pi = 4(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + (-1)^(i+1) / (2i - 1)
Write a program that displays the pi value for i = 10000, 20000, ..., and 100000.

 */

public class JP0425 {
    public static void main(String[] args) {
        double pi = 0;

        for (int i = 1; i <= 100000; i++) {
            pi += 4.0 * (Math.pow((-1), i + 1) / (2*i - 1));

            if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9 || i == 10 ||
                    i == 10000 || i == 20000 || i == 30000 || i == 40000 ||
                    i == 50000 || i == 60000 || i == 70000 || i == 80000 ||
                    i == 90000 || i == 100000)
                System.out.println("The value of pi is " + pi + " for i = " + i);
        }
    }
}
