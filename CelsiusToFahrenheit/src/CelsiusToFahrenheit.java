import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.print("Celsius - ");
        Scanner console = new Scanner(System.in);
        double Celsius = Double.parseDouble(console.nextLine());
        double Fahrenheit = (Celsius * 1.8)+32;
        System.out.printf("Fahrenheit - %.2f ", Fahrenheit);
    }
}
