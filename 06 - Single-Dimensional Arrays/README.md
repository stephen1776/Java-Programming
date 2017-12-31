# 06 Single-Dimensional Arrays

#### 0602 (Reverse the numbers entered ) 
Write a program that reads ten integers and displays them in the reverse of the order in which they were read.

#### 0603 (Count occurrence of numbers) 
Write a program that reads the integers between 1 and 100 and counts the occurrences of each. Assume the input ends with 0 .

#### 0604 (Analyze scores) 
Write a program that reads an unspecified number of scores and
determines how many scores are above or equal to the average and how many
scores are below the average. Enter a negative number to signify the end of the
input. Assume that the maximum number of scores is 100.

#### 0605 (Print distinct numbers) 
Write a program that reads in ten numbers and displays
distinct numbers (i.e., if a number appears multiple times, it is displayed only
once).

#### 0606 (Revise Listing PrimeNumber.java) 
PrimeNumber.java determines whether a number n is prime by checking whether 2 , 3 , 4 , 5 , 6 , ..., n/2 is a divisor. If a divisor is
found, n is not prime. A more efficient approach is to check whether any of the
prime numbers less than or equal to 2n can divide n evenly. If not, n is prime.
Rewrite Listing 4.14 to display the first 50 prime numbers using this approach.
You need to use an array to store the prime numbers and later use them to check
whether they are possible divisors for n.

#### 0607 (Count single digits) 
Write a program that generates 100 random integers between 0
and 9 and displays the count for each number.

#### 0608 (Average an array) 
Write two overloaded methods that return the average of an
array with the following headers:
public static int average(int[] array)
public static double average(double[] array)
Write a test program that prompts the user to enter ten double values, invokes this
method, and displays the average value.

#### 0609 (Find the smallest element) 
Write a method that finds the smallest element in an
array of double values using the following header:
public static double min(double[] array)
Write a test program that prompts the user to enter ten numbers, invokes this
method to return the minimum value, and displays the minimum value.

#### 0610 (Find the index of the smallest element) 
Write a method that returns the index of
the smallest element in an array of integers. If the number of such elements is
greater than 1, return the smallest index. Use the following header:
public static int indexOfSmallestElement(double[] array)
Write a test program that prompts the user to enter ten numbers, invokes this
method to return the index of the smallest element, and displays the index.

#### 0611 (Statistics: compute deviation) 
Programming Exercise 5.37 computes the standard
deviation of numbers. This exercise uses a different but equivalent formula to
compute the standard deviation of n numbers.
To compute the standard deviation with this formula, you have to store the indi-
vidual numbers using an array, so that they can be used after the mean is obtained.
Your program should contain the following methods:
/** Compute the deviation of double values */  
public static double deviation(double[] x)  
/** Compute the mean of an array of double values */  
public static double mean(double[] x)  
Write a test program that prompts the user to enter ten numbers and displays the
mean and standard deviation.

#### 0612 (Reverse an array) 
The reverse method in Section 6.7 reverses an array by
copying it to a new array. Rewrite the method that reverses the array passed in the
argument and returns this array. Write a test program that prompts the user to
enter ten numbers, invokes the method to reverse the numbers, and displays the
numbers.

#### 0618 (Bubble sort) 
Write a sort method that uses the bubble-sort algorithm. The bubble-
sort algorithm makes several passes through the array. On each pass, successive
neighboring pairs are compared. If a pair is not in order, its values are swapped;
otherwise, the values remain unchanged. The technique is called a bubble sort or
sinking sort because the smaller values gradually “bubble” their way to the top and
the larger values “sink” to the bottom. Write a test program that reads in ten double
numbers, invokes the method, and displays the sorted numbers.

#### 0619 (Sorted?) 
Write the following method that returns true if the list is already sorted
in increasing order.  
public static boolean isSorted(int[] list)
Write a test program that prompts the user to enter a list and displays whether the
list is sorted or not.  
Note that the first number in the input indicates the number of the elements in the list.

#### 0620 (Revise Selection Sort) 
The selection-sort method repeatedly finds the smallest number in the current
array and swaps it with the first. Rewrite this program by finding the largest num-
ber and swapping it with the last. Write a test program that reads in ten double
numbers, invokes the method, and displays the sorted numbers.

#### 0625 (Algebra: solve quadratic equations) 
Write a method for solving a quadratic equation using the following header:  
public static int solveQuadratic(double[] eqn, double[] roots)  
The coefficients of a quadratic equation ax 2 + bx + c = 0 are passed to the array
eqn and the noncomplex roots are stored in roots. The method returns the number of roots.  
Write a program that prompts the user to enter values for a, b, and c and displays
the number of roots and all noncomplex roots.

#### 0626 (Strictly identical arrays) 
The arrays list1 and list2 are strictly identical if
their corresponding elements are equal. Write a method that returns true if
list1 and list2 are strictly identical, using the following header:
public static boolean equals(int[] list1, int[] list2)
Write a test program that prompts the user to enter two lists of integers and dis-
plays whether the two are strictly identical. Here are the sample runs. Note that the
first number in the input indicates the number of the elements in the list.

    Enter list1: 5 2 5 6 1 6
    Enter list2: 5 2 5 6 1 6
    Two lists are strictly identical
               
    Enter list1: 5 2 5 6 6 1
    Enter list2: 5 2 5 6 1 6
    Two lists are not strictly identical

#### 0627 (Identical arrays) 
The arrays list1 and list2 are identical if they have the same
contents. Write a method that returns true if list1 and list2 are identical,
using the following header:  
public static boolean equals(int[] list1, int[] list2)  
Write a test program that prompts the user to enter two lists of integers and dis-
plays whether the two are identical. Here are the sample runs. Note that the first
number in the input indicates the number of the elements in the list.

    Enter list1: 5 2 5 6 6 1
    Enter list2: 5 5 2 6 1 6
    Two lists are identical
      
    Enter list1: 5 5 5 6 6 1
    Enter list2: 5 2 5 6 1 6
    Two lists are not identical

#### 0628 (Math: combinations) 
Write a program that prompts the user to enter 10 integers
and displays all combinations of picking two numbers from the 10.

#### 0630 (Pattern recognition: consecutive four equal numbers) 
Write the following method that tests whether the array has four consecutive numbers with the same
value.  
public static boolean isConsecutiveFour(int[] values)  
Write a test program that prompts the user to enter a series of integers and displays
true if the series contains four consecutive numbers with the same value. Other-
wise, display false. Your program should first prompt the user to enter the input
size—i.e., the number of values in the series.

#### 0631 (Merge two sorted lists) 
Write the following method that merges two sorted lists
into a new sorted list.  
public static int[] merge(int[] list1, int[] list2)  
Implement the method in a way that takes list1.length + list2.length
comparisons. Write a test program that prompts the user to enter two sorted lists
and displays the merged list. Here is a sample run. Note that the first number in the
input indicates the number of the elements in the list.
       
    Enter list1: 5 1 5 16 61 111
    Enter list2: 4 2 4 5 6
    The merged list is 1 2 4 5 5 6 16 61 111
    
#### 0632 (Partition of a list) 
Write the following method that partitions the list using the
first element, called a pivot.  
public static int partition(int[] list)  
After the partition, the elements in the list are rearranged so that all the elements
before the pivot are less than or equal to the pivot and the elements after the pivot
are greater than the pivot. The method returns the index where the pivot is located
in the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8} . After the parti-
tion, the list becomes {3, 2, 5, 9, 6, 8} . Implement the method in a way that takes
list.length comparisons. Write a test program that prompts the user to enter
a list and displays the list after the partition. Here is a sample run. Note that the
first number in the input indicates the number of the elements in the list.)

    Enter list: 8 10 1 5 16 61 9 11 1
    After the partition, the list is 9 1 5 1 10 61 11 16
    




