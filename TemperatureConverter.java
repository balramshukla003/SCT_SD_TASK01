import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1: Celsius to Fahrenheit");
        System.out.println("2: Celsius to Kelvin");
        System.out.println("3: Fahrenheit to Celsius");
        System.out.println("4: Fahrenheit to Kelvin");
        System.out.println("5: Kelvin to Celsius");
        System.out.println("6: Kelvin to Fahrenheit");
        System.out.print("Choose an option (1-6): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();
        double result = 0.0;

        switch (choice) {
            case 1: // Celsius to Fahrenheit
                result = celsiusToFahrenheit(temperature);
                System.out.println(temperature + "°C = " + result + "°F");
                break;
            case 2: // Celsius to Kelvin
                result = celsiusToKelvin(temperature);
                System.out.println(temperature + "°C = " + result + "K");
                break;
            case 3: // Fahrenheit to Celsius
                result = fahrenheitToCelsius(temperature);
                System.out.println(temperature + "°F = " + result + "°C");
                break;
            case 4: // Fahrenheit to Kelvin
                result = fahrenheitToKelvin(temperature);
                System.out.println(temperature + "°F = " + result + "K");
                break;
            case 5: // Kelvin to Celsius
                result = kelvinToCelsius(temperature);
                System.out.println(temperature + "K = " + result + "°C");
                break;
            case 6: // Kelvin to Fahrenheit
                result = kelvinToFahrenheit(temperature);
                System.out.println(temperature + "K = " + result + "°F");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    private static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    private static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    private static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }
}
