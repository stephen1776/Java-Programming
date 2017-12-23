# 05 - Methods
#### 0501 (Math: pentagonal numbers) 
A pentagonal number is defined as n(3n–1)/2 for
n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . .
Write a method with the following header that returns a pentagonal number:
public static int getPentagonalNumber(int n)
Write a test program that uses this method to display the first 100 pentagonal
numbers with 10 numbers on each line.
#### 0502 (Sum the digits in an integer) 
Write a method that computes the sum of the digits
in an integer. Use the following method header:
public static int sumDigits(long n)
For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % operator
to extract digits, and the / operator to remove the extracted digit. For instance,
to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10
(= 23). Use a loop to repeatedly extract and remove the digit until all the digits
are extracted. Write a test program that prompts the user to enter an integer and
displays the sum of all its digits.
#### 0503 (Palindrome integer) 
Write the methods with the following headers  
// Return the reversal of an integer, i.e., reverse(456) returns 654  
public static int reverse(int number)  
// Return true if number is a palindrome  
public static boolean isPalindrome(int number)  
Use the reverse method to implement isPalindrome. A number is a palindrome
if its reversal is the same as itself. Write a test program that prompts the
user to enter an integer and reports whether the integer is a palindrome.
#### 0504 (Display an integer reversed) 
Write a method with the following header to display
an integer in reverse order:  
public static void reverse(int number)  
For example, reverse(3456) displays 6543. Write a test program that prompts
the user to enter an integer and displays its reversal. 
#### 0505 (Sort three numbers) 
Write a method with the following header to display three
numbers in increasing order:
public static void displaySortedNumbers(double num1, double num2, double num3)  
Write a test program that prompts the user to enter three numbers and invokes the
method to display them in increasing order.
#### 0508 Conversions between Celsius and Fahrenheit) 
Write a module that contains the following two functions:  

public static double celsiusToFahrenheit(double celsius)
Converts from Celsius to Fahrenheit  

public static double fahrenheitToCelsius(double fahrenheit) 
Converts from Fahrenheit to Celsius  

The formulas for the conversion are:  
celsius = (5 / 9) * (fahrenheit – 32)  
fahrenheit = (9 / 5) * celsius + 32  
Write a test program that invokes these functions to display tables.
#### 0509 (Conversions between feet and meters) 
Write a module that contains the following two functions:

public static double footToMeter(double foot) 
Converts from feet to meters

public static double meterToFoot(double meter) 
Converts from meters to feet

The formulas for the conversion are:  
foot = meter / 0.305  
meter = 0.305 * foot  
Write a test program that invokes these functions to display tables.

#### 0510 (Use the isPrime Function) 
Listing 5.7, PrimeNumberFunction.py, provides the isPrime(number) function for testing whether a number is prime. Use this
function to find the number of prime numbers less than 10,000.

#### 0513 (Sum series) 
Write a function to compute the following series:  
m(i) = 1/2 + 2/3 + ... + i/(i + 1)  
Write a test program that displays a table.

#### 0514 (Estimate pi) 
Pi can be computed using the following series:  
pi = 4(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + (-1)<sup>(i+1)</sup> / (2i - 1)  
Write a function that returns m(i) for a given i and write a test program that displays a table.

#### 0526 (Palindromic prime) 
A palindromic prime is a prime number that is also palindromic.  
For example, 131 is a prime and also a palindromic prime, as are 313 and
757. Write a program that displays the first 100 palindromic prime numbers. Display
10 numbers per line.

#### 0527 (Emirp) 
An emirp ( prime spelled backward) is a nonpalindromic prime number
whose reversal is also a prime. For example, both 17 and 71 are prime numbers, so
17 and 71 are emirps. Write a program that displays the first 100 emirps. Display
10 numbers per line.

#### 0528 (Mersenne prime) 
A prime number is called a Mersenne prime if it can be written
in the form for some positive integer p. Write a program that finds all
Mersenne primes with p <= 19 and displays the output as follows:
p 2^p - 1
2 3
3 7
5 31
...

#### 0529 (Twin primes) 
Twin primes are a pair of prime numbers that differ by 2. For example,
3 and 5, 5 and 7, and 11 and 13 are twin primes. Write a program to find all
twin primes less than 1,000. Display the output as follows:
(3, 5)  
(5, 7)  
...

#### 0535 (Compute the probability)
Generate 10,000 uppercase letters and count the occurrence of A.

#### 0536 (Generate random characters) 
Print 100 uppercase letters and then 100 single digits, printing ten
per line.


















