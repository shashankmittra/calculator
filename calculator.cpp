#include <iostream>
#include <cmath>

class Calculator {
public:
    double squareRoot(double x) {
        return sqrt(x);
    }

    double factorial(int x) {
        if (x == 0 || x == 1)
            return 1;
        else
            return x * factorial(x - 1);
    }

    double naturalLog(double x) {
        return log(x);
    }

    double power(double base, double exponent) {
        return pow(base, exponent);
    }
};

int main() {
    Calculator calc;
    char choice;
    do {
        int option;
        double num, base, exponent;
        
        std::cout << "Select an option for calculation:" << std::endl;
        std::cout << "1. Square root" << std::endl;
        std::cout << "2. Factorial" << std::endl;
        std::cout << "3. Natural logarithm" << std::endl;
        std::cout << "4. Power" << std::endl;
        std::cout << "5. Exit" << std::endl;
        std::cin >> option;
        
        switch(option) {
            case 1:
                std::cout << "Enter a number: ";
                std::cin >> num;
                std::cout << "Square root of " << num << " is: " << calc.squareRoot(num) << std::endl;
                break;
            case 2:
                std::cout << "Enter an integer: ";
                std::cin >> num;
                std::cout << "Factorial of " << num << " is: " << calc.factorial((int)num) << std::endl;
                break;
            case 3:
                std::cout << "Enter a number: ";
                std::cin >> num;
                std::cout << "Natural logarithm of " << num << " is: " << calc.naturalLog(num) << std::endl;
                break;
            case 4:
                std::cout << "Enter base: ";
                std::cin >> base;
                std::cout << "Enter exponent: ";
                std::cin >> exponent;
                std::cout << base << " raised to the power " << exponent << " is: " << calc.power(base, exponent) << std::endl;
                break;
            case 5:
                std::cout << "Exiting..." << std::endl;
                return 0;
            default:
                std::cout << "Invalid option! Please try again." << std::endl;
        }
        
        std::cout << "Do you want to perform another operation? (y/n): ";
        std::cin >> choice;
    } while (choice == 'y' || choice == 'Y');
    
    return 0;
}

