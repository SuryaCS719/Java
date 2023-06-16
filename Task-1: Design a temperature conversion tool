// Task-1: Design a temperature conversion tool

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Conversion Tool");
        System.out.println("===========================");

        int choice;
        do {
            System.out.println("\nSelect conversion type:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("0. Exit");
            System.out.print("\nEnter your choice (0, 1, or 2): ");
            choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the program.");
                break;
            }

            System.out.print("Enter the temperature value: ");
            double temperature = scanner.nextDouble();

            double convertedTemperature;
            String fromUnit, toUnit;

            if (choice == 1) {
                convertedTemperature = celsiusToFahrenheit(temperature);
                fromUnit = "Celsius";
                toUnit = "Fahrenheit";
            } else if (choice == 2) {
                convertedTemperature = fahrenheitToCelsius(temperature);
                fromUnit = "Fahrenheit";
                toUnit = "Celsius";
            } else {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.printf("%.2f %s is equal to %.2f %s%n", temperature, fromUnit, convertedTemperature, toUnit);
        } while (true);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
