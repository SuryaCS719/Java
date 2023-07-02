import java.util.Scanner;

// Main class for calculator operations
public class CalculatorApp {
    // Define the Calculator interface
    interface Calculator {
        double calculate(double a, double b);
    }

    // Implement the Calculator interface for different operations
    static class Addition implements Calculator {
        @Override
        public double calculate(double a, double b) {
            return a + b;
        }
    }

    static class Subtraction implements Calculator {
        @Override
        public double calculate(double a, double b) {
            return a - b;
        }
    }

    static class Multiplication implements Calculator {
        @Override
        public double calculate(double a, double b) {
            return a * b;
        }
    }

    static class Division implements Calculator {
        @Override
        public double calculate(double a, double b) {
            return a / b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. All operations");
        System.out.println("6. Exit");

        int operationChoice = scanner.nextInt();

        while (operationChoice != 6) {
            Calculator calculator;

            switch (operationChoice) {
                case 1:
                    calculator = new Addition();
                    System.out.println("Addition: " + calculator.calculate(num1, num2));
                    break;
                case 2:
                    calculator = new Subtraction();
                    System.out.println("Subtraction: " + calculator.calculate(num1, num2));
                    break;
                case 3:
                    calculator = new Multiplication();
                    System.out.println("Multiplication: " + calculator.calculate(num1, num2));
                    break;
                case 4:
                    calculator = new Division();
                    System.out.println("Division: " + calculator.calculate(num1, num2));
                    break;
                case 5:
                    calculator = new Addition();
                    System.out.println("Addition: " + calculator.calculate(num1, num2));
                    calculator = new Subtraction();
                    System.out.println("Subtraction: " + calculator.calculate(num1, num2));
                    calculator = new Multiplication();
                    System.out.println("Multiplication: " + calculator.calculate(num1, num2));
                    calculator = new Division();
                    System.out.println("Division: " + calculator.calculate(num1, num2));
                    break;
                default:
                    System.out.println("Invalid operation choice.");
                    break;
            }

            System.out.println("Choose another operation:");
            operationChoice = scanner.nextInt();
        }

        System.out.println("Exiting the program...");
    }
}
