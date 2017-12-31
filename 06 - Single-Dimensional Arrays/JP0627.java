/*
6.27 (Identical arrays) The arrays list1 and list2 are identical if they have the same
contents. Write a method that returns true if list1 and list2 are identical,
using the following header:
public static boolean equals(int[] list1, int[] list2)
Write a test program that prompts the user to enter two lists of integers and dis-
plays whether the two are identical. Note that the first
number in the input indicates the number of the elements in the list.
 */

public class JP0627 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Enter values for list1
        System.out.print("Enter list1: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];

        for (int i = 0; i < list1.length; i++)
            list1[i] = input.nextInt();

        // Enter values for list2
        System.out.print("Enter list2: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];

        for (int i = 0; i < list2.length; i++)
            list2[i] = input.nextInt();

        if (equals(list1, list2)) {
            System.out.println("Two lists are identical");
        }
        else {
            System.out.println("Two lists are not identical");
        }
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length)
            return false;

        // Sort the list
        selectionSort(list1);
        selectionSort(list2);

        for (int i = 0; i < list1.length; i++)
            if (list1[i] != list2[i])
                return false;

        return true;
    }

    /** Method for sorting numbers */
    static void selectionSort(int[] list) {
        int currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.length; i++) {
            // Find the smallest in the list
            currentMin = list[i];
            currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}

