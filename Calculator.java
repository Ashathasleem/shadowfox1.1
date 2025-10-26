package frontend.backend;

public class Calculator {

    // ----- Basic Arithmetic -----
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return Double.NaN;
        }
        return a / b;
    }

    // ----- Scientific Calculations -----
    public double squareRoot(double a) {
        if (a < 0) {
            System.out.println("Error: Cannot find square root of a negative number!");
            return Double.NaN;
        }
        return Math.sqrt(a);
    }

    public double exponent(double base, double power) {
        return Math.pow(base, power);
    }

    // ----- Temperature Conversion -----
    public double celsiusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    public double fahrenheitToCelsius(double f) {
        return (f - 32) * 5/9;
    }

    // ----- Currency Conversion (example static rates) -----
    public double inrToUsd(double inr) {
        double rate = 0.012; // example rate
        return inr * rate;
    }

    public double usdToInr(double usd) {
        double rate = 83.0; // example rate
        return usd * rate;
    }
}
