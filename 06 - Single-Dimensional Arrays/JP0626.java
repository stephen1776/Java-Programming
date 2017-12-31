/*
6.26 (Strictly identical arrays) The arrays list1 and list2 are strictly identical if
their corresponding elements are equal. Write a method that returns true if
list1 and list2 are strictly identical, using the following header:
public static boolean equals(int[] list1, int[] list2)
Write a test program that prompts the user to enter two lists of integers and dis-
plays whether the two are strictly identical. Here are the sample runs. Note that the
first number in the input indicates the number of the elements in the list.

Enter list1: 5 2 5 6 1 6
Enter list2: 5 2 5 6 1 6
Two lists are strictly identical
 */

public class JP0626 {
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
            System.out.println("Two lists are strictly identical");
        }
        else {
            System.out.println("Two lists are not strictly identical");
        }
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length)
            return false;

        for (int i = 0; i < list1.length; i++)
            if (list1[i] != list2[i])
                return false;

        return true;
    }
}
