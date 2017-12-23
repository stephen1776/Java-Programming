/*
5.8 (Conversions between Celsius and Fahrenheit) Write a class that contains the following
two methods:
Convert from Celsius to Fahrenheit
public static double celsiusToFahrenheit(double celsius)
Convert from Fahrenheit to Celsius
public static double fahrenheitToCelsius(double fahrenheit)
        The formula for the conversion is:
        fahrenheit = (9.0 / 5) * celsius + 32
        celsius = (5.0 / 9) * (fahrenheit – 32)
 */

public class JP0508 {
    public static void main(String[] args) {
        System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\tCelsius");
        System.out.println("-----------------------------------------------");

        double celsius = 40; double fahrenheit = 120;
        for (int i = 1; i <= 10; celsius--, fahrenheit -= 10, i++) {
            System.out.printf("\n%.2f\t\t %.2f\t\t|\t %.2f\t\t %.2f\t\t ", celsius,  celsiusToFahrenheit(celsius),
                    fahrenheit, fahrenheitToCelsius(fahrenheit));
        }
    }

    public static double celsiusToFahrenheit(double celsius) {

        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {

        return (5.0 / 9) * (fahrenheit - 32);
    }
}
