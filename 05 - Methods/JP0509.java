/*
6.9 (Conversions between feet and meters) Write a class that contains the following
two methods:
Convert from feet to meters
public static double footToMeter(double foot)
Convert from meters to feet
public static double meterToFoot(double meter)
        The formula for the conversion is:
        meter = 0.305 * foot
        foot = 3.279 * meter
        Write a test program that invokes these methods to display the following tables:
 */

public class JP0509 {
    public static void main(String[] args) {
        System.out.println("Feet\t\tMeters\t|\tMeters\t\tFeet");
        System.out.println("-----------------------------------------------");

        double feet = 1.0; double meter = 20.0;
        for (int i = 1; i <= 10; feet++, meter += 5, i++) {
            System.out.printf("\n%.2f\t\t %.3f\t\t|\t %.2f\t\t %.3f\t\t ", feet,  footToMeter(feet),
                    meter, meterToFoot(meter));
        }
    }

    public static double footToMeter(double foot) {

        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {

        return 3.279 * meter;
    }
}
