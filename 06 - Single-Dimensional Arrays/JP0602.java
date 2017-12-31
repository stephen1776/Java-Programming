/*
(Reverse the numbers entered ) Write a program that reads ten integers and displays
them in the reverse of the order in which they were read.
 */

public class JP0602 {
    public static void main (String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            // Read a number
            System.out.print(
                    "Read a number: ");

            num[i] = input.nextInt();
        }

        // Display the array
        for (int i = 9; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }

}
