package ExceptionHandlingAssignment.temperature;

import java.util.Scanner;

public class TemperatureConversionTool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();
        System.out.print("Enter unit (C/F): ");
        String unit = sc.next().trim().toUpperCase();
        try {
            if (unit.equals("C")) {
                if (temp < -273.15) throw new InvalidTemperatureException("Temperature below absolute zero!");
                double f = temp * 9/5 + 32;
                System.out.println("Fahrenheit: " + f);
            } else if (unit.equals("F")) {
                if (temp < -459.67) throw new InvalidTemperatureException("Temperature below absolute zero!");
                double c = (temp - 32) * 5/9;
                System.out.println("Celsius: " + c);
            } else {
                System.out.println("Invalid unit.");
            }
        } catch (InvalidTemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
