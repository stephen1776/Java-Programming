# 07 Multidimensional Arrays

#### 0701 (Sum elements column by column) 

Write a method that returns the sum of all the elements in a specified column in a matrix using the following header:  
public static double sumColumn(double[][] m, int columnIndex)  
Write a test program that reads a 3-by-4 matrix and displays the sum of each column.

#### 0702 (Sum the major diagonal in a matrix)

Write a method that sums all the numbers in the major diagonal in an n * n matrix of integers using the following header:  
public static double sumMajorDiagonal(double[][] m)  
Write a test program that reads a 4-by-4 matrix and displays the sum of all its elements on the major diagonal.

#### 0704 (Compute the weekly hours for each employee) 

Suppose the weekly hours for all employees are stored in a two-dimensional array. Each row records an employee’s seven-day work hours with seven columns. For example, the following array stores the work hours for eight employees. Write a program that displays employees and their total hours in decreasing order of the total hours.  

            Su M T W Th F Sa  
    Employee 0 2 4 3 4 5 8 8  
    Employee 1 7 3 4 3 3 4 4  
    Employee 2 3 3 4 3 3 2 2  
    Employee 3 9 3 4 7 3 4 1  
    Employee 4 3 5 4 3 6 3 8  
    Employee 5 3 4 4 6 3 4 4  
    Employee 6 3 7 4 8 3 8 4  
    Employee 7 6 3 5 9 2 7 9  

#### 0705 (Algebra: add two matrices) 

Write a method to add two matrices. The header of the method is as follows:  
public static double[][] addMatrix(double[][] a, double[][] b)  
In order to be added, the two matrices must have the same dimensions and the
same or compatible types of elements. Let c be the resulting matrix. Each element
c<sub>ij</sub> is a<sub>ij</sub> + b<sub>ij</sub>.  
Write a test program that prompts the user to enter two 3 * 3 matrices and dis-
plays their sum. Here is a sample run: 

    Enter matrix1: 1 2 3 4 5 6 7 8 9
    Enter matrix2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2
    The matrices are added as follows
    1.0 2.0 3.0          0.0 2.0 4.0            1.0 4.0 7.0
    4.0 5.0 6.0     +    1.0 4.5 2.2     =      5.0 9.5 8.2
    7.0 8.0 9.0          1.1 4.3 5.2            8.1 12.3 14.2


#### 0706 (Algebra: multiply two matrices)

Write a method to multiply two matrices. The header of the method is:  
public static double[][]  
multiplyMatrix(double[][] a, double[][] b)  
Write a test program that prompts the user to enter two 3 * 3 matrices and displays
their product.

#### 0707 (Points nearest to each other) 
Listing 7.3 gives a program that finds two points
in a two-dimensional space nearest to each other. Revise the program so that it
finds two points in a three-dimensional space nearest to each other. Use a two-
dimensional array to represent the points. Test the program using the following
points:
double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
{2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
{5.5, 4, -0.5}};

The formula for computing the distance between two points (x1, y1, z1) and
(x2, y2, z2) is sqrt( (x2 - x1 )^2 + (y2 - y1 )^2 + (z2 - z1 )^2 ).

#### 0708 (All closest pairs of points) 
Revise Listing 7.3, FindNearestPoints.java, to find all closest pairs of points with the same minimum distance.