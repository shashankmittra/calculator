package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("****Welcome to Scientific Calculator Menu****");
            System.out.println("1. Square Root Function");
            System.out.println("2. Factorial Function");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power Function");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a number for which you want to calculate the square root:");
                    double squareRootNumber = scanner.nextDouble();
                    double squareRootResult = Math.sqrt(squareRootNumber);
                    System.out.println("The square root of the number is: " + squareRootResult);
                    break;
                case 2:
                    System.out.println("Enter a number for which you want to calculate the factorial:");
                    int factorialNumber = scanner.nextInt();
                    int factorialResult = 1;
                    for (int i = 1; i <= factorialNumber; i++) {
                        factorialResult *= i;
                    }
                    System.out.println("The factorial of the number is: " + factorialResult);
                    break;
                case 3:
                    System.out.println("Enter a number for which you want to calculate the natural logarithm:");
                    double logarithmNumber = scanner.nextDouble();
                    double logarithmResult = Math.log(logarithmNumber);
                    System.out.println("The natural logarithm of the number is: " + logarithmResult);
                    break;
                case 4:
                    System.out.println("Enter the base:");
                    double base = scanner.nextDouble();
                    System.out.println("Enter the exponent:");
                    double exponent = scanner.nextDouble();
                    double powerResult = Math.pow(base, exponent);
                    System.out.println("The result of raising " + base + " to the power of " + exponent + " is: " + powerResult);
                    break;
                case 5:
                    System.out.println("Exiting from the application");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again...");
            }
        } while (choice != 5);
        scanner.close();
    }
}