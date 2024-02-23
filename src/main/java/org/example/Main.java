package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public static int factorial(int x) {
        if (x == 0)
            return 1;
        else
            return x * factorial(x - 1);
    }

    public static double naturalLogarithm(double x) {
        return Math.log(x);
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        do {
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural logarithm");
            System.out.println("4. Power function");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);
            switch (choice) {
                case '1':
                    System.out.print("Enter a number: ");
                    double number = scanner.nextDouble();
                    System.out.println("Square root: " + squareRoot(number));
                    break;
                case '2':
                    System.out.print("Enter a number: ");
                    int num = scanner.nextInt();
                    System.out.println("Factorial: " + factorial(num));
                    break;
                case '3':
                    System.out.print("Enter a number: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Natural logarithm: " + naturalLogarithm(num1));
                    break;
                case '4':
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Power: " + power(base, exponent));
                    break;
                case '5':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != '5');
        scanner.close();
    }
}