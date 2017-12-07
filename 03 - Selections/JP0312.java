/*
3.12 (Check a number) Write a program that prompts the user to enter an integer and
checks whether the number is divisible by both 5 and 6, divisible by 5 or 6, or just
one of them (but not both).
 */

import java.util.Scanner;

public class JP0312 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Prompt to enter an integer
    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    if (number % 5 == 0 && number % 6 == 0)
      System.out.println(number + " is divisible by both 5 and 6");
    else if (number % 5 == 0 ^ number % 6 == 0)
      System.out.println(number + " is divisible by either 5 or 6, but not both");
    else
      System.out.println(number + " is not divisible by either 5 or 6");
  }
}
