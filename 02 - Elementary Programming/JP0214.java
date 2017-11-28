/*
2.14 (Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
that one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Here is
a sample run:
Enter weight in pounds: 95.5
Enter height in inches: 50
BMI is 26.8573
 */
import java.util.Scanner;
public class JP0214 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Prompt the user to enter height in inches
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        double bmi = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);

        System.out.print("BMI is " + bmi);
    }

}
