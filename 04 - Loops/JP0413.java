/*
4.13 (Find the largest n such that n^3 < 12,000)
Use a while loop to find the largest integer n such that n^3 is less than 12,000.

 */

public class JP0413 {
    public static void main(String[] args) {
        int i = 1;

        while (Math.pow(i,3) < 12000 ) {
            i++;
        }
        int j = i - 1;

        System.out.println("This number is " + j);
    }
}
