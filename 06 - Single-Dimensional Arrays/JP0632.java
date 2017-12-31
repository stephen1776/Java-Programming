/*
6.32 (Partition of a list) Write the following method that partitions the list using the
first element, called a pivot.
public static int partition(int[] list)
After the partition, the elements in the list are rearranged so that all the elements
before the pivot are less than or equal to the pivot and the elements after the pivot
are greater than the pivot. The method returns the index where the pivot is located
in the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8} . After the parti-
tion, the list becomes {3, 2, 5, 9, 6, 8} . Implement the method in a way that takes
list.length comparisons. Write a test program that prompts the user to enter
a list and displays the list after the partition. Here is a sample run. Note that the
first number in the input indicates the number of the elements in the list.
 */
import java.util.Scanner;
public class JP0632 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter values for list1
        System.out.print("Enter a list: ");
        int size = input.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++)
            list[i] = input.nextInt();

        partition(list);

        System.out.print("After the partition, the list is ");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

    /** Partition the array list[first..last] */
    public static int partition(int[] list) {
        int first = 0;
        int last = list.length - 1;
        int pivot = list[first]; // Choose the first element as the pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search

        while (high > low) {
            // Search forward from left
            while (low <= high && list[low] <= pivot)
                low++;

            // Search backward from right
            while (low <= high && list[high] > pivot)
                high--;

            // Swap two elements in the list
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot)
            high--;

        // Swap pivot with list[high]
        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else {
            return first;
        }
    }
}
