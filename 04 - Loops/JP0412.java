/*
4.12 (Find the smallest n such that n^2 > 12,000) Use a while loop to find the smallest
integer n such that n^2 is greater than 12,000.
 */

public class JP0412 {
    public static void main(String[] args) {
        int i = 1;

        while (Math.pow(i,2) <= 12000 ) {
            i++;
        }

        System.out.println("This number is " + i);
    }
}
