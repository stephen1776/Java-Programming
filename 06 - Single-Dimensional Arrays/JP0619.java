/*
6.19 (Sorted?) Write the following method that returns true if the list is already sorted
in increasing order.
public static boolean isSorted(int[] list)
Write a test program that prompts the user to enter a list and displays whether the
list is sorted or not.
Note that the first number in the input indicates the number of the elements in the list.
 */
import java.util.Scanner;
public class JP0619 {
    /** Main method */
    public static void main(String[] args) {
        // create a scanner to be used for getting input
        Scanner input = new Scanner(System.in);

        // get number of elements in the list from the user
        System.out.print("Enter list: ");
        int listSize = input.nextInt();

        // create an array for storing list numbers
        int[] list = new int[listSize];

        // get numbers from the user and put them in the list
        for (int i = 0; i < listSize; i++) {
            list[i] = input.nextInt();
        }

        if (isSorted(list)) {
            System.out.println("The list is sorted");
        } else {
            System.out.println("The list is not sorted");
        }
    }
    /** Method isSorted returns true if the list is already sorted
     *   in increasing order. Otherwise false */
    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
