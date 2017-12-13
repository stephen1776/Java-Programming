/*
0426 (Compute e)
You can approximate e by using the following series:
e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + ... + 1/i!
Write a program that displays the e value for i = 10000, 20000, ..., and 100000.

 */

public class JP0426 {
    public static void main(String[] args) {
        double e = 1;
        double prev_e = 1;

        for (int i = 1; i <= 100000; i++) {
            prev_e = prev_e / i;
            e += prev_e;

            if (i == 10000 || i == 20000 || i == 30000 || i == 40000 ||
                    i == 50000 || i == 60000 || i == 70000 || i == 80000 ||
                    i == 90000 || i == 100000)
                System.out.println("The value of e is " + e + " for i = " + i);
        }
    }
}
